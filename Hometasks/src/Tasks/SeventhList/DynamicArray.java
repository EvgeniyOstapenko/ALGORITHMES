package Tasks.SeventhList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> seqList = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();
        int lastAnswer = 0;

        for(List<Integer> list : queries){
            int type  = list.get(0);
            int x     = list.get(1);
            int y     = list.get(2);;
            int index = (x ^ lastAnswer) % n;

            switch(type) {
                case 1:
                    if(seqList.size() < index){
                        ArrayList<Integer> newList = new ArrayList();
                        newList.add(y);
                        seqList.get(index).addAll(newList);
                    }else{
                        seqList.get(index).add(y);
                    }
                    break;

                case 2:
                    lastAnswer = seqList.get(index).get(y % seqList.size());
                    answers.add(lastAnswer);
                    break;
            }
        }

        return answers;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = Result.dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
