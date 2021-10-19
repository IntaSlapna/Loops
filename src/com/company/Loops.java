package com.company;

public class Loops {

    public static void main(String[] args) {
        loopFor();
        loopForEach();
        loopWhile();
        loopDoWhile();

    }

    public static void loopFor() {
        int[] array = {5, 3, 7, 6, 2, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            //BEST1 Print out each element using for loop
        }
    }

    public static void loopForEach() {
        int[] array = {5, 3, 7, 6, 2, 8};
        for (int tempVar : array) {
            System.out.println(tempVar);
            //BEST2 Print out each element using for each loop
        }
    }

    public static void loopWhile() {
        int[] array = {5, 3, 7, 6, 2, 8};
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
            //Print out each element using while loop
        }
    }

    public static void loopDoWhile() {
        int[] array = {5, 3, 7, 6, 2, 8};
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);
        //Print out each element using do while loop
    }
}