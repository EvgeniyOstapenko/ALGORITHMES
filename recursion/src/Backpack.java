import java.util.Arrays;

public class Backpack {
    int[] array = {1, 2, 3, 4};
    int[] arrayNew = new int[array.length];
    int number = 7;
    int i = 0;
    int j = 0;

    int weight = 5;



    public void doing() {

        while (true) {
            if (i == array.length) {
                weight = 5;

                j++;
                for (i = j; i < array.length; i++) {
                    arrayNew[i - 1] = array[i];
                }
                array = Arrays.copyOf(arrayNew, array.length);
                i = 0;
                knapsack(weight, i);
            }

            while (weight >= array[i]) {
                weight = weight - array[i];

                if (weight == 0) {
                    System.out.println("and");
                    break;
                }

                i++;
                knapsack(weight, i);
            }

            while (weight < array[i]) {
                i++;
                knapsack(weight, i);
            }
        }

    }






    public void knapsack(int weight, int i) {


        if (i == array.length) {
            weight = 5;

            j++;
            for (i = j; i < array.length; i++) {
                arrayNew[i - 1] = array[i];
            }
            array = Arrays.copyOf(arrayNew, array.length);
            i = 0;
            knapsack(weight, i);
        }

        while (weight >= array[i]) {
            weight = weight - array[i];

            if (weight == 0) {
                System.out.println("and");
                break;
            }

            i++;
            knapsack(weight, i);
        }

        while (weight < array[i]) {
            i++;
            knapsack(weight, i);
        }

    }





    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        backpack.knapsack(5, 0);
    }
}