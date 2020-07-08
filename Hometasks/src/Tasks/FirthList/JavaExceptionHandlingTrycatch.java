package Tasks.FirthList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTrycatch {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 1;
        int y = 0;

        try{
                System.out.println(x / y );
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

}
