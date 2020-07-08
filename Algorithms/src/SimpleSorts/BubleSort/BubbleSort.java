package SimpleSorts.BubleSort;

import java.util.Arrays;
import static Utilities.Swap.swap;

public class BubbleSort {
        public static int[] bubbleSort(int[] array){
            for (int j = 0; j < array.length; j++) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        swap(array, i, i + 1);
                    }
                }
            }
            return array;
        }

    public static int[] secondBubbleSort(int[] array){
        for (int j = array.length; j > 0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

        public static void main(String[] args) {
            int[] array = {3,2,1,2,4,5,6,5,6,7,5,4};
            System.out.println(Arrays.toString(secondBubbleSort(array)));
        }
    }


