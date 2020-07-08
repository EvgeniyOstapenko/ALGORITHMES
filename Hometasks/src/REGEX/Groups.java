package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static void main(String[] args) {
//        System.out.println(
//                "EditPad Lite".replaceAll("EditPad (Lite|Pro)", "\\I1 version")
//        );

        //to find tags!!!
        Pattern pattern = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>");
        Matcher matcher = pattern.matcher("This is a <EM><A>first/A></EM> test");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
        System.out.println("");
    }
}
