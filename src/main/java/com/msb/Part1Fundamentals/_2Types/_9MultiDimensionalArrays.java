package com.msb.Part1Fundamentals._2Types;

import java.util.Arrays;

public class _9MultiDimensionalArrays {
    public static void main(String[] args) {
        // 2D array
        int [][] numbers = new int[2][3];
        numbers[0][0] = 1;
        // need to use Arrays.deepToString() to print 2D arrays
        System.out.println(Arrays.deepToString(numbers));

        // 3D array
        int [][][] numbers1 = new int[2][3][5];
        numbers1[0][0][0] = 1;
        System.out.println(Arrays.deepToString(numbers1));

        // new way of declaring a 2D array
        int [][] numbers2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers2));
    }
}
