public class TowersApp {
    static int nDisks = 6;
    static int count = 0;

    public static void main(String[] args) {
        doTowers(nDisks, 'A', 'B', 'C');
        System.out.println(count);
    }

    public static void doTowers(int topN, char from, char inter, char to) {
        count++;
        if (topN == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}
