package com.csticorp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String file = "";
        try(BufferedReader br = new BufferedReader(new FileReader(file) )) {
            for(String line; (line = br.readLine()) != null; ) {
                System.out.println(line);
            }
            // line is not visible here.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
