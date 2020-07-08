public class Stack {

    private int maxSize;
    private int[] stakArray;
    private int top;

    public Stack(int max) {
        maxSize = max;
        stakArray = new int[maxSize];
        top = -1;
    }

    public void push(char j) {
        stakArray[++top] = j;
    }

    public void push(int j) {
        stakArray[++top] = j;
    }

    public int pop() {
        return stakArray[top--];
    }

    public int peek() {
        return stakArray[top];
    }

    public int peekN(int n) {
        return stakArray[n];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("  Stack (bottom-->top): ");
        for (int j = 0; j < size(); j++) {
            System.out.print(peekN(j));
            System.out.print(' ');
        }
        System.out.println("");
    }
}

