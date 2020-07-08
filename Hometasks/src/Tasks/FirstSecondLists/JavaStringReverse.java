package Tasks.FirstSecondLists;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        boolean answer = false;

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        char[] newString = A.toCharArray();
        int start = 0;
        int end = A.length() - 1;

        while (start <= end) {
            if (newString[start] == newString[end]) {
                answer = true;
            } else {
                answer = false;
            }
            start++;
            end--;
        }
        System.out.println(answer ? "Yes" : "No");
    }
}