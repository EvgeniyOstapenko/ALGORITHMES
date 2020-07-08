public class Do {
    int[] array = {1, 2, 3, 4, 5};
    int[] summ = new int[5];
    int k = 0;

    public void doing() {
        for (int i = 0; i < array.length; i++) {
            int weight = 8;

            for (int j = i; j < array.length; j++) {
                weight = weight - array[j];
                System.out.print(array[j]);

                if (weight < 0) {
                    weight = weight + array[j];
                    System.out.println();
                }
                if (weight == 0) {
                    System.out.println(" - Found");
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        Do foo = new Do();
        foo.doing();
    }
}
