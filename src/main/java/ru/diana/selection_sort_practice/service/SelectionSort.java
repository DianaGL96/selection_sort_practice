package ru.diana.selection_sort_practice.service;
import java.util.Arrays;

import static ru.diana.selection_sort_practice.service.CountOperations.countOperations;

public class SelectionSort {
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int minComplexity = countOperations(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                int currentComplexity = countOperations(arr[j]);
                if (currentComplexity < minComplexity) {
                    minComplexity = currentComplexity;
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
