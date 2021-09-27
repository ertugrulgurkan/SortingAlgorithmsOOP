package com.ertugrul.impl;

import com.ertugrul.interfaces.Sorter;

public class InsertionSort implements Sorter {
    @Override
    public void sort(double[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            double key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
}
