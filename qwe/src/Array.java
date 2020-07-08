public class Array {

    public static void main(String[] args) {

        int array[] = {40,5,7,4,3,6,7,89};

        int max = 0;

        for (int i = 0; i < array.length; i++) {

            if (max < array[i]){
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
