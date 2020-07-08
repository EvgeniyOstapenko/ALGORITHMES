import java.util.Arrays;

public class Repeating {
    int[] array = {23, 43, 1, 45, 32, 34};

    public void bubleSort() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(array));

    }

    public void bubleSortSecond() {

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(array));

    }


    public static void main(String[] args) {
        Repeating repeating = new Repeating();
        repeating.bubleSortSecond();
    }
}
