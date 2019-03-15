package com.HaydenRust;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber ){
        if (Math.abs(firstNumber - secondNumber) <= 0.0009){
            return true;
        }
        return false;
    }
}
