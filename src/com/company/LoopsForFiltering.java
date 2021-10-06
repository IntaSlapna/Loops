package com.company;

public class LoopsForFiltering {
    public static void main(String[] args) {
        int[] array = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

        System.out.println("Negative numbers in this array: ");
        for(int i= array.length-1; i>=0; i--){
            if (array[i]<0){
                System.out.println(array[i]);
            }
        }
        System.out.println("Odd numbers in this array: ");



    }

}
