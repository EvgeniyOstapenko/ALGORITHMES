public class ArraySh {
    private long[] theArray;
    private int nElems;

    public ArraySh(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        theArray[nElems++] = value;
    }

    public void display() {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println("");
    }

//    public void shellSort() {
//        int inner, outer;
//        long temp;
//        int h = 1;
//        while (h <= nElems / 3) {
//            h = h * 3 + 1;
//        }
//
//        while (h > 0) {
//            for (outer = h; outer < nElems; outer++) {
//                temp = theArray[outer];
//                inner = outer;
//
//                while (inner > h - 1 && theArray[inner - h] >= temp) {
//                    theArray[inner] = theArray[inner - h];
//                    inner -= h;
//                }
//
//                theArray[inner] = temp;
//            }
//            h = (h - 1) / 3;
//        }
//    }

    public void shellSort() {
        int d = theArray.length / 2;

        while (d > 0) {
            for (int i = 0; i < theArray.length - d; i++) {

                if (theArray[i] > theArray[i + d]) {
                    long temp = theArray[i];
                    theArray[i] = theArray[i + d];
                    theArray[i + d] = temp;

                }
            }
            d = d / 2;
        }
    }

    public static void main(String[] args) {
        int maxSize = 8;
        ArraySh arr;
        arr = new ArraySh(maxSize);

//        for (int j = 0; j < maxSize; j++) {
//            long n = (int) (java.lang.Math.random() * 99);
//            arr.insert(n);
//        }

        arr.insert(7);
        arr.insert(6);
        arr.insert(5);
        arr.insert(9);
        arr.insert(3);
        arr.insert(5);
        arr.insert(5);
        arr.insert(0);

        arr.display();
        arr.shellSort();
        arr.display();
    }
}
