package com.company;

public class Sorting {
    public static void bubbleSort(int[] arrayToSort){
        int length = arrayToSort.length - 1;

        for (int j = 0; j < arrayToSort.length; j++) {
            for (int i = 0; i < length; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    int swap = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = swap;
                }
            }

            length--;
        }
    }

    public static void selectionSort(int[] arrayToSort){
        for (int i = 0; i < arrayToSort.length - 1; i++){
            int pos = i;
            for (int j = i; j < arrayToSort.length; j++){
                if (arrayToSort[j] < arrayToSort[pos]){
                    pos = j;
                }
            }
            int swap = arrayToSort[i];
            arrayToSort[i] = arrayToSort[pos];
            arrayToSort[pos] = swap;
        }
    }

    public static void insertionSort(int[] arrayToSort){
        for (int i = 0; i < arrayToSort.length - 1; i++){
            for (int j = i; j >= 0; j--){
                if (arrayToSort[j + 1] < arrayToSort[j]){
                    int swap = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = swap;
                }
                else {
                    break;
                }
            }
        }
    }
}
