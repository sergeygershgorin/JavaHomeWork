package com.pb.gershgorin.hw9;

import java.util.concurrent.ThreadLocalRandom;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNumbers {

    public static void createNumbersFile()
    {
        int[][] arrRand = new int[10][10];
        for (int i = 0; i < arrRand.length; i++)
        {
            for (int j = 0; j < arrRand.length; j++)
            {
                arrRand[i][j] = ThreadLocalRandom.current().nextInt(1, 100);
            }
        }
        String[] nLine = new String[10];
        for (int n = 0; n < arrRand.length; n++)
        {
            String result = "";
            for (int l = 0; l < arrRand.length; l++){
                result += arrRand[n][l] + " ";
            }
            nLine[n] = result;
        }
        Path path = Paths.get("numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path))
        {
            for (int x = 0; x < nLine.length; x++)
            {
                writer.write(nLine[x]);
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void createOddNumbersFile()
    {
        String[] nLine2 = new String[10];
        Path path = Paths.get("numbers.txt");
        try (BufferedReader reader = Files.newBufferedReader(path))
        {
            String newLine;
            int j = 0;
            while((newLine = reader.readLine()) != null)
            {
                String arrOdd = "";
                String[] arr = newLine.split(" ");
                for (int i = 0; i < arr.length; i++)
                {
                    if(Integer.parseInt(arr[i])%2 == 0)
                    {arrOdd += + 0 + " ";}
                    else {arrOdd +=  arr[i] + " ";}
                }
                nLine2[j] = arrOdd;
                j++;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        Path path1 = Paths.get("odd-numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path1)) {
            writer.write(nLine2[0]);
            writer.newLine();
            writer.write(nLine2[1]);
            writer.newLine();
            writer.write(nLine2[2]);
            writer.newLine();
            writer.write(nLine2[3]);
            writer.newLine();
            writer.write(nLine2[4]);
            writer.newLine();
            writer.write(nLine2[5]);
            writer.newLine();
            writer.write(nLine2[6]);
            writer.newLine();
            writer.write(nLine2[7]);
            writer.newLine();
            writer.write(nLine2[8]);
            writer.newLine();
            writer.write(nLine2[9]);
            writer.newLine();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Generated files...");
        createNumbersFile();
        createOddNumbersFile();
    }
}