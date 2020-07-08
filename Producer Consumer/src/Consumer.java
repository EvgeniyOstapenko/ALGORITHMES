import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Consumer {
    private final LinkedBlockingQueue<Integer> queue;
    private final ExecutorService consumer;
    private final AtomicBoolean stop;

    Consumer(final LinkedBlockingQueue<Integer> queue, final AtomicBoolean stop) {
        this.consumer = Executors.newFixedThreadPool(3);
        this.queue = queue;
        this.stop = stop;
    }

    void consuming() {
        for (int i = 0; i < 3; i++) {
            final Thread consumer = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (!stop.get()) {
                        try {
                            final Integer polls = queue.poll(100, TimeUnit.MILLISECONDS);
//                            final Integer result = poll * 2;
//                            System.out.println(polls+ "qwerty");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
//                    System.out.println("==========================");
                }
            });

            this.consumer.submit(consumer);
        }
    }



}
