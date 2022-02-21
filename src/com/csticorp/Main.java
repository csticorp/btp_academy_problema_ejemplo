package com.csticorp;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        //Ruta de archivo de entrada
        String inputFile = "C:\\Users\\Usuario\\OneDrive - CHAIN SERVICES TI SAC\\ACADEMIA_BTP_EXAMEN\\input.txt";

        //Ruta de archivo de salida
        String outputFile ="C:\\Users\\Usuario\\OneDrive - CHAIN SERVICES TI SAC\\ACADEMIA_BTP_EXAMEN\\output.txt";

        //Se valida el archivo de entrada
        try(BufferedReader br = new BufferedReader(new FileReader(inputFile) )) {
            //Se crea el archivo de salida
            FileWriter fw = new FileWriter(outputFile);
            //Se iteran todas las lineas del archivo de entrada
            for(String line; (line = br.readLine()) != null; ) {
                //Se convierten las cantidades de String a Int
                int[] numbers = Arrays.stream(line.split(";")).mapToInt(Integer::parseInt).toArray();
                //Se suman las cantidades de cada caja
                int sum = IntStream.of(numbers).sum();

                //Se escribe la respuesta en el archivo de salida con un salto de linea para separar la respuesta de cada linea.
                fw.write(sum+"\n");
            }
            //Cerramos el archivo
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
