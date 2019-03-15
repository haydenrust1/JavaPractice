package com.HaydenRust;

public class Main {

    public static void main(String[] args) {
        printConversion(2);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour >= 0) {

            return Math.round(kilometersPerHour / 1.609D);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) + "mi/h");
        }

    }


}
