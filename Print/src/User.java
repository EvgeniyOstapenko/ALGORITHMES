import myUtils.Print;

import java.util.Arrays;

public class User {
    public static void main(String[] args) {
        int[][] fields = new int[4][2];
        for (int i = 0; i < 4; i++) {
             fields[i] = new int[]{0, 1};
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(fields[i][j]);
            }
            System.out.println();
        }
    }
}
