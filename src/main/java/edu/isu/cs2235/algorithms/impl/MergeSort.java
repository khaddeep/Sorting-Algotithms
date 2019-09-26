package edu.isu.cs2235.algorithms.impl;

import edu.isu.cs2235.algorithms.ArraySort;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MergeSort implements ArraySort {
    @Override
    public <E extends Comparable> void sort(E[] array) {
        if (array==null){
            throw new IllegalArgumentException();
        }
        E[] copy=copyArray(array);
      mergeSort(copy,array,0,array.length-1);
    }

    public <E> E[] copyArray(E[] otherArray) {
        E[] array = Arrays.copyOf(otherArray, otherArray.length);
        return array;
    }

    public <E extends Comparable> void mergeSort(E[]array,E[] result, E start,E end){
        if (end.compareTo(start)==0){
            return;
        }
        if (((int)end-(int)start)<2) {
            if (result[(int) start].compareTo(result[(int) end]) > 0) {
                swap(result, start, end);
            }
            return;
        }
            int mid = ((int) end - (int) start) / 2 + (int) start;
            mergeSort(result, array, start, mid);
            mergeSort(result, array, mid + 1, end);
        for (int i=(int)start;i<=(int)end;i++){
            result[i]=array[i];
        }
            int i = (int) start;
            int j = mid + 1;
            int k=(int)start;

            while (i<=mid && j<=(int)end){
                if (result[i].compareTo(result[j])<=0){
                    array[k]=result[k];
                    i++;
                }
                else {
                    array[k]=result[j];
                    j++;
                }
                k++;
            }
            while (i<=mid){
                array[k]=result[i];
                i++;
                k++;
            }
        }
    public <E extends Comparable> void swap(E[]array,E first,E second){
        E temp=array[(int)first];
        array[(int)first]=array[(int)second];
        array[(int)second]=temp;
    }
    public <E extends Comparable> E[] copy(E[]array,E start,E end){
        E[] newAr=(E[])new Object[(int) start - (int) end + 1];
        for (int i=(int)start;i<(int)end;i++){
           newAr[i]=array[i];
        }
        return newAr;
    }
}
