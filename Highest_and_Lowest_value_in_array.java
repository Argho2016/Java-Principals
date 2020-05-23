package com.foundation;

public class Highest_and_Lowest_value_in_array {
    public static void main(String[] args) {

        //Printing highest values
        int [] numbers = {2,4,6,8,10,11,15,1};

        int Highest = numbers[0];   //2 is set to highest value

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > Highest)
            {
                Highest = numbers[i];
            }
        }
        System.out.println("The Highest value is: " + Highest);

        //Printing lowest values
        int loweest = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < loweest)
            {
                loweest = numbers[i];
            }
        }
        System.out.println("The Lowest value is: " + loweest);

        //Average of all the values
        int [] val = {1,2,3};

        int sum = 0;

        for (int i = 0; i < val.length; i++)
        {
            sum = sum + val[i];
        }

        //Doing the average

        double avg = (double) sum / val.length;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is : " + avg);
    }
}
