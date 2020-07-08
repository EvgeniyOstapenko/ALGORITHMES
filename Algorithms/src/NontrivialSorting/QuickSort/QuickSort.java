package NontrivialSorting.QuickSort;

import Utilities.Swap;

import java.util.Arrays;

import static Utilities.Swap.swap;

public class QuickSort {

    public static int partition(int[] array, int start, int end){
        int pIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (array[i] < array[end]){
                swap(array, pIndex, i);
                pIndex++;
            }
        }
        if(array[pIndex] > array[end]) {
            swap(array, end, pIndex);
        }
        return pIndex;
    }

    public static int updatedPartition(int[] array, int start, int end){
        int pivot = array[end];
        int left = start;
        int right = end - 1;
        while (true){
            while (array[left] < pivot){
                left++;
            }
            while (array[right] > pivot && right > 0){
                right--;
            }
            if(right <= left){
                break;
            }
            swap(array, left, right);
        }
        swap(array, end, left);
        return left;
    }

    public static void recQuickSort(int[] array, int left, int right){
        if(right - left <= 0){
            return;
        }else {
            int pIndex = updatedPartition(array, left, right);
            recQuickSort(array, left, pIndex - 1);
            recQuickSort(array, pIndex + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {7,2,1,6,8,5,3,4};
//        int[] array = {8,5,7,6};
        recQuickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


}
