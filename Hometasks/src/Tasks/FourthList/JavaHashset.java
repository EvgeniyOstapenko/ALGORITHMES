package Tasks.FourthList;

import java.util.*;
import java.util.stream.Stream;

public class JavaHashset {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            String [] pair_left = new String[t];
            String [] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }

            Set<String> names = new HashSet<>();
            int count = 0;
            for (int i = 0; i < t; i++) {
                if(names.add(pair_left[i] + ", " + pair_right[i])){
                    count++;
                }
                System.out.println(count);
            }
    }
}




//        Set<String> setLeft = new HashSet<>();
//        Set<String> setRight = new HashSet<>();
//            for (int i = 0; i < t; i++) {
//        setLeft.add(pair_left[i]);
//        setRight.add(pair_right[i]);
//        System.out.println(setLeft.size() > setRight.size() ? setLeft.size() : setRight.size());
//        }



//                Scanner scanner = new Scanner(System.in);
//                Set<String> set =  new HashSet<>();
//                int T = scanner.nextInt();
//                scanner.nextLine();
//                while (T-- > 0){
//                String line = scanner.nextLine();
//                set.add(line);
//                System.out.println(set.size());
//                }
