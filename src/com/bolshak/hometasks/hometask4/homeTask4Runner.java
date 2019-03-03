package com.bolshak.hometasks.hometask4;

import java.util.Scanner;

public class homeTask4Runner {

    public static void main(String[] args) {
        int number = getIntFromScanner();
        System.out.println("Binary number -> " + convertNumberToBinary(number));
        print(uniqueString(getStringFromScanner()));
    }

    private static String convertNumberToBinary(int number) {
        String result = "";
        while (number > 0) {
            result = ((number % 2) == 0 ? "0" : "1") + result;
            number /= 2;
        }
        return result;
    }

    private static String uniqueString(String inputtedLine) {
        char[] array = inputtedLine.toCharArray();
        String result = "";

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array.length; j++) {

                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result += array[i];
            }
        }
        return result;
    }

    private static int getIntFromScanner() {
        Scanner scanner = new Scanner(System.in);
        print("Please, enter any decimal number -> ");
        return scanner.nextInt();
    }

    private static String getStringFromScanner() {
        Scanner scanner = new Scanner(System.in);
        print("Please, enter any line -> ");
        return scanner.nextLine();
    }

    private static void print(String line) {
        System.out.println(line);
    }
}
