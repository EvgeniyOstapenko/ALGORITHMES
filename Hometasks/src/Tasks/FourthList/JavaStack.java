package Tasks.FourthList;

import java.util.*;

public class JavaStack {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            if(isBalanced(sc.nextLine())){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
//        System.out.println(isBalanced("dfsd"));
//        System.out.println(getOppositeToken("["));
    }

    private static boolean isBalanced(String line) {
//        line = "((())))";
        String[] tokens = line.split("" );
//        System.out.println(Arrays.toString(tokens));
//        String[] tokens = { "{", "}", "(" };
        Deque<String> stack = new LinkedList<>();
        String[] leftTokens = {"(", "{", "["};
        String[] rightTokens = {")", "}", "]"};


        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (isBelongs(leftTokens, token)) {
                stack.push(tokens[i]);
                continue;
            }
            if (isBelongs(rightTokens, token)) {
                String tokenFromStack = stack.peek();
                if(tokenFromStack == null){
                    return false;
                }
                if ( isOppositeToken(tokenFromStack, token)) {
                    stack.pop();
                    continue;
                }else {
                    return false;
                }
            }
            if (!stack.isEmpty()) return false;
        }
        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }



    public static boolean isOppositeToken(String token, String tokenFromStack){
            if(token.equals("(") && tokenFromStack.equals(")")){
                return true;
            }else if(token.equals("{") && tokenFromStack.equals("}")){
                return true;
            }else if(token.equals("[") && tokenFromStack.equals("]")){
                return true;
            }
            return false;
    }

    public static String getOppositeToken(String token){
        String[] leftTokens = {"(", "{", "["};
        String[] rightTokens = {")", "}", "]"};
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if(token == leftTokens[i]){
                index = i;
            }
        }
        return rightTokens[index];
    }

    public static boolean isBelongs(String[] list, String token){
        return Arrays.stream(list).anyMatch(token :: equals);
    }

}
