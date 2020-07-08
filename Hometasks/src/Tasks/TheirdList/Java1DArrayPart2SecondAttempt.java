package Tasks.TheirdList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java1DArrayPart2SecondAttempt {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int q = scan.nextInt();
//
//        while (q-- > 0) {
//            int n = scan.nextInt();
//            int leap = scan.nextInt();
//
//            int[] game = new int[n];
//            for (int i = 0; i < n; i++) {
//                game[i] = scan.nextInt();
//            }
//        int[] game = {0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1};
        int[] game = {0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0};
//
//        int[] game = {0, 0, 1, 0};
//        int[] game = {0, 0, 0, 0, 0, 0};
//        int[] game = {0, 0, 1, 1, 0, 1};
//        int[] game = {0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1};

        int leap = 4;

        System.out.println("array - " + Arrays.toString(game));
        System.out.println((canWin(leap, game)) ? "YES" : "NO");
    }
//        scan.close();

    private static boolean canWin(int leap, int[] game) {
        return canWin(leap, game, 0);
    }

    private static boolean canWin(int leap, int[] game, int i){
        if (i < 0 || game[i] == 1) return false;
        if ((i == game.length - 1) || i + leap > game.length - 1) return true;

        game[i] = 1;
        return  canWin(leap, game, i + 1) ||
                canWin(leap, game, i - 1) ||
                canWin(leap, game, i + leap);
    }
}