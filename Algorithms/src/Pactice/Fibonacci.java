package Pactice;

import java.util.Arrays;

public class Fibonacci {

    public static int[] fibonacciNonRecursive(int number){
        int[] array = new int[number];
        for (int i = 2; i < number; i++) {
            array[0] = 0;
            array[1] = 1;
            array[i] = array[i - 2] + array[i - 1];
        }
        return array;
    }

    public static int fibonacciRecursive(int number){
        if(number < 2){
            return number;
        }
        int fibonacci = fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
        return fibonacci;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciNonRecursive(5)));

    }
}
