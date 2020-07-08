package Pactice;


public class BubbleSort {

    public static int[] bubbleCort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]){
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }

    public static int[] bubbleCortUpdated(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]){
                    swap(array, j, j + 1);
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
}
