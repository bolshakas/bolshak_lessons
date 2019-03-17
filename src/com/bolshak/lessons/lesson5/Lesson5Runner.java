package com.bolshak.lessons.lesson5;

import java.util.Arrays;

public class Lesson5Runner {
    public static void main(String[] args) {
        int[] arr = createArray(12);
        System.out.println("Array " + Arrays.toString(arr));
        System.out.println("Sub = "+ subMaxMin(arr));
    }

    private static int[] createArray(int size) {
        if (size < 1) {
            return null;
        }
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9);
        }
        return arr;
    }


    private static Integer subMaxMin(int[] array) {
        if (array==null || array.length < 2){
            return null;
        }
        int[] newArray = Arrays.copyOf(array,array.length );
        Arrays.sort(newArray);

        return newArray [newArray.length-1] -newArray [0];
    }
}