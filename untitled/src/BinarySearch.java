import java.util.Arrays;
import java.util.TreeSet;

public class BinarySearch {

    private Integer[] array;
    private Integer nElems;

     BinarySearch(Integer nElems){
         this.nElems = nElems;
         Integer[] array = new Integer[nElems];
         for (int i = 0; i < array.length; i++) {
             array[i] = 2 * i;
         }
         this.array = array;
     }

    BinarySearch(Integer[] array) {
        this.array = array;
        this.nElems = array.length;
    }

     public  Integer[] getArray() {
         return array;
     }

     public int getMax() {
         int maxNuber = 0;
         if (array == null){
             return -1;
         }else { for (int i = 0; i < nElems; i++) {
                 if (maxNuber < array[i]) {
                     maxNuber = array[i];
                     }
               }
         }
         return maxNuber;
     }

    public void removeMax() {
        delete(getMax());
    }

     public void deleteArray() {
         array = null;
     }

    public void toOrderedArray() {
        for (int i = 0; i < nElems; i++) {
            for (int j = 0; j < i; j++)  {
                if (array[j] > array[i]) {
                    int var = array[i];
                    array[i] = array[j];
                    array[j] = var;
                }
            }
        }
    }

    public void bubbleSort() {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int var = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = var;
                }

            }
        }
    }

    public void bubbleSortNew() {
        int out, in;
        for (out = array.length - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] < array[in + 1]) {
                    swap(in + 1, in);
                }

            }
        }
    }

    public void bubbleSortNewer() {
        int out, in;
        for (out = 0; out < array.length - 1; out++) {
            for (in = array.length - 1; in > out; in--) {
                if (array[in] > array[in - 1]) {
                    swap(in, in - 1);
                }

            }
        }
    }

    public void bubbleSortSimple() {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    swap(j, j - 1);
                }

            }
        }
    }

    public void median() {
        bubbleSort();
        System.out.println(Arrays.toString(array));
        int index = array.length;
        if (array.length / 2 != 0) {
            System.out.println("median - " + array[index / 2]);
        } else {
            int midle = array.length / 2;
            System.out.println("median - " + (array[midle] + array[midle +1]) / 2);
        }
    }

    public void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems; out++) {
            min = out;
            for (in = 0; in < nElems; in++) {
                if (array[in] < array[min]) {
                    min = in;
                    swap(out, in);
                }
            }
        }
    }

    public void insertionSortFirst() {
        int j, temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            for (j = i - 1; j >= 0 && array[j] > temp ; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }

    }

    public void insertionSortSecond() {
        int in, out;
        for (out = 0; out < nElems; out++) {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
    }

    public void insertionSortThird() {
        int in, out;
        int count1 = 0;
        int count2 = 0;
        for (out = 0; out < array.length; out++) {
            int temp = array[out];
            in = out;
            if (in > 0) {count1++;}
                while (in > 0 && array[in - 1] >= temp) {
                    count2++;
                    array[in] = array[in - 1];
                    --in;
                }
            array[in] = temp;


        }
        System.out.println("the amount of comparisons = " +count1 +  ", the amount of movement = " + count2);
        System.out.println("N*N = " + (count1 + count2));
    }

    public void insertionSortAndNoDuplicates() {
        int in, out;
        for (out = 0; out < array.length; out++) {
            int temp = array[out];
            in = out;

            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;

        }
    }

    public void insertionSortAndNoDuplicatesSecond() {
        int j, temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];

            for (j = i - 1; j >= 0 && array[j] > temp ; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }

    }

    public void toFillArrayRandomly() {
        for (int i = 0; i < nElems; i++) {
            Integer n = (int) (java.lang.Math.random() * (10));
            array[i] = n;
        }
    }

    public void toFillArrayRandomly(int size) {
        Integer[] newArray = new Integer[size];
        for (int i = 0; i < newArray.length; i++) {
            Integer n = (int) (java.lang.Math.random() * (10));
            newArray[i] = n;
        }
        this.array = newArray;
    }

    public void maxElementToEnd() {
        for (int i = 1; i < nElems; i++) {
            if (array[i] < array[i - 1]) {
                int var = array[i];
                array[i] = array[i - 1];
                array[i - 1] = var;
            }
        }
    }

    public int find(int searchKey) {
        int lowerBound = 0;
        int upperBound = nElems  - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (array[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (array[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void noDups() {
        TreeSet<Integer> set = new TreeSet();
        for (int i = 0; i < nElems; i++) {
            set.add(array[i]);
        }
        System.out.println(set);

        Integer[] array1 = set.toArray(new Integer[set.size()]);
        this.array = array1;
    }

    public void oddEvenSorting() {
        for (int i = 0; i < array.length; i++) {
            for (int j = ((i % 2) == 0) ? 0 : 1; j < array.length - 1; j += 2) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println();
                    display();
                }
            }
        }
    }
    public void conectArrays(Integer[] array1, Integer[] array2) {
        Integer[] array3 = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array3));

        this.array = array2;
    }

    public void insert(int value) {
         int i;
         for (i = 0; i < nElems; i++) {
             if (array[i] > value) {
                 break;
             }
         }
            for (int j = nElems - 1; j > i; j--) {
                array[j] = array[j - 1];
            }
         array[i] = value;
    }

    public boolean delete(int value) {
        int j = find(value); // returns index
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems - 1; k++) {
                array[k] = array[k + 1];
            }
            array[nElems - 1] = 0;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void display(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void arrayShift() {
        int count = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == -1) {
                count++;
            }
        }
        for (int j = count; j < array.length; j++) {
            array[Math.abs( j - count)] = array[j];
        }
        for (int k = array.length - 1; k > (array.length - 1) - count; k--) {
            array[k] = 0;
            System.out.println(111111111);
        }
    }

    public static void main(String[] args) {
//        BinarySearch binarySearch = new BinarySearch(10);

//        System.out.println(Arrays.toString(binarySearch.getArray()));
//        System.out.println("index - " + binarySearch.find(8));
//
//        binarySearch.insert(11);
//        System.out.println(Arrays.toString(binarySearch.getArray()));
//        System.out.println("index - " + binarySearch.find(6));
//
//        binarySearch.delete(6);
//        System.out.println(Arrays.toString(binarySearch.getArray()));

//        binarySearch.display();


        Integer[] array1 ={1,2,2,5,4,3,2,2,2};
        Integer[] array2 ={4,5,6,4,9,7};
        BinarySearch binarySearch = new BinarySearch(array1);
//        binarySearch.toFillArrayRandomly(10);
        System.out.println(Arrays.toString(binarySearch.getArray()));

        binarySearch.insertionSortAndNoDuplicatesSecond();
        System.out.println(Arrays.toString(binarySearch.getArray()));

//        binarySearch.bubbleSort();

//        binarySearch.insertionSortAndNoDuplicatesSecond();





//        binarySearch.median();


//        binarySearch.toFillArrayRandomly(3);
//        System.out.println();
//        System.out.println(Arrays.toString(binarySearch.getArray()));




//        binarySearch.bubbleSortSimple();
//        System.out.println();
//        System.out.println(Arrays.toString(binarySearch.getArray()));



//        binarySearch.bubbleSortNewer();
//        System.out.println();
//        System.out.println(Arrays.toString(binarySearch.getArray()));


//        System.out.println();
//        binarySearch.display();
//        System.out.println();
//        binarySearch.display();


//        System.out.println();
//        binarySearch.conectArrays(array1, array2);
//        binarySearch.display();



//        binarySearch.toOrderedArray();
//        System.out.println();
//        binarySearch.display();

//        binarySearch.maxElementToEnd();
//        System.out.println();
//        binarySearch.display();


//        binarySearch.removeMax();
//        System.out.println();
//        binarySearch.display();

//        binarySearch.delete(3);
//        System.out.println();
//        binarySearch.display();


//        binarySearch.deleteArray();
//        System.out.println(binarySearch.getMax());
    }
}
