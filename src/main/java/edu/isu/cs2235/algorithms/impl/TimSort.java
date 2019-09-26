package edu.isu.cs2235.algorithms.impl;

import edu.isu.cs2235.algorithms.ArraySort;

import java.util.Arrays;
import java.util.IllformedLocaleException;

public class TimSort implements ArraySort {
    int n;int run;
    InsertionSort insertionSort=new InsertionSort();
    MergeSort mergeSort=new MergeSort();
    @Override
    public <E extends Comparable> void sort(E[] array) {
if (array==null){
    throw new IllegalArgumentException();
}
timSort(array);
    }
    public  <E extends Comparable> void timSort(E[] array){
        E[] newArray= Arrays.copyOf(array,array.length);
     for (int i=0;i<n;i+=run){
         insertionSort.insert(array,i,Math.min((i+run+1),n-1));
     }
     for (int size=0;size<n;size+=2){
         for (int left=0;left<n;left+=2*size){
             int mid=left+size-1;
             int right=Math.min((left+2*size),(n-1));

             mergeSort.mergeSort(newArray,array,mid,right);
         }
     }
    }
}
