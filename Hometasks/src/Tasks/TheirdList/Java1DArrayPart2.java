package Tasks.TheirdList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java1DArrayPart2 {

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
        int[] game = {0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1};
//        int[] game = {0, 0, 0, 1, 0, 0, 0};
//        int[] game = {0, 0, 0, 0, 0, 0};
//        int[] game = {0, 0, 1, 1, 0, 1};
        int leap = 9;

        System.out.println("array - " + Arrays.toString(game));
        System.out.println((canWin(leap, game)) ? "YES" : "NO");
    }
//        scan.close();

    private static boolean canWin(int leap, int[] game) {
        ArrayList<ArrayList<Integer>> arraysOfIndexes = new ArrayList<>();
        int countSublist = 0 ;
        int index = -1;
        boolean firstZero = true;
        for (int i = game.length - 1; i > 0; ) {
            if (game[i] == 1){
                index = -1;
                i--;
            }
            if ((firstZero) && game[i] == 0){
                firstZero = false;
                if ((i + leap) < game.length){
                    return false;
                }
            }
            if( game[i] == 0 ){
                index++;
                if (index == 0){
                    ArrayList<Integer> setOfZeros = new ArrayList<>();
                    countSublist++;
                    while (i >= 0 && game[i] == 0){
                       setOfZeros.add(i);
                       i--;
                    }
                    arraysOfIndexes.add(setOfZeros);
                }
            }
        }

        boolean isLastZeros = true;
        int countTrues = 0;
        for (int i = 0; i < countSublist; i++) {
            int[] currentArray = toArray(arraysOfIndexes.subList(i, i + 1));

            if (isLastZeros){
                for (int zeroInEnd : currentArray) {
                    if(leap > zeroInEnd){
                        return true;
                    }
                }
                isLastZeros = false;
            }

            System.out.println("currentArray" + Arrays.toString(currentArray));

            boolean isFirstZeros = true;
            for (int j = countSublist - 1; j > i; j--) {
                int[] nextArray = toArray(arraysOfIndexes.subList(j, j + 1));

                if (isFirstZeros){
                    for (int zeroInBeginning : nextArray) {
                        if(zeroInBeginning + leap > game.length){
                            return true;
                        }
                    }
                    isFirstZeros = false;
                }

                System.out.println("nextArray" +  Arrays.toString(nextArray));

                System.out.println(toFindOneMatch(currentArray, nextArray, leap));

                if(toFindOneMatch(currentArray, nextArray, leap)){
                    countTrues++;
                }
                System.out.println();
            }
            System.out.println("countTrues - " + countTrues);
            System.out.println("countSublist - " + countSublist);


            if((countSublist - 1) <= countTrues){
                return true;
            }

            System.out.println("----------------------------------");

        }
        return false;
    }

    static int[] toArray(List<ArrayList<Integer>> list){
        String string = list.toString();
        string = string.replaceAll("[,.\\[\\]]", "");
        String[] ints = string.split(" ");
        int[] array = Arrays.stream(ints).mapToInt(Integer::parseInt).toArray();
        return array;
    }

    static boolean toFindOneMatch(int[] currentArray, int[] nextArray, int leap){
        int i;
        int j;
        for (i = 0; i < currentArray.length; i++) {
            for (j = 0; j < nextArray.length; j++) {
                if ((currentArray[i] - leap) == nextArray[j]){
                    return true;
                }
            }
        }
        return false;
    }
}























//                    String string = list.toString();
//                    string = string.replaceAll("[,.\\[\\]]", "");
//                    String[] ints = string.split(" ");
//
//                    int[] array = Arrays.stream(ints).mapToInt(Integer::parseInt).toArray();
//                    System.out.println(Arrays.toString(array));

//        for (int i = 0; i < ints.length; i++) {
//            int a = Integer.parseInt(ints[i]);
//            System.out.print(a);
//        }










//        String a = "1";
//        Integer b = Integer.parseInt(a);



//        for (Object a : arraysOfIndexes.subList(0, 1)) {
//            System.out.println(a);
//        }



//        System.out.println(arraysOfIndexes);
//        System.out.println(arraysOfIndexes.get(0).get(1));
//        System.out.println(arraysOfIndexes.subList(0,1));
//        System.out.println(arraysOfIndexes.subList(1,2));




//    Integer[] arrayArray = (Integer[]) currentList.toArray();
//            for (int j = 0; j < arrayArray.length; j++) {
//        System.out.println(arrayArray);
//        }









//        if(leap == game.length - 1 && game[game.length - 1] == 0){
//            return true;
//        }

//    int rowOfUnits = 0;
//        for (int i = 0; i < game.length - 1; i++) {
//        if(game[i] == 1 && game[i + 1] != 0) rowOfUnits++;
//        }
//        if(game[game.length - 2] == 1) rowOfUnits++;
//        System.out.println(rowOfUnits);
//
//        if(leap > rowOfUnits){
//        return true;
//        }
//        return false;v 1
//10 3
//0 1 1 0 1 1 1 0 1 1


//    private static boolean canWin(int leap, int[] game) {
//        ArrayList<Integer> counts = new ArrayList<>();
//        int count = 0;
//        boolean flag = false;
//        for (int i = 0; i < game.length; i++) {
//            if(game[i] == 1){
//                flag = true;
//                count++;
//                if (i == game.length - 1) counts.add(count);
//                continue;
//            }
//            if (game[i] == 1 && flag){
//                count++;
//                continue;
//            }
//            if (game[i] == 0){
//                flag = false;
//                counts.add(count);
//                count = 0;
//            }
//        }
//        int maxUnitsInRow = Collections.max(counts);
//        if (maxUnitsInRow < leap){
//            return true;
//        }
//        return false;
//    }

//for (int i = 0; i < game.length; ) {
//        if(i + leap > game.length - 1){
//        return true;
//        }else if(game[i + leap] == 0){
//        i = i + leap;
//        continue;
//        }else if (game[i + 1] == 0){
//        i++;
//        continue;
//        }
//        break;
//        }
//        return false;


//    private static boolean canWin(int leap, int[] game) {
//        int i = 0;
//        while (i < game.length - 1) {
//            if(i + leap > game.length - 1){
//                break;
//            }
//            if (game[i + leap] == 0) {
//                i = i + leap;
//                continue;
//            } else if (game[i + 1] == 0) {
//                game[i] = 1;
//                i++;
//                continue;
//            } else if (i - 1 >= 0 && game[i - 1] == 0) {
//                game[i] = 1;
//                i--;
//                continue;
//            }
//            System.out.println(Arrays.toString(game));
//            return false;
//        }
//        return true;
//    }