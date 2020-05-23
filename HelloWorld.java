package com.foundation;

import javax.swing.*;
import javax.xml.namespace.QName;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        /*
        this is for data types

       System.out.print("Argho Das");
       int firstnum;
       int secondnum;

       firstnum = 11;
       secondnum = 12;

       float avg = (firstnum + secondnum) / 2;
       System.out.println("Average is " +avg);

       String name = "Argho DAs";
       System.out.println(name + "" + name );

       boolean value;
       value = true;

       char letter;
       letter= 'a';

This is for taking inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first number");
        firstnum = input.nextInt();
        System.out.println("Please Enter the second number");
        secondnum = input.nextInt();
        int sum = firstnum +secondnum;
        System.out.println("The final answer is " + sum);
*/

        /*
        Taking input through box and pharsing

        String name = JOptionPane.showInputDialog("Please Enter your name");

        String surname = JOptionPane.showInputDialog("Please Enter your surname");

        JOptionPane.showMessageDialog(null, name + " " + surname);

        int firstnum;
        int secnum;
        String input;

        input = JOptionPane.showInputDialog("Please Enter your first number: ");
        firstnum = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Please Enter your second number: ");
        secnum = Integer.parseInt(input);

        double average = (firstnum + secnum) / 2.0;
        JOptionPane.showMessageDialog(null, "Average " + average);
*/
//This is how you comment

        //logical Operators
/*
        int x = 5;
        int y = 6;
        int p = 7;

        boolean expressions = x == y;
        boolean exp = x > y || y < p;

        System.out.println(expressions);
        System.out.println(exp);
*/

        //IF statements
        /*
      String input;
       input = JOptionPane.showInputDialog("Please Enter a number: ");
       int number = Integer.parseInt(input);

       if (number == 5)
       {
           JOptionPane.showMessageDialog(null, "The Number is exactly 5! ");
       }

        if (number > 5)
        {
            JOptionPane.showMessageDialog(null, "The Number is greater than 5! ");
        }

        else if (number < 5)
        {
            JOptionPane.showMessageDialog(null, "The Number is less than 5! ");
        }

        else
        {
            JOptionPane.showMessageDialog(null, "The number is stupid");
        }
        System.exit(0);
*/
        //Compare Strings
        /*
        String nname1 = JOptionPane.showInputDialog("Please Enter name 1");
        String nname2 = JOptionPane.showInputDialog("Please Enter name 2");

        if (nname1.equals(nname2))
        {
            System.out.println("name1 is equal to name 2");
        }
        else if (nname1.compareTo(nname2) < 0)
        {
            System.out.println("name1 is first than name 2");
        }
        else if (nname1.compareTo(nname2) > 0)
        {
            System.out.println("name2 is first than name 1");
        }*/

        //The Switch Statement
        /*
        int number;

        String input = JOptionPane.showInputDialog("Please enter 1,2 or 3");

        number = Integer.parseInt(input);

        switch (number)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "You entered 1");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "You entered 2");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "You entered 3");
                break;

            default:
                JOptionPane.showMessageDialog(null, "You did not enter the right number");
                break;
        }*/
        //While Loops
/*
        int x = 0; //loop control variable

        while(x < 5)
        {
            System.out.println("Hello WOrld");
            x = x + 1; //x++;
        }

        //Do While
        int y = 0; //loop control variable

        do {
            System.out.println("Hello world!!!");
            y++;
        }while (y < 5);

        //The for loop
        for ( int i = 0; i < 5; i++) //Pre test loop
        {
            System.out.println("I am king");
        }*/

//Useful loop calculations
        //Input validations
/*
        String input = JOptionPane.showInputDialog("Please enter a number in the range of 1 through 100");
        int number = Integer.parseInt(input);

        while (number < 1 || number > 100)
        {
            JOptionPane.showMessageDialog(null, "That number is not valid");
            input = JOptionPane.showInputDialog("Please enter a number in the range of 1 through 100");
            number = Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null, "Correct!!!");*/

        //User control loops
        /*
        int maxval;
        String input = JOptionPane.showInputDialog("How high should I go to square the number?");
        maxval = Integer.parseInt(input);

        System.out.println("Number    Number squared");
        System.out.println("------------------------");

        for (int number = 1; number <= maxval; number++ )
        {
            System.out.println(number + "\t\t\t" + number*number);
        }*/

        //Running Totals
/*
        int days;
        double sales;
        double totalSales = 0.0; //running totals
        String input;

        input = JOptionPane.showInputDialog("For how many days do you have sales" + "figures?");

        days = Integer.parseInt(input);

        for (int count = 1; count <= days; count++)
        {
            input = JOptionPane.showInputDialog("Enter the sales for the day " + count);

            sales = Double.parseDouble(input);

            totalSales =+ sales;

        }
        JOptionPane.showMessageDialog(null, "The total sales are: $" + totalSales);
        System.exit(0);*/

        //Sentinel Values
/*
        int value;
        int doublevalue;

        String input = JOptionPane.showInputDialog("Please enter a value to double " + "(0 to stop)"); //0 is my sentinel value

        value = Integer.parseInt(input);

        while (value != 0)
        {
            doublevalue = value * 2;
            JOptionPane.showMessageDialog(null, "" + value + "doubled it" + doublevalue);
            input = JOptionPane.showInputDialog("Please enter a value to double " + "(0 to stop)"); //0 is my sentinel value

            value = Integer.parseInt(input);*/

        //Writing to files
        //create the file if not exists
        //If it exists then it replaeces the file
        /*
        PrintWriter outfile = new PrintWriter("Output.txt");
        outfile.println("This is line 1");
        outfile.println("This is line 2");
        outfile.println("This is line 3");

        outfile.close();
        */

        //Reading from files
        /*
        File file = new File("Output.txt");

        if (file.exists())
        {
            Scanner inputfile = new Scanner(file);

            //System.out.println(inputfile.nextLine());
            //System.out.println(inputfile.nextLine());
            //System.out.println(inputfile.nextLine());

            while ( inputfile.hasNext())
            {
                System.out.println(inputfile.nextLine());
            }
            inputfile.close();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The file does not exist");

        }

        //Methods
        //A void method is one that simply performs a task and then terminates
        //system.out is a void method
        //a value returning method not only performs a task but also sends value back to the code that called it
        //int number = Integer.parse is a value returning method

        printAverage(20, 30);
        double average = printdouble(30, 80);
        System.out.println("Average: " + average);
        String full = fullName("John", "Cena");  */



    }

    //Some methods for example
    /*
    public static void printAverage(int val1, int val2) {
        double average = (val1 + val2) / 2.0;
        System.out.println("Average: " + average);
    }

    public static double printdouble(int val1, int val2) {
        double average = (val1 + val2) / 2.0;
        return average;
    }

    public static  String fullName(String name, String surname)
        {
            String full = name + " " + surname;
            return full;
        }*/

}


