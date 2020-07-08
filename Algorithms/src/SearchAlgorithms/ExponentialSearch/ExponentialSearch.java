package SearchAlgorithms.ExponentialSearch;

import java.util.Arrays;

public class ExponentialSearch {

    public static int exponentialSearch(int[] integers, int elementToSearch) {

        if (integers[0] == elementToSearch)
            return 0;
        if (integers[integers.length - 1] == elementToSearch)
            return integers.length;

        int range = 1;

        while (range < integers.length && integers[range] <= elementToSearch) {
            range = range * 2;
        }

        return Arrays.binarySearch(integers, range / 2, Math.min(range, integers.length), elementToSearch);
    }

    public static void main(String[] args) {
        int index = exponentialSearch(new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99}, 67);
        System.out.println(index);
    }

}
