package Tasks.FirthList;

import javax.management.ObjectName;
import java.util.Scanner;

public class JavaInterface {
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = 6;
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();

        Object object = new Object();

    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }

     static class MyCalculator implements AdvancedArithmetic{
         public int divisor_sum(int n){
                 int count = 0;
                 int sum = 0;
                 while(count++ <= n){
                     if(n % count == 0){
                         sum = sum + count;
                     }
                 }

            return sum;
        }
    }

    interface AdvancedArithmetic{
        int divisor_sum(int n);
    }
}
