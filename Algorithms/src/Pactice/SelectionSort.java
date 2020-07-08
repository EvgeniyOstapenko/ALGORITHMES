package Pactice;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if(min > array[j]){
                   swap(array, i, j);
                }
            }
        }
        return array;
    }

    public static int[] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3,2,100,4,6,43,25,67,86,5};
        System.out.println(Arrays.toString(selectionSort(array)));

    }
}
