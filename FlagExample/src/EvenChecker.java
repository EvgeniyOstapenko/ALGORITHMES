import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            System.out.println(val);
//            if (val % 2 != 0) {
//                System.out.println(val + " не четно");
//                generator.cancel();
//            }
        }
    }

    public void test( int count) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < count; i++) {
            executorService.execute(new EvenChecker(generator, i));
            executorService.shutdown();
        }
    }

    public  void test() {
        test(10);
    }

}