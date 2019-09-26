package edu.isu.cs2235.algorithms.impl;
import edu.isu.cs2235.algorithms.ArraySort;
import java.util.Arrays;

public class QuickSort implements ArraySort {
    @Override
    public <E extends Comparable> void sort(E[] array) {
        if (array==null){
            throw new IllegalArgumentException();
        }
        quickSort(array, 0, array.length - 1);
    }
    public <E extends Comparable> void quickSort(E[]array,E left,E right){
        if (left.compareTo(right)<0){
            int pivot=partition(array,left,right);
            quickSort(array,left,pivot-1);
            quickSort(array,pivot+1,right);
        }
    }
    public <E extends Comparable> int partition(E[]array,E left, E right){
        int pivot=(int)array[(int)left];
        int i=(int)left+1;
        int j=(int)right;
        while (i<=j){
            if (array[i].compareTo(pivot)>0&&array[j].compareTo(pivot)<=0){
                swap(array,i,j);
                i=i+1;
                j=j-1;
            }else{
                if (array[i].compareTo(pivot)<=0){
                    i=i+1;
                }
                if (array[j].compareTo(pivot)>0){
                    j=j-1;
                }
            }
        }
        swap(array,left,j);
        return j;
        //https://www.java67.com/2014/07/quicksort-algorithm-in-java-in-place-example.html
    }
    public <E extends Comparable> void swap(E[]array,E first,E second){
        E temp= array[(int) first];
        array[(int)first]=array[(int)second];
        array[(int)second]=temp;
    }
    /**
     * Constructs an exact copy of the input array
     * @param otherArray The array to copy
     * @param <E> The type parameter  of the data in the array
     * @return A copy of the provided array
     */

}
