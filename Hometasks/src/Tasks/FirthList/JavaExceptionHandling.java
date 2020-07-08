package Tasks.FirthList;

import java.util.Scanner;

public class JavaExceptionHandling {

    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private static class MyCalculator {
        double result;
        public long power(int n, int p) throws Exception {
            try{
                 if(n < 1 ||  p < 1 ){
                    if(n == 0 ||  p == 0){
                        throw new NullPointerException();
                    }else {
                        throw new Exception();
                    }
                 }else if(n > 0 || p > 0 ){
                     result = Math.pow(n, p);
                 }
            }catch(NullPointerException e){
                System.out.println("n and p should not be zero.");
            }catch(Exception e){
                System.out.println("n or p should not be negative");
            }
            return (long) result;
        }
    }
}
