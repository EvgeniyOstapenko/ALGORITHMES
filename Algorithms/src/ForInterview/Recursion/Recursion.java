package ForInterview.Recursion;

public class Recursion {

    public static void rec(int lower, int upper){

        if(lower >= upper){
            return;
        }
        int middle = (lower + upper) / 2;
        rec(lower, middle);
        rec(middle + 1, upper);
        System.out.println("do for : " + lower + " - " + upper);
    }

    public static void recTwo(int number){

        if(number <= 0){
            return;
        }
        recTwo(number - 1);
        System.out.println("do for : " + number);
    }

    public static void main(String[] args) {
        rec(1,8);
//        recTwo(8);
    }
}

