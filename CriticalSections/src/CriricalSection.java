import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CriricalSection {

    static void testApproaches(PairManager pman1, PairManager pman2) {
        ExecutorService exec = Executors.newCachedThreadPool();

        PairManipulator pm1 = new PairManipulator(pman1);
        PairManipulator pm2 = new PairManipulator(pman2);

        PairChecker pcheck1 = new PairChecker(pman1);
        PairChecker pcheck2 = new PairChecker(pman2);

//        exec.execute(pm1);
//        exec.execute(pm2);
        exec.execute(pcheck1);
        exec.execute(pcheck2);

        try {
            TimeUnit.MICROSECONDS.sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
//        System.out.println("pm1: " + pm1);
//        System.out.println("pm2: " + pm2);

        System.out.println();

        System.out.println("pcheck1: " + pcheck1);
        System.out.println("pcheck2: " + pcheck2);

        System.exit(0);
    }

    public static void main(String[] args) {
        PairManager pman1 = new PairManager1();
        PairManager pman2 = new PairManager2();
        testApproaches(pman1, pman2);

    }
}
