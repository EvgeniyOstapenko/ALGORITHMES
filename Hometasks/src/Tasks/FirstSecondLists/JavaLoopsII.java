package Tasks.FirstSecondLists;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            Integer[] sequence = new Integer[n];
            sequence[0] = a + b;
            int pov = 2;
            for (int j = 1; j < n; j++) {
                sequence[j] = sequence[j - 1] + pov * b;
                pov = pov * 2;
            }
            for (int x = 0; x < sequence.length; x++) {
                System.out.print(sequence[x] + " ");
            }
            System.out.println();
        }
        in.close();

    }



}