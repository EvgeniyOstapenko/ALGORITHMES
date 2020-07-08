package SimpleSorts.SortBySelection;

import java.util.Arrays;

import static Utilities.Swap.swap;

public class SortBySelection {

    public static int[] sortBySelection(int[] integers){
        for (int i = 0; i < integers.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[j] < integers[indexOfMin]){
                    indexOfMin = j;
                }
            }
            if(i != indexOfMin) {
                swap(integers, i, indexOfMin);
            }
        }
        return integers;
    }

    public static void main(String[] args) {
        int [] arrayToSort = {3,0,1,2,6,3,5,4,3,2,5,4,6,5,7,5};
        System.out.println(Arrays.toString(sortBySelection(arrayToSort)));
    }
}
