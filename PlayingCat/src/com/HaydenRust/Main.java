package com.HaydenRust;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 33));
    }

    public static boolean isCatPlaying (boolean summer, int temperature){
        if (summer){
            if (summer = (temperature >=25 && temperature <= 45)) {
                return true;
            }
        }
        else if (temperature >= 25 && temperature <= 35){
            return true;
        }
        return false;
    }
}
