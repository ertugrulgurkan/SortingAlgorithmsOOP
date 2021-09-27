package com.ertugrul.impl;

import com.ertugrul.interfaces.Sorter;

public class QuickSort implements Sorter {

    @Override
    public void sort(double[] array) {
        quickSort(array, 0, array.length-1);
    }

    public void quickSort(double[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(double[] arr, int begin, int end) {
        double pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                double swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        double swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}

