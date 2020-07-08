package ForInterview.Fibonacci;

import java.util.Arrays;

public class Fibonacci {

    public static int[] fibinacciByHands(int number){
        int [] array = new int[number];
        for (int i = 2; i < number; i++) {
            array[0] = 0;
            array[1] = 1;
            array[i] = array[i - 2] + array[i - 1];
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibinacciByHands(8)));
    }
}
