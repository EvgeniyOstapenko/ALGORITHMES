package NontrivialSorting.MergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void recursiveArraySplitting(int[] array, int lower, int upper){
        if(lower == upper){
            return;
        }else {
            int middle = (lower + upper) / 2;
            recursiveArraySplitting(array, lower, middle);
            recursiveArraySplitting(array, middle + 1, upper);
            mergeArray(array, lower, middle, upper);
        }
    }

    private static void mergeArray(int[] array, int lower, int middle, int upper) {
        int[] tempArray = new int[array.length];
        for(int i = lower; i <= upper; i++){
            tempArray[i] = array[i];
        }
        int i = lower;
        int j = middle + 1;
        int k = lower;
        while (i <= middle && j <= upper){
            if(tempArray[i] <= tempArray[j]){
                array[k] = tempArray[i];
                i++;
            }else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle){
            array[k++] = tempArray[i++];

        }
        while (j <= upper){
            array[k++] = tempArray[j++];
        }
    }

    public static void sortByTwoNumbers(int[] array, int lower, int upper){
        if((upper - lower) < 3 && array[lower] > array[upper]){
            System.out.println("Real pairs of numbers " + array[lower] + "-" +  array[upper]);
            int temp = array[lower];
            array[lower] = array[upper];
            array[upper] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {8,7,6,5,4,3,2,1};
        recursiveArraySplitting(array, 0,array.length - 1);
        System.out.println("result:" + Arrays.toString(array));
    }
}
