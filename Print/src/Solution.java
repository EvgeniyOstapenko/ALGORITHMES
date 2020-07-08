public class Solution {


    public static void main(String[] args) {
        int[] array = {-1, -1, -1};
        int max = array[0];
        int cell = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
                cell = i;
            }
        }

        System.out.println(cell);
        System.out.println(max);
    }
}
