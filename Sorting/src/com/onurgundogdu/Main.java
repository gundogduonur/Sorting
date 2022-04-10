package com.onurgundogdu;

public class Main {
    public static void main(String[] args) {
        int[] arr ={5,12,1,0,38,43,9};
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.bubble(arr);
        InsertionSort insertionSort=new InsertionSort();
        insertionSort.insertion(arr);
    }
}
