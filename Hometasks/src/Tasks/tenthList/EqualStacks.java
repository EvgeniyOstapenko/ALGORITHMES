package Tasks.tenthList;

import java.util.*;

public class EqualStacks {

     public static void main(String[] args) {
//        int[] first  = {3, 2, 1, 1, 1};
//        int[] second = {4, 3, 2};
//        int[] third  = {1, 1, 4, 1};

         int[] first  = {3,2,1,1,1};
         int[] second = {4,3,2};
         int[] third  = {4};
         System.out.println(equalStacks(first, second, third));
     }

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int current_sum1 = 0;
        int current_sum2 = 0;
        int current_sum3 = 0;

        Deque<Integer> stack1 = new ArrayDeque();
        Deque<Integer> stack2 = new ArrayDeque();
        Deque<Integer> stack3 = new ArrayDeque();

        for (int i = h1.length - 1; i >= 0; i--) {
            current_sum1 = current_sum1 + h1[i];
            stack1.push(current_sum1);
        }
        for (int i = h2.length - 1; i >= 0; i--) {
            current_sum2 = current_sum2 + h2[i];
            stack2.push(current_sum2);
        }
        for (int i = h3.length - 1; i >= 0; i--) {
            current_sum3 = current_sum3 + h3[i];
            stack3.push(current_sum3);
        }

        while (true){
            if(stack1.isEmpty()  || stack2.isEmpty() || stack3.isEmpty()){
                return 0;
            }
            current_sum1 = stack1.peek();
            current_sum2 = stack2.peek();
            current_sum3 = stack3.peek();
            if(current_sum1 == current_sum2 && current_sum3 == current_sum2){
                return current_sum1;
            }

//            System.out.print(stack1.peek());
//            System.out.print(stack2.peek());
//            System.out.print(stack3.peek());
//            System.out.println();
            if(stack1.peek() >= stack2.peek() && stack1.peek() >= stack3.peek()){
                stack1.pop();
            } else if (stack2.peek() >= stack1.peek() && stack2.peek() >= stack3.peek()){
                stack2.pop();
            } else if(stack3.peek() >= stack2.peek() && stack3.peek() >= stack1.peek()){
                stack3.pop();
            }
        }
    }

//    static public int[] form_stack (Map map){
//        return Math.max(map.get(1).)
//    }

    static public int sum (int[] h){
        int sum = 0;
        for (int i = 0; i < h.length; i++) {
            sum = sum + h[i];
        }
        return sum;
    }

//        while (sum1 != sum2 || sum2 != sum3){
//            if(sum1 > sum2){
//                if(sum1 > sum3){
//                    sum1 = sum1 - stack1.pop();
//                    System.out.println("stack1");
//                }else {
//                    sum3 = sum3 - stack3.pop();
//                    System.out.println("stack3");
//                }
//            }else {
//                if(sum1 > sum3){
//                    sum2 = sum2 - stack2.pop();
//                    System.out.println("stack2");
//                }
//            }
//
//        }



     static public int equalStacks1(int[] h1, int[] h2, int[] h3) {
        Deque stack1 = new LinkedList();
        Deque stack2 = new LinkedList();
        Deque stack3 = new LinkedList();

        stack1.addAll(Arrays.asList(h1));
        stack2.addAll(Arrays.asList(h2));
        stack3.addAll(Arrays.asList(h3));

        int sum1 = Arrays.stream(h1).sum();
        int sum2 = Arrays.stream(h1).sum();
        int sum3 = Arrays.stream(h1).sum();

         Map<Deque, Integer> map1 = new HashMap<>();
         map1.put(stack1, sum1);
         map1.put(stack2, sum2);
         map1.put(stack3, sum3);
         Map<Integer, Deque> map2 = new HashMap<>();
         map2.put(sum1, stack1);
         map2.put(sum2, stack2);
         map2.put(sum3, stack3);

        int biggest = Math.max(map1.get(stack1),
                      Math.max(map1.get(stack2), map1.get(stack3)));

        while(!map1.get(stack1).equals(map1.get(stack3)) ||
              !map1.get(stack2).equals(map1.get(stack3))){

              Deque current_stack = map2.get(biggest);
              current_stack.pop();
        }


        return 1;
    }
}