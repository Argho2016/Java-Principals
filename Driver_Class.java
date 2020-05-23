package com.example.classes;

public class Driver_Class {
    public static void main(String[] args) {
        House house = new House(10, 20, "Tiles", "Asman");
        //creating a new object, hold the memory location of the object


        house.setTypeOfWall("Plaster");
        System.out.println("No of windows: " + house.getNoOfWindows());
        System.out.println("No of doors: " + house.getNoOfDoors());


    }
}
