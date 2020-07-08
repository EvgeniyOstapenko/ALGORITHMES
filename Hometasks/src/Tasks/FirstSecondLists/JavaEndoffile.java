package Tasks.FirstSecondLists;

import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaEndoffile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List lineList = new LinkedList();
        while(sc.hasNext()){
            String line = sc.nextLine();
            lineList.add(line);
        }
        int a = 0;
        for(Object line : lineList){
            a++;
            System.out.println(a + " " + line);
        }
        sc.close();
    }

    public static void mainq(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }


    }
}
