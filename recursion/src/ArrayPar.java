public class ArrayPar {
    private long[] theArray;
    private int nElems;

    public ArrayPar(int max) {
        theArray = new long[max];
        nElems = 0;
    }


    public void insert(long value) {
        theArray[nElems++] = value;
    }

    public int size() {
        return nElems;
    }

    public void display() {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println("");
    }

    public void swap(int dex1, int dext2) {
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dext2];
        theArray[dext2] = temp;
    }

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right + 1;

        while (true) {

            while (leftPtr < right && theArray[++leftPtr] < pivot) ;
            while (rightPtr > left && theArray[--rightPtr] > pivot) ;

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        return leftPtr;
    }

    public static void main(String[] args) {
        ArrayPar arr = new ArrayPar(16);
        arr.insert(9);
        arr.insert(1);
        arr.insert(1);
        arr.insert(1);
        arr.insert(5);
        arr.insert(4);
        arr.insert(3);
        arr.insert(2);
        arr.insert(1);
        arr.insert(0);

        long pivot = 4;
        arr.display();

        arr.partitionIt(0, arr.size() - 1, pivot);
        arr.display();
    }
}