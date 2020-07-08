package Tasks.EleventhList;

import java.util.*;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque stack1 = new LinkedList<>();
        Deque stack2 = new LinkedList<>();

        int number_of_query = scanner.nextInt();
        while (number_of_query-- > 0) {
            int query = scanner.nextInt();
            if (query == 1) {
                stack1.push(scanner.nextInt());
            } else {
                if(stack2.isEmpty()){
                    while (!stack1.isEmpty()){
                        stack2.push(stack1.pop());
                    }
                } if (query == 2) {
                    stack2.pop();
                } else {
                    System.out.println(stack2.peek());
                }
            }
        }
    }
}
