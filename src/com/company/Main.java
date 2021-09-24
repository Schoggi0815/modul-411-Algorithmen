package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {12, 5, 7, 99, 102, 1, -5, 10};

        Sorting.insertionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
