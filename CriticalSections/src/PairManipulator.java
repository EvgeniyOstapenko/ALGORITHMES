public class PairManipulator implements Runnable {
    private PairManager pm;

    public PairManipulator(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("!!!!!" + pm.checkCounter.get());
            pm.increment();
            System.out.println("!!!!!" + pm.checkCounter.get());
        }
    }

    public String toString() {
        return "Pair: " + pm.getPair() + " checkCounter = " + pm.checkCounter.get();
    }
}
