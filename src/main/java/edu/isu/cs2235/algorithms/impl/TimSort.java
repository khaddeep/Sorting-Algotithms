package edu.isu.cs2235.algorithms.impl;

import edu.isu.cs2235.algorithms.ArraySort;

import java.util.IllformedLocaleException;

public class TimSort implements ArraySort {
    @Override
    public <E extends Comparable> void sort(E[] array) {
if (array==null){
    throw new IllformedLocaleException();
}
    }
}
