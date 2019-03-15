package com.HaydenRust;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(isTeen(15));
    }

    public static boolean hasTeen(int teenOne, int teenTwo, int teenThree) {
        if ((isTeen(teenOne)) || (isTeen(teenTwo)) || (isTeen(teenThree))){
            return true;
        }return false;
    }

    public static boolean isTeen ( int anotherTeen){
        return (anotherTeen <= 19 && anotherTeen >= 13);
    }

}
