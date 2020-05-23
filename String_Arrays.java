package com.foundation;

public class String_Arrays {
    public static void main(String[] args) {
        String [] names = getNames();

        for (int i = 0;  i < names.length; i++)
        {
            if (names[i] != null){
                System.out.println(names[i].charAt(0));
            }
        }
    }

    public static  String [] getNames()
    {
        String [] names = new String[6];

        names[0] = "John";
        names[1] = "Peter";
        names[2] = "Simon";
        names[3] = "paul";
        names[4] = "John Cena";
        names[0] = null;

        return names;

    }
}
