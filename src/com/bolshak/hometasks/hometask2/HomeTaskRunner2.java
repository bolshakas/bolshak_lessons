package com.bolshak.hometasks.hometask2;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class HomeTaskRunner2 {
    public static void main(String[] args) {
        changeNumbers(12, 22);
        subtractionOfNumbers(543);
        printPoundsInKilograms(5);
        getProfit(2000,12,6);
    }

    private static void changeNumbers(int firstNumber, int secondNumber) {
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }

    private static void subtractionOfNumbers(int number){
        StringBuilder numberString = new StringBuilder(valueOf(number));
        String revertedString = numberString.reverse().toString();
        int revertedNumber = parseInt(revertedString);
        int result = number - revertedNumber;
        System.out.println(result);
    }

    private static void printPoundsInKilograms(int pounds){
        double kilograms = convertPoundsToKG(pounds);
        double grams = kilograms % 1;
        int gramsNumber = (int) (grams * 1000);
        int kilogramsNumber = (int) (kilograms - grams);

        System.out.println("In " + pounds + " pound(s) = " + kilogramsNumber + " kilograms and  "+ gramsNumber + " grams");
    }

    private static double convertPoundsToKG(int pounds) {
        return pounds * 0.454;
    }

    private static void getProfit(double total,double percent, int numberOfMonth) {

        double percentPerMonth = percent / 100 / 12 ;
        double profit= (total * percentPerMonth * numberOfMonth);
        System.out.println("Profit from the deposit is " + profit);
    }
}
