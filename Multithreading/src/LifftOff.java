import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LifftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LifftOff(){}

    public LifftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > id ? countDown : (countDown + " - Liftoff")) + "), ";
    }

    @Override
    public void run() {
        while (countDown-- > id) {
            System.out.print(status());
            Thread.yield();
        }

    }
}

class MainThread {
    public static void main(String[] args) {
            ExecutorService executorService = Executors.newCachedThreadPool();

            for (int j = 0; j < 5; j++) {
                executorService.execute(new LifftOff());
            }

        System.out.println("Waiting");
        executorService.shutdown();
    }
}

