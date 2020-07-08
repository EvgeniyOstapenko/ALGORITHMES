package Tasks.TasksSixthList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    PerformOperation isOdd(){
        PerformOperation p = (a) ->  (a % 2 != 0);
        return p;
    }
    PerformOperation isPrime(){
        PerformOperation p = (a) -> {
            for (int i = 2; i <= a / 2; i++) {
                if(a % i == 0)   return false;
            }
            return true;
        };
        return p;
    }
    PerformOperation isPalindrome(){
        PerformOperation p = (a) -> {
            String number = Integer.toString(a);
            int last = number.length() - 1;
            int first = 0;
            while (first < number.length()){
                System.out.println(number.charAt(first)+ " - " + number.charAt(last));
                if(number.charAt(first) != number.charAt(last)) return false;
                first++;
                last--;
            }
            return true;
        };
        return p;
    }
}

public class JavaLambdaExpressions {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}




