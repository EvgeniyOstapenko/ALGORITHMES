package SearchAlgorithms.KnutMorrisPrattAlgorithm;

import java.util.Arrays;

public class KnuthMorrisPrathPatternSearch {

    public static int[] compilePatternArray(String pattern) {
        int patternLength = pattern.length();
        int len = 0;
        int i = 1;
        int[] compliedPatternArray = new int[patternLength];
        compliedPatternArray[0] = 0;

        while (i < patternLength) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                compliedPatternArray[i] = ++len;
                i++;
            } else {
                if (len != 0) {
                    len = compliedPatternArray[len - 1];
                } else {
                    compliedPatternArray[i] = 0;
                    i++;
                }
            }
        }
        System.out.println("Compiled Pattern Array " + Arrays.toString(compliedPatternArray));
        return compliedPatternArray;
    }

    public static void myPerformKMPSearch(String text, String pattern) {
        int[] compliedPatternArray = compilePatternArray(pattern);
        int textIndex = 0;
        int patternIndex = 0;
        int firstIndex = 0;
        boolean firstEntry = true;

        while (textIndex < text.length()) {
            if (pattern.charAt(patternIndex) == text.charAt(textIndex)) {
                if(firstEntry == true ){
                    firstIndex = patternIndex + 1;
                    firstEntry = false;
                }
                patternIndex++;
                textIndex++;
                if (patternIndex == pattern.length()){
                    System.out.println("The string contains reported test.");
                    System.out.println("Found in : " + (textIndex - patternIndex) + "-" + (textIndex - 1));
                    return;
                }
            }else  {
                if(patternIndex == 0){
                    textIndex++;
                    if(textIndex == text.length()){
                        System.out.println("The string does not contain reported test.");
                        return;
                    }
                }else {
                    patternIndex = compliedPatternArray[patternIndex - 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        String pattern = "AAAAAA";
        String text = "AAAAAAABAGAHUHDJKDDKSHAAJF";

        KnuthMorrisPrathPatternSearch.myPerformKMPSearch(text, pattern);

    }
}
