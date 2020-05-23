package com.foundation;

public class Array_and_Class {
    public static void main(String[] args) {
        //Arrays
        int [] numbers = new int[4];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;

        int [] number2 = {10,20,30,40};

        for (int i = 0; i< numbers.length; i++)
        {
           System.out.println(number2[i]);
        }
        System.out.println();

        for (int val : number2)
        {
            System.out.println(val);
        }
    }
}
