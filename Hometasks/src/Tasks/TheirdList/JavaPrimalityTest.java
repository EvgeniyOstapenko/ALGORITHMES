package Tasks.TheirdList;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(n);
//        if (bigInteger.isProbablePrime(100)){
//            System.out.println("prime");
//        }else {
//            System.out.println("not prime");
//        }

        System.out.println(bigInteger.isProbablePrime(100) ? "prime" : "not prime");
        scanner.close();
    }
}
