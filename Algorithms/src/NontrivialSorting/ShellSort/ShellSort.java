package NontrivialSorting.ShellSort;

import SimpleSorts.InsortionSort.InsertionSort;
import Utilities.Swap;

import java.util.Arrays;

import static Utilities.Swap.swap;

public class ShellSort {

    public static int[] shellSort(int array[]){
        int in, out;
        int gap = 2;
        while(gap > 0) {
            for (in = 0, out = in + gap; out < array.length; in++, out++){
                if(array[in] > array[out]) {
                    swap(array, in, out);
                    while(in >= gap){
                        out = out - gap;
                        in = in - gap;
                        if(array[in] > array[out]) {
                            swap(array, in, out);
                        }
                    }
                }
            }
            gap = gap / 2;
        }

        return array;
    }

    public static int[] laforeShellSort(int array[]){
        int inner, outer;
        int temp;
        int h = 1;
        while(h <= array.length / 3) {
            h = h * 3 + 1;
        }
        while(h > 0){
            for(outer = h; outer < array.length; outer++){
                temp = array[outer];
                inner = outer;
                while(inner > h - 1 && array[inner - h] >= temp){
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {7,6,5,7,6,8,9,8,7,8,6,4,5,6,7,6,5};
        System.out.println(Arrays.toString(laforeShellSort(array)));
    }
}
