package com.HaydenRust;

public class Main {

    public static void main(String[] args) {
	printYearsAndDays(1440);
    }

    public static void printYearsAndDays (long minutes){
        if (minutes >= 0){
            //* divided by minutes in an hour, hours in a day, days in a year.
            long years = (((minutes / 60) / 24) / 365);
            long remainingYears = minutes % 525600;
            long days = remainingYears / 1440;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        }
        else if (minutes < 0){
            System.out.println("Invalid Value");
        }

    }
}
