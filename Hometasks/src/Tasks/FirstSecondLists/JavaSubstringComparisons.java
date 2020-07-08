package Tasks.FirstSecondLists;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k){
        String currentSubstring = s.substring(0, k);
        String smallest = currentSubstring;
        String largest = currentSubstring;

        for (int i = 0; i <= s.length() - k ; i++) {
            currentSubstring = s.substring(i, i + k);
            if(currentSubstring.compareTo(largest) > 0){
                largest = currentSubstring;
            }
            if (currentSubstring.compareTo(smallest) < 0){
                smallest = currentSubstring;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
//        int k = scanner.nextInt();
//        scanner.close();
        String s = "abcd";
        int k = 3;

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargestQQ(String s, int k){
        SortedSet<String> sets = new TreeSet<String>();

        for(int i = 0; i <= s.length() - k; i++){
            sets.add(s.substring(i, i + k));
        }
        return sets.first() + "\n" + sets.last();
    }
}
