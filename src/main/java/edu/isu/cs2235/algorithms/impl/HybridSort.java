package edu.isu.cs2235.algorithms.impl;
import edu.isu.cs2235.algorithms.ArraySort;

public class HybridSort implements ArraySort {
    QuickSort quickSort=new QuickSort();
    InsertionSort insertionSort=new InsertionSort();
    @Override
    public <E extends Comparable> void sort(E[] array) {
        if (array == null) {
            throw new IllegalArgumentException();
        } else {
            quickSorting(array, 0, array.length - 1);
        }
    }

    public <E extends Comparable> void quickSorting(E[] array,E first, E last){
        int size=(int)last+1-(int)first;
        if ((int)first<=10){
            insertionSort.insert(array,first,last);
        }else {
            int pivotIndex=quickSort.partition(array,first,last);
            quickSort.quickSort(array,first,last);
            quickSort.quickSort(array,first,last);
        }
    }
}
