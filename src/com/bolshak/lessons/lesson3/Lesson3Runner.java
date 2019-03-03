package com.bolshak.lessons.lesson3;

import java.util.Scanner;

public class Lesson3Runner {
    public static void main(String[] args) {
printSumOfNumbers();
    }

    private static void getMaxNumber1() {
        int a = 10;
        int b = -5;
        int c = 0;

        if (a > b && a > c) {
            System.out.println("Max = " + a);
        } else if (b > a && b > c) {
            System.out.println("Max = " + b);
        } else {
            System.out.println("Max = " + c);
        }
    }

    private static void getMaxNumber2 (){
        int a = 10;
        int b = -5;
        int c = 0;
        int maxValue = a > b ? a:b;
        maxValue = maxValue > c ? maxValue:c;
        System.out.println("Max = " + maxValue);
    }
    private static void printNameOfNumber(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter digit number -> ");
        int digit = scanner.nextInt();

        switch (digit){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("invalid digit");
        }
    }

    private static void printTriangle(){
        int line = 1;
        while (line <=9){
            int value = line;
            while (value>=1){
                System.out.print(value);
                value--;
            }
            System.out.println();
            line++;
        }
    }
    private static void printSumOfNumbers (){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        final int TEN =10;
        number=number < 0 ? -number : number;
        int sum = 0;
        while (number>0) {
           int temp = number%TEN;
           sum += temp*temp;
           number /= TEN;
        }
        System.out.println("Sum digits = "+ sum);
    }
}
