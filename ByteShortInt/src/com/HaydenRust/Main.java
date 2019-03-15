package com.HaydenRust;

public class Main {

    public static void main(String[] args) {
       byte myFirstByte = (byte) 10;

       short myFirstShort = (short) 10;

       int myFirstInt = 10;

       long myFirstLong = 5000L + 10L * (myFirstByte+ myFirstShort + myFirstInt);
       System.out.println("myFirstLong = " + myFirstLong);
    }
}
