package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterExpressions {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("is");
        Matcher matcher = pattern.matcher("Jack is a boy");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + ", ");
        }
        System.out.println(" ");
    }
}
