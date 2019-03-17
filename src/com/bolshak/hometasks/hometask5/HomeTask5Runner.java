package com.bolshak.hometasks.hometask5;

public class HomeTask5Runner {
    public static void main(String[] args) {
        printInForwardAndReverseOrder();
        creatingArrayBasedOnTwoArrays();
        calculateNumberAndSumOfOddElements();
        separateToPositiveAndNegative();
        averageAndNumberMoreAverage();
        combinedArrays();
        getListWithUniqueMinAndMax();
    }

    private static void printInForwardAndReverseOrder() {
        int[] intList = new int[5];
        initArray(intList, 0, 7);
        print("Array in forward order: ");

        printArray(intList);

        print("Array in reverse order: ");
        for (int i = intList.length - 1; i >= 0; i--) {
            System.out.print(intList[i] + " ");
        }
        System.out.println();
    }

    private static void creatingArrayBasedOnTwoArrays() {
        int[] primary = new int[5];
        initArray(primary, 0, 7);
        int[] secondary = new int[5];
        initArray(secondary, 0, 7);
        int[] result = new int[5];

        for (int i = 0; i < primary.length; i++) {
            result[i] = (primary[i] + secondary[i]);
        }
        print("Firs array -> ");
        printArray(primary);
        print("Second array -> ");
        printArray(secondary);
        print("Result array -> ");
        printArray(result);
    }

    private static void calculateNumberAndSumOfOddElements() {
        int[] list = new int[5];
        initArray(list, 0, 7);
        int count = 0;
        int sum = 0;
        print("List -> ");
        for (int item : list) {
            if (item % 2 != 0) {
                count++;
                sum = sum + item;
            }
        }
        printArray(list);
        println("The number of odd elements in the list " + count);
        println("The sum of odd elements is " + sum);

    }

    private static void separateToPositiveAndNegative() {
        int[] primary = new int[5];

        initArray(primary, -15, 15);

        int negativeCounter = getNegativeCounter(primary);
        int[] negativeNumbers = new int[negativeCounter];

        int positiveCounter = getPositiveCounter(primary);
        int[] positiveNumbers = new int[positiveCounter];

        int counterForNegative = 0;
        int counterForPositive = 0;

        for (int item : primary) {
            if (item < 0) {
                negativeNumbers[counterForNegative] = item;
                counterForNegative++;
            }
            if (item > 0) {
                positiveNumbers[counterForPositive] = item;
                counterForPositive++;
            }
        }

        print("The primary array ->  ");
        printArray(primary);
        print("The array of positive numbers ->  ");
        printArray(positiveNumbers);
        print("The array of negative numbers ->  ");
        printArray(negativeNumbers);
    }

    private static void averageAndNumberMoreAverage() {
        int numberOfElements = 5;
        int list[] = new int[numberOfElements];
        double sum = 0;
        initArray(list, 0, 9);
        print("List -> ");
        printArray(list);
        for (int item : list) {
            sum += item;
        }
        double average = sum / numberOfElements;
        println("The average of elements list is " + average);

        int counterMoreAverage = 0;
        for (int item : list) {
            if (item > average) {
                counterMoreAverage++;
            }
        }
        println("The number of elements is greater than the average is " + counterMoreAverage);
    }

    private static void combinedArrays() {
        int[] firstArray = new int[5];
        initArray(firstArray, 0, 15);
        print("First array -> ");
        printArray(firstArray);

        int[] secondArray = new int[7];
        initArray(secondArray, 0, 15);
        print("Second array -> ");
        printArray(secondArray);

        int[] combinedArray = new int[12];
        int x = 0;
        for (int i = 0; i < firstArray.length; i++) {
            combinedArray[i] = firstArray[x];
            ++x;
        }

        int y = 0;
        for (int i = firstArray.length; i < combinedArray.length; i++) {
            combinedArray[i] = secondArray[y];
            ++y;
        }
        print("Combined array -> ");
        printArray(combinedArray);
    }

    private static void getListWithUniqueMinAndMax() {

        int[] intList = new int[10];
        initArray(intList, 1, 5);
        int[] uniqueList = new int[getUniqueListLength(intList)];

        print("Array -> ");
        printArray(intList);
        int min = findMin(intList);
        int max = findMax(intList);

        println("Min is " + min);
        println("Max is " + max);

        boolean isMinUnique = true;
        boolean isMaxUnique = true;

        int count = 0;

        for (int i : intList) {
            if (i != min && i != max) {
                uniqueList[count] = i;
                count++;
            }


            if (i == min && isMinUnique) {
                uniqueList[count] = i;
                isMinUnique = false;
                count++;
            }

            if (i == max && isMaxUnique) {
                uniqueList[count] = i;
                isMaxUnique = false;
                count++;
            }
        }


        print("Array not duplicate min and max -> ");
        printArray(uniqueList);
    }


    private static int getUniqueListLength(int[] intList) {
        boolean minBoolean = true;
        boolean maxBoolean = true;
        int uniqueListLength = 0;
        int min = findMin(intList);
        int max = findMax(intList);

        for (int i1 : intList) {
            if (i1 != min && i1 != max) {
                uniqueListLength++;
            }


            if (i1 == min) {
                if (minBoolean) {
                    uniqueListLength++;
                    minBoolean = false;

                }
            }

            if (i1 == max) {
                if (maxBoolean) {
                    uniqueListLength++;
                    maxBoolean = false;

                }
            }

        }
        return uniqueListLength;
    }


    private static void print(String string) {
        System.out.print(string);
    }

    private static void println(String string) {
        System.out.println(string);
    }

    private static void initArray(int[] array, int from, int to) {
            for (int i = 0; i < array.length; i++) {
                int multiplier = to - from;
                array[i] = (int) Math.round((Math.random() * multiplier) + from);
            }
    }

    private static int getPositiveCounter(int[] primary) {
        int positiveCounter = 0;
        for (int i : primary) {
            if (i > 0) {
                positiveCounter++;
            }
        }
        return positiveCounter;
    }

    private static int getNegativeCounter(int[] primary) {
        int negativeCounter = 0;
        for (int i : primary) {
            if (i < 0) {
                negativeCounter++;
            }
        }
        return negativeCounter;
    }

    private static void printArray(int[] list) {
        for (int item : list) {
            print(item + " ");
        }
        System.out.println();
    }

    private static int findMax(int[] intList) {
        int max = intList[0];
        for (int i : intList) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int findMin(int[] intList) {
        int min = intList[0];
        for (int i : intList) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
