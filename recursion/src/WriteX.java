import java.util.Arrays;

public class WriteX {
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    char[] array1 = new char[100];



    public void toMake(int button, int top) {
        if (button == top) {
            return;
        }

        int mid = (button + top) / 2;

        toMake(button, mid);
        toMake(mid + 1, top);

        array1[mid] = 'X';
        System.out.print(Arrays.toString(array1));
        array1[mid] = '-';
        System.out.println();
    }

    public static void main(String[] args) {
        WriteX writeX = new WriteX();
        writeX.toMake(0,20);
    }
}
