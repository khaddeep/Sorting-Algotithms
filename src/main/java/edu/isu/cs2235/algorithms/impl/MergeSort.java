package edu.isu.cs2235.algorithms.impl;

import edu.isu.cs2235.algorithms.ArraySort;

import java.util.Arrays;

public class MergeSort implements ArraySort {
    @Override
    public <E extends Comparable> void sort(E[] array) {
        if (array==null){
            throw new IllegalArgumentException();
        }
E[] newArray=Arrays.copyOf(array,array.length);
      mergeSort(newArray,array,0,array.length-1);
    }

    public <E> E[] copyArray(E[] otherArray) {
        E[] array = Arrays.copyOf(otherArray, otherArray.length);
        return  array;
    }

    public <E extends Comparable> void mergeSort(E[]array,E[] result, int start,int end) {
        if (end==start) {
            return;
        }
        if (( end - start) < 2) {
            if (result[start].compareTo(result[end]) ==1) {
                swap(result, start, end);
            }
            return;
        }

            int mid = (end - start) / 2 + start;
            mergeSort(result, array, start, mid);
            mergeSort(result, array, mid + 1, end);

int i =start;
int j=mid+1;
for (int index=start;index<=end;index++){
    if (j>end||(i<=mid && array[i].compareTo(array[j])==-1)){
        result[index]=array[i];
        i++;
    }else{
       result[index]=array[j];
       j++;
    }
}
    }

    public <E extends Comparable> void swap(E[]array,int first,int second){
        E temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }
/*
    public <E extends Comparable> E[] copy(E[]array,int start,int end){
        E[] newAr= Arrays.copyOf(array,array.length);
        for (int i=start;i<end;i++){
           newAr[i]=array[start];
        }
        return newAr;
    }
 */
}
