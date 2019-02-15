package com.bolshak.lessons.lesson1;

import java.util.Scanner;

public class Lesson1Runner {

    public static void main(String[] args) {
        inputName();
        printJava();
    }

    private static void inputName() {

        System.out.print("Enter name -> ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

    }

    private static void printJava() {
        System.out.println("  * *       *      *        *      * ");
        System.out.println("*   *     *   *    *        *    *   *");
        System.out.println("    *    *     *   *        *   *     *");
        System.out.println("    *   * ***** *   *      *   * ***** *");
        System.out.println("    *  *         *   *    *   *         *");
        System.out.println("*   *  *         *    *  *    *         *");
        System.out.println(" ***   *         *      *     *         *");
    }
}
