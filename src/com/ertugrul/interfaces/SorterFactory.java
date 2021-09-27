package com.ertugrul.interfaces;


import com.ertugrul.enums.SorterType;

public interface SorterFactory {
    Sorter createSorter(SorterType sorter);
}
