package Tasks.FirstSecondLists;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

    private static class MyRegex {
//        String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
//        String pattern = num + "." + num + "." + num + "." + num;


          String pattern = "([01]?\\d{1,2})";
//          String num = "([0-2]?[0-5]?[0-5]?)";
//          String pattern = num + "." + num + "." + num + "." + num;
    }
}
