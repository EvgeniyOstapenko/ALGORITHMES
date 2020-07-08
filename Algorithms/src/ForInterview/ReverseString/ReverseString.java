package ForInterview.ReverseString;


public class ReverseString {

    public static String reverseString(String string){
        char[] oldString = string.toCharArray();
        char[] newString = new char[oldString.length];
        int j = 0;
        for (int i = oldString.length - 1; i >= 0; i--){
             newString[j++] = oldString[i];
        }
        return new String(newString);
    }

    public static String secondReverseString(String string){
        char[] oldString = string.toCharArray();
        char[] newString = new char[oldString.length];
        int j = 0;
        int i = oldString.length - 1;
        while(i >= 0) {
            newString[j++] = oldString[i--];
        }
        return new String(newString);
    }


    public static String thirdReverseString(String string){
        char[] newString = string.toCharArray();
        int j = 0;
        int i = newString.length - 1;
        while(j != j) {
            swap(newString, j++, i--);
        }
        return new String(newString);
    }

    public static void main(String[] args) {
        String string = "Hello";
        System.out.println( thirdReverseString(string));
    }

    public static int[] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static char[] swap(char[]array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

}
