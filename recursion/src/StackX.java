public class StackX {
    private int maxSize;
    private Params[] stackArray;
    private int top;

    public StackX(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new Params[maxSize];
        top = -1;
    }

    public void push(Params params) {
        stackArray[++top] = params;
    }

    public Params pop() {
        return stackArray[top--];
    }

    public Params peek() {
        return stackArray[top];
    }

}
