package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class AssignmentStudents {
    public static void main(String[] args) {
        byte[] gradesArr = new byte[10];
        enterGrade(gradesArr);
        countFailed(gradesArr);
        countAgrades(gradesArr);
        countStud(gradesArr);
    }

    public static void enterGrade (byte [] gradesArr) {
        int i = 0;
        int orderNum = 1;

        while (orderNum <= gradesArr.length) {
            Scanner inputGrade = new Scanner(System.in);
            System.out.println("Please enter grade the grade of student #" + orderNum);
            byte grade = inputGrade.nextByte();
            //Edgar, I still do not understand how to use this hasNextShort(), maybe you could show?

            if (grade >= 0 && grade <= 10) {
                gradesArr[i++] = grade;
                orderNum++;
            } else {
                System.out.println("Incorrect grade. Grade is from 0 till 10. Try one more time!");
            }
            //input.close(); //WTF, why it is red again?
        }
        System.out.println();
        System.out.println("You entered following grades:");
        for (int p = 0; p < gradesArr.length; p++) {
            System.out.println(gradesArr[p]);
        }
    }


    public static void countFailed (byte [] gradesArr) {
        System.out.println();
        int countMult = 0;
        for (int m = 0; m < gradesArr.length; m++) {
            if (gradesArr[m] < 4) {
                countMult++;
            }
        }
        System.out.println(countMult != 0 ? "The number of students who failed equals: " + countMult :
                "There is no students who failed");
    }

        public static void countAgrades (byte [] gradesArr) {
        System.out.println();
        int countMultA = 0;
        for (int a = 0; a < gradesArr.length; a++) {
            if (gradesArr[a] == 10) {
                countMultA++;
            }
        }
        System.out.println(countMultA != 0 ? "The number of students who got grade A equals: " + countMultA :
                "There is no students who got the grade A");

    }

    public static void countStud (byte [] gradesArr) {
        System.out.println();
        int gradehist = 0;
        while (gradehist <= 10) {
            int studNum = 0;
            for (int stud : gradesArr) {
                if (stud == gradehist) {
                    studNum++;
                }
            }
            System.out.println(studNum + " students with the grade " + gradehist);
            gradehist++;
        }
    }
}



