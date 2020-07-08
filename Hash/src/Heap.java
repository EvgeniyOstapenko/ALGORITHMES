import java.util.Arrays;

public class Heap {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int maxSize) {
        this.maxSize = maxSize;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public Node remove() {
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    public void trickleDown(int index) {
        int largeChild;
        Node top = heapArray[index];

        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;

            if (rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
                largeChild = rightChild;
            } else {
                largeChild = leftChild;
            }

            if (top.getKey() >= heapArray[largeChild].getKey()) {
                break;
            }

            heapArray[index] = heapArray[largeChild];
            index = largeChild;
        }

        heapArray[index] = top;
    }

    public void displayArray() {
        for (int j = 0; j < maxSize; j++) {
            System.out.print(heapArray[j].getKey() + " ");
        }

        System.out.println();
    }

    public void insertAt(int index, Node newNode) {
        heapArray[index] = newNode;
    }

    public void incrementSize() {
        currentSize++;
    }

    public static void main(String[] args) {
        Heap heap = new Heap(4);

        Node node1 = new Node(9);
        heap.insertAt(0, node1);
        heap.incrementSize();

        Node node2 = new Node(8);
        heap.insertAt(1, node2);
        heap.incrementSize();

        Node node3 = new Node(7);
        heap.insertAt(2, node3);
        heap.incrementSize();

        Node node4 = new Node(6);
        heap.insertAt(3, node4);
        heap.incrementSize();

        heap.displayArray();

        for (int i = heap.heapArray.length / 2 - 1; i >= 0; i--) {
            heap.trickleDown(i);
        }

        heap.displayArray();

        for (int i = heap.heapArray.length - 1; i >= 0; i--) {
            Node biggestNode = heap.remove();
            heap.insertAt(i, biggestNode);
        }

        heap.displayArray();
    }
}
