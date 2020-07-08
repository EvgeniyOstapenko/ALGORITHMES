package Tasks.FirstSecondLists;

import java.util.Arrays;
import java.util.ListResourceBundle;

public class JavaAnagrams {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();

        String a = "wee";
        String b = "ewe";

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String a, String b) {
        char[] listA = a.toCharArray();
        char[] listB = b.toCharArray();
        Arrays.sort(listA);
        Arrays.sort(listB);

        if (listA.length != listB.length){
            return false;
        }
        if (Arrays.equals(listA, listB)) return true;
        return false;
    }









    private static boolean isAnagram1(String a, String b) {
        char[] listA = a.toCharArray();
        char[] listB = b.toCharArray();
        Arrays.sort(listA);
        Arrays.sort(listB);

        if (listA.length != listB.length){
            return false;
        }
        return search1(listA, listB);
    }

    private static boolean search1(char[] listA, char[] listB) {
        for (int i = 0; i < listA.length; i++) {
            if (listA[i] != listB[i]) return false;
        }
        return true;
    }

}
