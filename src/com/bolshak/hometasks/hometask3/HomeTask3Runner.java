package com.bolshak.hometasks.hometask3;


import java.util.ArrayList;
import static java.util.Collections.nCopies;
import static java.lang.String.join;

public class HomeTask3Runner {

    private static final String STAR_CHARACTER = "*";

    public static void main(String[] args) {
        version1();
        version2();
    }
private static void version1(){
    printFirstTriangle1();
    printFirstTriangle2();
    printSecondTriangle1();
    printThirdTriangle1();
    printFourthTriangle();
}
private static void version2(){
    printFirstTriangle3(5);
    printSecondTriangle2(5);
    printThirdTriangle2(5);
    printFifthTriangle(5);

}
    private static void printFirstTriangle1() {
        ArrayList<String> starList = new ArrayList<>();
        String starLine = "";
        {
            int i = 0;
            while (i < 4) {
                starLine += STAR_CHARACTER;
                starList.add(starLine);
                System.out.println(starLine);
                i++;
            }
        }
        int i = starList.size() - 2;
        while (i >= 0) {
            System.out.println(starList.get(i));

            i--;
        }
    }

    private static void printFirstTriangle2() {

        int firstIndex = 1;
        while (firstIndex < 5) {
            System.out.println(join("", nCopies(firstIndex, STAR_CHARACTER)));
            firstIndex++;
        }


        int secondIndex = 5;
        while (secondIndex > 0) {
            System.out.println(join("", nCopies(secondIndex, STAR_CHARACTER)));
            secondIndex--;
        }

    }

    public static void printFirstTriangle3(int count) {
        String starLine = "";
        String star = "*";

        int firstIndex = 1;
        while (firstIndex < count) {
            System.out.println(starLine += star);
            ++firstIndex;
        }

        int numberOfStar = 3;
        int secondIndex = 0;
        while (secondIndex < 4) {
            int starCounter = 0;
            while (starCounter < numberOfStar) {
                System.out.print(STAR_CHARACTER);
                starCounter++;
            }
            System.out.println();
            --numberOfStar;
            secondIndex++;
        }
    }

    private static void printSecondTriangle1() {
        int index = 4;
        while (index > 0) {
            System.out.printf("%1$4s\n", join("", nCopies(index, STAR_CHARACTER)));
            index--;
        }
    }

    private static void printSecondTriangle2(int length) {
        int numberOfSpaces = length;
        int lineCounter = 0;

        while (lineCounter < length) {

            int spaceCounter = 0;
            while (spaceCounter < lineCounter) {
                System.out.print(" ");
                spaceCounter++;
            }

            int starCounter = 0;
            while (starCounter < numberOfSpaces) {
                System.out.print("*");
                starCounter++;
            }
            numberOfSpaces--;

            System.out.println();
            lineCounter++;
        }
    }

    private static void printThirdTriangle1() {
        int index = 1;
        while (index < 5) {
            System.out.printf("%1$4s\n", join("", nCopies(index, STAR_CHARACTER)));
            index++;
        }
    }

    private static void printThirdTriangle2(int length) {
        int numberOfSpaces = length;
        int lineCounter = 0;
        while (lineCounter < length) {
            int spaceCounter = 0;
            lineCounter++;
            while (spaceCounter < numberOfSpaces) {
                System.out.print(" ");
                spaceCounter++;
            }
            numberOfSpaces = numberOfSpaces - 1;

            int starCounter = 0;
            while (starCounter < lineCounter) {
                System.out.print(STAR_CHARACTER);
                starCounter++;
            }

            System.out.println();

        }
    }

    private static void printFourthTriangle() {
        for (int i = 1; i < 5; i++) {
            System.out.printf("%1$4s\n", String.join("", nCopies(i, STAR_CHARACTER)));
        }

        for (int i = 3; i >= 1; i--) {
            System.out.printf("%1$4s\n", String.join("", nCopies(i, STAR_CHARACTER)));
        }
    }

    private static void printFifthTriangle(int numberOfLines) {
        int i = 0;
        while (i < 2) {
            i++;
            int numberOfSpaces = numberOfLines;
            int lineCounter = 0;
            while (lineCounter < numberOfLines) {
                int spaceCounter = 0;
                lineCounter++;
                while (spaceCounter < numberOfSpaces) {
                    System.out.print(" ");
                    spaceCounter++;
                }
                numberOfSpaces = numberOfSpaces - 1;

                int starCounter = 0;
                while (starCounter < lineCounter) {
                    System.out.print(STAR_CHARACTER + " ");
                    starCounter++;
                }

                System.out.println();

            }
        }
    }


}
