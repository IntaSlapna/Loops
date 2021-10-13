package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class AssignmentStudents {
    public static void main(String[] args) {
        byte[] gradesArr = new byte[10];

        for(int c=0; c<gradesArr.length; c++) {
            System.out.println("Please enter the grade " +(c+1));
            Scanner input = new Scanner(System.in);
            gradesArr[c] = input.nextByte();
            //awEif(gradesArr[c] >= 0 && <= 10)
        }
        //input.close(); why shows red if uncomment??

        System.out.println();
        System.out.println("You entered theese grades:");
        for(int c=0; c<gradesArr.length; c++) {
            System.out.println(gradesArr[c]);
        }

        byte i = 0;
        while (i < gradesArr.length) {


        }

    }
}

