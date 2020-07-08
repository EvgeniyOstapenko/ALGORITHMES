import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Fibonacci {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    public int Fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }

    public static void main(String args[]){
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.Fib(43));
    }
}