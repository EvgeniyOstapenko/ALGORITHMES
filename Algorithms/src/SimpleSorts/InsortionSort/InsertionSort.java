package SimpleSorts.InsortionSort;

import Utilities.Swap;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for (int first = i; first >= 0; first--) {
                int last = first + 1;
                if(array[last] < array[first]){
                    Swap.swap(array, last, first);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {2,3,1,6,4,5,8,9,7,10};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
