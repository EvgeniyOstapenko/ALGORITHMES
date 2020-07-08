public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 1;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenGenerator evenGenerator = new EvenGenerator();
        EvenChecker evenChecker = new EvenChecker(evenGenerator, 10);
        evenChecker.test();
    }

}