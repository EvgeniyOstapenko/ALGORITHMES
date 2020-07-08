package ForInterview.Factorial;

public class Factorial {
    public static int findFactorial(int x){
        if (x == 1)
            return 1;
        return x * findFactorial(x - 1);
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
