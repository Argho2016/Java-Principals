package com.foundation;

public class Copy_Arrays {
    public static void main(String[] args) {
        int [] array1 = {2,4,6,8,10}; //size 5

    //Two arrays are pointing to the same object
        //int [] array2 = array1;

        //array1[1] = 5;        //Confirming the matter

//Correct way to copy array
        int [] array2 = new int[array1.length];

        for (int i = 0; i< array1.length; i++)
        {
            array2[i] = array1[i];
        }
        array1[1] = 5;    //change confirmed
        printarray(array1);
        System.out.println();
        printarray(array2);

    }

    public static void printarray(int [] array) {
        for (int value : array)
        {
            System.out.println(value);
        }

    }
}
