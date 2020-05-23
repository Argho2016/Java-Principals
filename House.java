package com.example.classes;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class House {  // A Basic Class
    private int noOfWindows;
    private int noOfDoors;
    private String typeOfRoof;
    private String typeOfWall;

    public House()  //Constructor (sets the values at the top)
    {
        noOfDoors = 0;   //No argument constructor
        noOfWindows = 0;
        typeOfRoof = null;
        typeOfWall = null;
    }

    public House(int noOfWindows, int noOfDoors, String typeOfRoof, String typeOfWall)  //Methods
    {
        this.noOfWindows = noOfDoors;   //This refers to the object that will be created. It refers the value at the top of this code
        this.noOfWindows = noOfWindows;
        this.typeOfRoof = typeOfRoof;
        this.typeOfWall = typeOfWall;
    }

    //Getter methods, gets the value from a specific property
    public int getNoOfWindows()
    {
        return noOfWindows;
    }

    public int getNoOfDoors() {   //Generate >> getter >> select
        return noOfDoors;
    }

    public String getTypeOfRoof() {
        return typeOfRoof;
    }

    public String getTypeOfWall() {
        return typeOfWall;
    }

    //Setter Methods, sets the value to the objects value

    public void setNoOfWindows(int noOfWindows) {
        this.noOfWindows = noOfWindows;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public void setTypeOfRoof(String typeOfRoof) {
        this.typeOfRoof = typeOfRoof;
    }

    public void setTypeOfWall(String typeOfWall) {
        this.typeOfWall = typeOfWall;
    }
}
