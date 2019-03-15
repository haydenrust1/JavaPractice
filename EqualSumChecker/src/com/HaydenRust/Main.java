package com.HaydenRust;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
    }

    public static boolean hasEqualSum(int valueOne, int valueTwo, int valueThree){
        if (valueOne + valueTwo == valueThree){
            return true;
        }
        return false;
    }
}
