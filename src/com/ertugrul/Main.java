package com.ertugrul;

import com.ertugrul.enums.SorterType;
import com.ertugrul.factory.MySortingFactory;
import com.ertugrul.interfaces.Sorter;
import com.ertugrul.interfaces.SorterFactory;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SorterFactory factory = new MySortingFactory();

        double [] array = {22,27,16,2,18,6};
        Sorter insertionSorter = factory.createSorter(SorterType.INSERTION);
        insertionSorter.sort(array);
        System.out.println(Arrays.toString(array));


        double [] array2 = {16,21,11,8,12,22};
        Sorter mergeSorter = factory.createSorter(SorterType.BUBBLE);
        mergeSorter.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}
