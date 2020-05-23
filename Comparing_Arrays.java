package com.foundation;

public class Comparing_Arrays {
    public static void main(String[] args) {
        int [] numbers1 = {2,4,6,8,10};
        //int [] numbers2 = numbers1;
        int [] numbers2 = {2,4,6,8,10};
/*
        if (numbers1 == numbers2)
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("They are not the same");
        }*/

    //Correct way to compare arrays
        boolean arrayEqual = true;
        int i = 0;
    //Comparing lengths
        if (numbers1.length != numbers2.length)
        {
            arrayEqual = false;
        }
        //Comparing positions
        while (arrayEqual && i < numbers1.length)
        {
            if (numbers1[i] != numbers2[i])
            {
                arrayEqual = false;
            }
            i++;
        }
        if (arrayEqual)
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("They are not the same");
        }
    }
}
