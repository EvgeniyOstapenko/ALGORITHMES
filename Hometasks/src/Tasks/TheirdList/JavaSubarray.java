package Tasks.TheirdList;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) {
        sort();
        sort2();

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        int negative = 0;
//        for (int j = 0; j < array.length; j++) {
//
//            int sum = 0;
//            for (int i = j; i < array.length; i++) {
//                sum = sum + array[i];
//                if (sum < 0) negative++;
//                System.out.printf(sum + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Out : " + negative);

    }

    public static void sort(){
        int[] array = {1, -2, 4, -5, 1};
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + array[k];
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }

    public static void sort2(){
        int[] array = {1, -2, 4, -5, 1};
        for (int j = 0; j < array.length; j++) {

            int sum = 0;
            for (int i = j; i < array.length; i++) {
                sum = sum + array[i];
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
