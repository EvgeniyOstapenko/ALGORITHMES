import java.util.Scanner;
import java.util.Stack;

public class Draft {
    int i = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String string = "";
        Stack<String> stack = new Stack<>();
        stack.push(string);
        for(int i = 0; i < n; i++){
            int t = in.nextInt();
            if(t == 1){
                string = string + in.next();
                stack.push(string);
            }
            else if(t == 2){
                string = string.substring(0, string.length() - in.nextInt());
                stack.push(string);
            }
            else if(t == 3){
                System.out.println(string.charAt(in.nextInt() - 1));
            }
            else{
                stack.pop();
                string = stack.peek();
            }
        }
    }
}


