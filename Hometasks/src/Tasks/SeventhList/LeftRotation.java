package Tasks.SeventhList;

public class LeftRotation {


    public static void main(String[] args) {

        int d = 2;
        int[] a = {1, 2, 3, 4, 5};

        int count = a.length;
        while(count > 0){
            System.out.print(a[d] + " ");
            d++;
            count--;
            if(d == a.length) d = 0;
        }
    }
}
