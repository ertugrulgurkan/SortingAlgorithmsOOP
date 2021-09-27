package com.ertugrul.factory;

import com.ertugrul.enums.SorterType;
import com.ertugrul.impl.BubbleSort;
import com.ertugrul.impl.InsertionSort;
import com.ertugrul.impl.MergeSort;
import com.ertugrul.impl.QuickSort;
import com.ertugrul.interfaces.SorterFactory;
import com.ertugrul.interfaces.Sorter;

public class MySortingFactory implements SorterFactory {
    @Override
    public Sorter createSorter(SorterType sorters) {
        switch (sorters){
            case MERGE:
                return new MergeSort();
            case QUICK:
                return new QuickSort();
            case BUBBLE:
                return new BubbleSort();
            case INSERTION:
                return new InsertionSort();
            default:
                return null;
        }
    }
}
