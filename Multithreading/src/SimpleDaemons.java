import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {


    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(1);
                System.out.println(Thread.currentThread() + " " + this);
            }

        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }

        System.out.println("All deamons are launched");
        TimeUnit.MICROSECONDS.sleep(17500);
    }
}
