package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterSets {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-b]");
        Matcher matcher = pattern.matcher("abc");
        while (matcher.find()){
            System.out.print(matcher.start() + "-" + matcher.group() + ", ");
        }
    }
}
