package com.foundation;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();  // Add or shrink as I am giving it values. This is a lot dynamic

        names.add("James");  //Adding values in the array
        names.add("Peter");
        names.add("John");
        names.add("Jake");
        names.add(4, "Paul"); //Goto index no four and add the value

        names.set(1, "Peters");  //Replace a value in a array specific position
        names.remove(0); //Remove a value form a array list

        for (int i = 0; i < names.size(); i++)   //Size of the values currently stored
        {
            System.out.println(names.get(i));  //Print the values from the list
        }



    }
}
