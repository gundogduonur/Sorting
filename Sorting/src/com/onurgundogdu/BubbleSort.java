package com.onurgundogdu;

public class BubbleSort {

    int swap;
    public void bubble(int[] array)
    {
        for (int i = 0; i < array.length-1;++i) {
            for (int j = 0; j < array.length-i-1 ; ++j) {
             if(array[j+1]<array[j])
             {
                 swap=array[j];
                 array[j]=array[j+1];
                 array[j+1]=swap;
             }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(" "+array[i]);
        }

        }
    }

