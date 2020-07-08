public class StackX {
    private int maxSize;
    private char[] stakArray;
    private int top;

    public StackX(int max) {
        maxSize = max;
        stakArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stakArray[++top] = j;
    }

    public void push(double j) {
        stakArray[++top] = (char) j;
    }

    public char pop() {
        return stakArray[top--];
    }

    public char peek() {
        return stakArray[top];
    }

    public char peekN(int n) {
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
            int n = peekN(j);
            System.out.print(n);
            System.out.print(' ');
        }
        System.out.println("");
    }
}
