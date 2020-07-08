import java.util.Arrays;

public class Pack {
    int[] array = {1, 2, 3, 4, 5};
    int weight = 7;
    int[] answer = new int[5];
    int j = 0;
    int i = 0;

    public void toPut() {

        while (true) {
            if (array[i] == weight) {
                answer[j] = array[i];
                break;
            }

            if (array[i] < weight) {
                answer[j++] = array[i];
                weight = weight - array[i];

                if (i == (array.length - 1)) {
                    i = -1;
                }

                i++;
            }

            if (array[i] > weight) {

                for (int k = 0; k < answer.length; k++) {
                    answer[k] = 0;
                }

                weight = 7;
                j = 0;
            }
        }
    }

    public static void main(String[] args) {
        Pack pack = new Pack();
        pack.toPut();
        System.out.println(Arrays.toString(pack.answer));
    }
}
