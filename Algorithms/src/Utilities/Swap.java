package Utilities;

public class Swap {

    public static int[] swap(int[]array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static char[] swap(char[]array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public  <T extends Object> T[] swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}
