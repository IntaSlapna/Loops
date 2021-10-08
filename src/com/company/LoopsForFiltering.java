package com.company;

import java.util.Arrays;

public class LoopsForFiltering {
    public static void main(String[] args) {
        int[] arr = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

        System.out.println("Negative numbers in this array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println();
        System.out.println("Odd numbers in this array: ");
        for (int o = 0; o < arr.length; o++) {
            if (arr[o] % 2 != 0) {
                System.out.println(arr[o]);
            }
        }
        System.out.println();
        int count = 0;
        for (int evenNum : arr) {
            if (evenNum % 2 == 0 && evenNum != 0)
                count++;
        }
        System.out.println("The number of even numbers in this array equals: " + count);

        System.out.println();
        boolean check = true;
        int countMult = 0;
        for (int m = 0; m < arr.length; m++) {
            for (int l = m + 1; l < arr.length; l++) {
                if (arr[m] == arr[l] && m != l) {
                    countMult++;
                }
            }
        }
        System.out.println(countMult != 0 ? "The number of similar pair of numbers equals: " + countMult :
                "There is no multiple elements with the same value");

        System.out.println();
        System.out.println("Every second number of array looks this: ");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }

        System.out.println();
        int lenght = arr.length;
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum += arr[a];
        }
        double average = sum / lenght;
        System.out.println("The average sum of array elements equals: " + average);

        System.out.println();
        System.out.println("The numbers of arrays which are smaller then average sum of array elements: ");
        for (int c = 0; c < arr.length - 1; c++) {
            if (average>arr[c]) {
                    System.out.println(arr[c]);
                }
            }
        }
}





