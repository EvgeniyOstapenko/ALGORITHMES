public class Accessor implements Runnable {
    private final int i;

    public  Accessor(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }

    public String toString() {
        return "#" + i + " : " + ThreadLocalVariableHolder.get();
    }
}

