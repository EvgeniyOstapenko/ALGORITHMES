package Tasks.FourthList;

import java.util.LinkedList;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextByte();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        while (Q > 0) {
            String query = scanner.next();
            if (query.equals("Insert")) {
                int index = scanner.nextInt();
                int number = scanner.nextInt();
                list.add(index, number);
            } else if (query.equals("Delete")){
                int index = scanner.nextInt();
                list.remove(index);
            }
            Q--;
        }
        for (int n: list) {
            System.out.print(n + " ");
        }
    }
}
