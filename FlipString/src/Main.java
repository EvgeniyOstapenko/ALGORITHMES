import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            String someString = "!dneirf olleH";
            System.out.println(flipLine(someString));
        }

        public static char[] flipLine(String someString){
            int i, j;
            char temp;
            char [] string = someString.toCharArray();
            for (i = 0, j = someString.length() - 1; i < j; i++, j--) {
                temp = string[i];
                string[i] = string[j];
                string[j] = temp;
            }
            return string;
        }
}
