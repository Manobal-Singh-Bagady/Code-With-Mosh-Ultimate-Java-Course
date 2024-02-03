package com.msb.Part1Fundamentals._2Types;

import java.util.Arrays;

public class _8Arrays {
    public static void main(String[] args) {
        int number = 1;

        // old way of declaring an array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        // new way of declaring an array
        int[] numbers1 = {6, 1, 4, 10, 3};
        System.out.println(numbers1.length);
        System.out.println(Arrays.toString(numbers1));

        // sorting an array
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));



    }
}
