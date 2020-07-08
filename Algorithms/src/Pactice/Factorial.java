package Pactice;

public class Factorial {

    public static int factorialNonrecursive(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int myFactorialNonrecursive(int number){
        int fact = number;
        for (int i = number; i  > 1; i--) {
            fact = fact * (i - 1);
        }
        return fact;
    }

    public static int factorialRecursive(int number){
        if(number == 0){
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(myFactorialNonrecursive(5));
        System.out.println(factorialNonrecursive(5));
    }
}
