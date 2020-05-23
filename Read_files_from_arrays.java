package com.foundation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read_files_from_arrays {
    public static void main(String[] args) throws IOException {
        int [] values = new int [10];

        int i = 0;

        File file = new File("values.txt");

        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext() && i < values.length)    //Checking end of the file
            {
                values[i] = inputFile.nextInt();
                i++;    //Loop control variable

            }
            inputFile.close();

            for (int value : values)
            {
                System.out.println(value);
            }
        }
    }
}
