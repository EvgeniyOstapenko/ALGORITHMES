import java.util.Arrays;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = j;
        nItems++;
    }

    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        queArray[front] = 0;
        return temp;
    }


    public long peekFront() {
        return queArray[front];
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

    public void toPrint() {

            for (int i = 0; i < queArray.length; i++) {
                if (front == maxSize - 1) {
                    front = -1;
                }
                System.out.print(queArray[++front]);
            }
        System.out.println();
        System.out.println(Arrays.toString(queArray));


    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.toPrint();

    }

}
