public class Array2 {

    public static void main(String[] args) {

        int array[] = {0,5,6,4,34};

        int maxIndex = 0;


        for (int i = 0; i < array.length; i++) {
            if (maxIndex < array[i]){
                maxIndex = i;
            }
        }
        System.out.println(maxIndex + " - " + array[maxIndex]);

    }
}
