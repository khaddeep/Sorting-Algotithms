package edu.isu.cs2235.algorithms.impl;
import edu.isu.cs2235.algorithms.ArraySort;

public class SelectionSort implements ArraySort {
    @Override
    public <E extends Comparable> void sort(E[] array) {
        if (array == null) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i <array.length - 1; i++) {
                int index = i;
                for (int j = i+1;j < array.length ; j++) {
                    if (array[j].compareTo(array[index])<0) {
                        index = j;
                    }
                }
                E temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }

    }
}
