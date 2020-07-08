package Pactice;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array){
        for (int sorted = 0; sorted < array.length; sorted++) {
            for (int first = sorted; first > 0; first--){
                if(array[first] < array[first - 1]){
                    swap(array, first, first - 1);
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
        int[] array = {5,3,4,2,6,8,6,5};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
