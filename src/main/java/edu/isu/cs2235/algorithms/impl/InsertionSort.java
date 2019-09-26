package edu.isu.cs2235.algorithms.impl;

import edu.isu.cs2235.algorithms.ArraySort;

public class InsertionSort implements ArraySort {
    @Override
    public <E extends Comparable> void sort(E[] array) {
        if (array==null){
            throw new IllegalArgumentException();
        }else {
            for (int i=1;i<array.length-1;i++){
                insert(array,i,array[i]);
            }
        }
    }

    public <E extends Comparable> void insert(E[] array,E pos,E value){
        for (int i=1;i<array.length;i++){
            value=array[i];
            int j=i-1;
            while (j>=0 && array[j].compareTo(value)>0){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=value;
        }
    }
}
