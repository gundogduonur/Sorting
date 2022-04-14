package com.onurgundogdu.sort;

public class InsertionSort {
    int key;
    int j;
    public void insertion(int[] array)
    {
        for (int i = 1; i < array.length;i++) {
            key=array[i];
            j=i-1;
          while (j>=0 && key<array[j])
             {
                 array[j + 1] = array[j];
                 --j;
            }
            array[j + 1] = key;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(" "+array[i]);
        }

    }
}
