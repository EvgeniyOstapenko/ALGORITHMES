package Pactice;

import java.util.Arrays;

public class ToFindBiggestNumberInArray {


    public static int toFindBiggestNumberInArray(int[] array){
        int biggest = 0;
        for (int i = 0; i < array.length; i++) {
            if(biggest < array[i]){
                biggest = array[i];
            }
        }
        return biggest;
    }

    public static int toFindIndexOfBiggestNumberInArray(int[] array){
        int biggest = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(biggest < array[i]){
                biggest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {4,3,2,5,3};
        System.out.println(toFindIndexOfBiggestNumberInArray(array));
    }


}
