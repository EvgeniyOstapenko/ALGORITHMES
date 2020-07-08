public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int j;

        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j]) {
                    queArray[j + 1] = queArray[j];
                } else {
                    break;
                }
                queArray[j + 1] = item;
                nItems++;
             }
        }
    }

    public long remove(long j) {
        return queArray[--nItems];
    }

    public long peekMin() {
        return queArray[nItems - 1];
    }

    private boolean isEmpty() {
        return (nItems == 0);
    }
    public boolean isFull() {
        return (nItems == maxSize);
    }
    public int size() {
        return nItems;
    }

    public static void main(String[] args) {
        PriorityQ priorityQ = new PriorityQ(5);
        System.out.println(priorityQ.size());

        priorityQ.insert(34);
        System.out.println(priorityQ.size());
    }
}
