package com.HaydenRust;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,22));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay <= 23 && hourOfDay > 22 || hourOfDay < 8 && hourOfDay >=0){
                return true;
            } else if (hourOfDay < 23 || hourOfDay > 0) {
                return false;
            } else if (!barking) {
                return false;
            }
        }
        return false;
    }
}
