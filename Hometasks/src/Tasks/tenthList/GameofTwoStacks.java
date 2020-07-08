package Tasks.tenthList;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;

public class GameofTwoStacks {
    public static void main(String[] args) {
//        int[] a = {19, 9, 8, 13, 1, 7, 18, 0, 19, 19, 10, 5, 15, 19, 0, 0, 16, 12, 5, 10};
//        int[] b = {11, 17, 1, 18, 14, 12, 9, 18, 14, 3, 4, 13, 4, 12, 6, 5, 12, 16, 5, 11,
//                16, 8, 16, 3, 7, 8, 3, 3, 0, 1, 13, 4, 10, 7, 14};
//        int x = 67;

//        int[] a = {4, 2, 4, 6, 1};
//        int[] b = {2, 1, 8, 5};
//        int x = 10;
//
//        int[] a = {4};
//        int[] b = {2, 1, 8, 5};
//        int x = 10;

//        int[] a = {11, 6, 1, 13, 14, 7, 8, 10};
//        int[] b = {10, 15, 13, 17, 10, 7, 0, 16};
//        int x = 55; //6

//        int[] a = {2, 6};
//        int[] b = {2, 1, 1, 5, 1};
//        int[] b = {2, 6};
//        int[] a = {2, 1, 1, 5, 1};
//        int x = 10;

//        int[] a = {2, 2, 3, 3, 12, 5, 11, 19, 15, 10, 10, 14};
//        int[] b = {10, 16, 16, 17, 0, 0, 15, 9, 16, 1, 18, 11, 19, 9, 14, 0, 2, 4, 7, 17, 6, 2, 12, 10, 7, 3, 1, 2};
//        int x = 75; //10

//        int[] a = {14, 10, 11, 8, 14, 14, 15, 7, 16, 6, 8, 7, 4};
//        int[] b = {19, 14, 6, 2, 19, 17, 9, 5, 11, 19};
//        int x = 92; //8

//        int[] a = {1, 2, 3, 4};
//        int[] b = {1, 2, 3, 4};
//        int x = 10;

//        int[] a = {1, 1, 2, 9};
//        int[] b = {8, 1, 1, 1};
//        int x = 12;

//        int[] a = {1, 2, 3, 4};
//        int[] b = {4, 2, 3, 1};
//        int x = 4;

//        int[] a = {9, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        int[] b = {1, 8, 8, 8, 8, 8, 8, 8, 8, 8};
//        int x = 10;

//        int[] a = {17,1,1,1,8};
//        int[] b = {8,8,4,5,9};
//        int x = 20;

//        int[] a = {10, 12, 15, 3, 19, 12, 13, 12, 15, 1, 18, 18};
//        int[] b = {2, 19, 16, 16, 7, 12, 10, 9, 2, 16, 12, 1, 0, 3, 3, 3, 16, 8, 2, 6, 12, 17, 2};
//        int x = 87;
//
//        int[] a = {5, 1, 1, 1, 1};
//        int[] b = {2, 3, 3, 2};
//        int x = 8;

//        int[] a = {2, 1, 1, 1};
//        int[] b = {6, 1, 1, 1};
//        int x = 8;

        int[] a = {17, 5, 0};
        int[] b = {10, 8, 2, 1, 13, 1, 14, 18, 9, 18, 16, 19, 5};
        int x = 60; //6 !


//        int[] a = {7, 15, 12, 0, 5, 18, 17, 2, 10, 15, 4, 2, 9, 15, 13, 12, 16};
//        int[] b = {12, 16, 6, 8, 16, 15, 18, 3, 11, 0, 17, 7, 6, 11, 14,
//                13, 15, 6, 18, 6, 16, 12, 16, 11, 16, 11};
//        int x = 62; //6

//        int[] a = {11, 6, 1, 13, 14, 7, 8, 10, 3, 17, 7, 18, 6, 4, 5, 13, 17, 4, 16, 9, 17, 16, 12, 6, 7};
//        int[] b = {10, 15, 13, 17, 10, 7, 0, 16, 8, 13, 11, 8, 14, 13};
//        int x = 55; //6

//        int[] a = {11, 16, 16, 10, 15, 11, 17, 19, 18, 16, 13, 13, 14, 18, 17, 14};
//        int[] b = {19, 15, 15, 15, 11, 19, 10, 10, 12, 18, 11, 19, 11, 18, 17, 14, 14, 13, 14};
//        int x = 5; //0

        System.out.println(twoStacks(x, a, b));
        System.out.println(solve(a, b, x));
    }


    static int twoStacks(int x, int[] a, int[] b) {
        int count_b = 0;
        int count_a = 0;
        int sum_a = 0;
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            if (sum_a + a[i] <= x) {
                sum_a = sum_a + a[i];
                count_a++;
            } else break;
        }
        while (true) {
            while (count_b < b.length) {
                if (sum_a + b[count_b] <= x) {
                    sum_a = sum_a + b[count_b];
                    count_b++;
                } else break;
            }
            if(answer < count_a + count_b)
                answer = count_a + count_b;

            count_a--;
            if(count_a < 0) break;

            sum_a = sum_a - a[count_a];
        }
        return answer;
    }










    static int twoStacks2(int x, int[] a, int[] b) {
        int count_b = 0;
        int count_a = 0;
        int sum_a = 0;
        int sum_b = 0;
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            if (sum_a + a[i] <= x) {
                sum_a = sum_a + a[i];
                count_a++;
            } else break;
        }
        while (true) {
            for (int i = 0; i < b.length; i++) {
                if (sum_b + b[i] + sum_a <= x) {
                    sum_b = sum_b + b[i];
                    count_b++;
                } else break;
            }
            if(answer < count_a + count_b)
                answer = count_a + count_b;
            count_b = 0;
            sum_b = 0;
            count_a--;
            if(count_a < 0) break;

            sum_a = sum_a - a[count_a];
        }
        return answer;
    }

    static void sum(int[] array){
        int[] sum = new int[array.length];
        for (int i = 0; i < array.length; i++) {

        }

    }

    static int solve(int[] a, int[] b, int x) {
        int lengthB = 0;
        int sum = 0;
        while (lengthB < b.length && sum + b[lengthB] <= x) {
            sum += b[lengthB];
            lengthB++;
        }

        int maxScore = lengthB;
        for (int lengthA = 1; lengthA <= a.length; lengthA++) {
            sum += a[lengthA - 1];

            while (sum > x && lengthB > 0) {
                lengthB--;
                sum -= b[lengthB];
            }

            if (sum > x) {
                break;
            }

            maxScore = Math.max(maxScore, lengthA + lengthB);
        }
        return maxScore;
    }

    static int twoStacks1(int x, int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            a[i] = sum;
        }
        sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
            b[i] = sum;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        int limit = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] <= x){
                limit = i;
                count++;
            }else break;
        }

        int current_count;
        int weight;
        for (int i = limit; i >= -1; i--) {
            if(i >= 0) {
                weight = x - a[i];
            }else {
                weight = x;
            }
            current_count = i + 1;


            for (int j = 0; j < b.length; j++) {
                if(b[j] <= weight){
                    current_count++;
                }else break;
            }
            if(current_count > count) count = current_count;
            current_count = 0;
        }
        return count;
    }
}
