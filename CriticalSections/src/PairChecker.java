public class PairChecker implements Runnable {
    private PairManager pm;

    public PairChecker(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("!!!!!1" + pm.checkCounter.get());
            pm.checkCounter.incrementAndGet();
            System.out.println("!!!!!2" + pm.checkCounter.get());
            pm.getPair().checkState();
        }
    }

    public String toString() {
        return "Pair: " + pm.getPair() + " checkCounter = " + pm.checkCounter.get();
    }
}
