import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;

public class CommonMain {
    public static void main(String[] args) throws IOException {
        InfixApp postfix = new InfixApp();
        String input = postfix.getPostfix();

        BracketChecker theChecker = new BracketChecker(input);

        if (theChecker.checking()) {
            ParsePost aParser = new ParsePost(input);
            int output = aParser.doParse();
            System.out.println("Evaluates to: " + output);
        }

    }

}
