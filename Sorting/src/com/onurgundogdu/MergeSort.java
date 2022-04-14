package com.onurgundogdu;

public class MergeSort {
    int begin = 0;
    int end = 0;
    int n = 0;
    int n1=end-begin+1;
    int n2=n-end;
    int left[]=new int[n1];
    int right[]=new int[n2];
    public void merge(int[] array)
    {

        for (int i = 0; i <n1 ; i++) {
            left[i]=array[begin+i];
        }
        for (int i = 0; i <n2 ; i++) {
            right[i]=array[end+1+i];
        }
// Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = begin;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
        for (int x = 0; x <array.length ; x++) {
            System.out.println(" "+array[x]);

    }
    }
}
   
    

