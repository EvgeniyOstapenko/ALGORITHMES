package Tasks.EleventhList;

import java.util.*;

public class Waiter {
    public static void main(String[] args) {
        int[] array = {1, 8, 11, 23, 18, 2, 15, 30, 4, 5};
//        int[] array = {3, 4, 7, 6, 5};
//        int[] array = {3, 3, 4, 4, 9};
        System.out.println(Arrays.toString(waiter(array, 3)));

    }


//    public static int[] waiter1(int[] number, int q){
//        List<Integer> prime_numbers = findPrime(q);
//        List<Integer> number_list = new ArrayList<>();
//        List<Integer> answer = new ArrayList<>();
//        int[] ans = new int[number.length];
//        for (int i = 0; i < number.length; i++)
//             number_list.add(number[i]);
//
//        int j = 0;
//        while (j < q){
//            for (int i = 0; i < number_list.size(); ) {
//                 if(number_list.get(i) % prime_numbers.get(j) == 0){
//                    answer.add(number_list.get(i));
//                    number_list.remove(i);
//                    continue;
//                 }
//                 i++;
//            }
//            j++;
//        }
//        for (Integer left_number : number_list) {
//             answer.add(left_number);
//        }
//
//        for (int i = 0; i < answer.size(); i++)
//             ans[i] = answer.get(i);
//        return ans;
//    }

    static int[] waiter2(int[] number, int q) {
        int[] primes =  findPrime(q);
        ArrayList<Integer> A = new ArrayList<>();
        for(int x : number) A.add(x);
        ArrayList<Integer> B;
        int currPrime;
        int output[] = new int[number.length];
        int k = 0;
        for(int i=0; i<q; i++){
            currPrime = primes[i];
            B = new ArrayList<>();
            System.out.println(A);
            for(int j = A.size() - 1; j >= 0; j--){
                if(A.get(j) % currPrime == 0){
                    B.add(A.get(j));
                    A.remove(j);
                }
            }
            for(int j = B.size() - 1 ; j >= 0; j--){
                output[k] = B.get(j);
                k++;
            }
            Collections.reverse(A);
//            System.out.println(B);
        }

        for(int j=A.size()-1; j>=0; j--){
            output[k] = A.get(j);
            k++;
        }
        return output;
    }

    static int[] waiter(int[] number, int q) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < number.length; i++) {
             stack.push(number[i]);
        }
        Stack<Integer> current_stack = new Stack();
        Stack<Integer> left_stack = new Stack();
        List<Integer> answer = new ArrayList<>();
        int[] ans = new int[number.length];
        int[] prime_numbers = findPrime(q);

        int count = 0;
        while (count < q){
            while (!stack.empty()){
                int num = stack.pop();
                if(num % prime_numbers[count] == 0){
                    current_stack.push(num);
                }else {
                    left_stack.push(num);
                }
            }
            count++;
            while (!current_stack.empty()){
                   answer.add(current_stack.pop());
            }
            stack = left_stack;
            left_stack = new Stack<>();
        }
        while (!stack.empty()){
               answer.add(stack.pop());
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = answer.get(i);
        }
        return ans;
    }


    public static int[] findPrime(int queries){
        List<Integer> primes = new ArrayList(queries);
        int[] ans_primes = new int[queries];
        int number = 2;
        while (queries > 0){
            for (int i = 0; i < primes.size();) {
                if (number % primes.get(i) == 0){

                    number++;
                    i = 0;
                    continue;
                }
                i++;
            }
            primes.add(number);
            number++;
            queries--;
        }

        for (int i = 0; i < primes.size(); i++)
             ans_primes[i] = primes.get(i);
        return ans_primes;
    }
}
