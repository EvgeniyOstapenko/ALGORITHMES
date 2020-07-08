public class DeadLock {
    public static void main(String[] args) {

        final Object lock1 = new Object();
        final Object lock2 = new Object();

        final ThreadDemo1 threadDemo1 = new ThreadDemo1(lock1, lock2);
        final ThreadDemo2 threadDemo2 = new ThreadDemo2(lock1, lock2);

        threadDemo1.start();
        threadDemo2.start();
    }
}

class ThreadDemo1 extends Thread {

    final private Object lock1;
    final private Object lock2;

    ThreadDemo1(final Object lock1, final Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println("Thread-1 lock-1");
            synchronized (lock2) {
                System.out.println("Thread-1 lock-2");
            }
        }
    }
}

class ThreadDemo2 extends Thread {

    final private Object lock1;
    final private Object lock2;

    ThreadDemo2(final Object lock1, final Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock2) {
            System.out.println("Thread-2 lock-2");
            synchronized (lock1) {
                System.out.println("Thread-2 lock-1");
            }
        }
    }
}
