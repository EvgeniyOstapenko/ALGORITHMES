package Tasks.FourthList;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        Map<Integer, BitSet> mapBits = new HashMap<>(2);
        mapBits.put(1, B1);
        mapBits.put(2, B2);

        while (M-- > 0){
            String operation = scanner.next();
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            if(operation.equals("AND")){
                mapBits.get(first).and(mapBits.get(second));
            }
            if(operation.equals("OR")){
                mapBits.get(first).or(mapBits.get(second));
            }
            if(operation.equals("XOR")){
                mapBits.get(first).xor(mapBits.get(second));
            }
            if(operation.equals("FLIP")){
                mapBits.get(first).flip(second);
            }
            if(operation.equals("SET")){
                mapBits.get(first).set(second);
            }
            System.out.printf("%d %d%n", B1.cardinality(), B2.cardinality());
        }
        scanner.close();
    }
}
