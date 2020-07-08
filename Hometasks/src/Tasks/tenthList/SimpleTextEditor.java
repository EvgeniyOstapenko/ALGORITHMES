package Tasks.tenthList;

import java.util.*;
import java.util.concurrent.DelayQueue;

public class SimpleTextEditor {
    public static StringBuilder string = new StringBuilder();
    public static Deque<StringBuilder> stack = new ArrayDeque<>();

    public static void main(String[] args) {
        stack.push(string);
//        Scanner scanner = new Scanner(System.in);
//        int number_of_operations = scanner.nextInt();
//
//        while (number_of_operations-- > 0){
//            int operation = scanner.nextInt();
//            editor(operation, scanner);
//        }
        editor(1, new StringBuilder("abc"));
        editor(3, new StringBuilder("3"));
        editor(2, new StringBuilder("3"));
        editor(1, new StringBuilder("xy"));
        editor(3, new StringBuilder("2"));
        editor(4, new StringBuilder(""));
        editor(4, new StringBuilder(""));
        editor(3, new StringBuilder("1"));
        System.out.println(string);
    }

//    public static void editor(int i, Scanner scanner) {
//        if(i == 1) {
//            string = string.append(scanner.next());
//            stack.push(string);
//        }else if(i == 2){
//            Integer index = scanner.nextInt();
//            string = string.delete(string.length() - index, string.length());
//            stack.push(string);
//        }else if(i == 3){
//            Integer index = scanner.nextInt();
//            char string_in_index = string.charAt(index - 1);
//            System.out.println(string_in_index);
//        }else {
//            stack.pop();
//            string = stack.peek();
//        }
//
//    }

    public static void editor(int i, StringBuilder stringBuilder) {
        if(i == 1) {
            string = string.append(stringBuilder);
            stack.push(string);
        }else if(i == 2){
            Integer index = Integer.valueOf(stringBuilder.toString());
            string = string.delete(string.length() - index, string.length());
            stack.push(string);
        }else if(i == 3){
            Integer index = Integer.valueOf(stringBuilder.toString());
            char string_in_index = string.charAt(index - 1);
            System.out.println(string_in_index);
        }else {
            stack.pop();
            string = stack.peek();
        }

    }

}
