import java.util.Arrays;

public class Binary {
    int[] binaryPath = new int[10];
    int j = 0;

    public int[] toBinary(int number) {
        while (number >= 1) {
            binaryPath[j++] = number % 2;
            number = number / 2;
        }

        return binaryPath;
    }

    public static void main(String[] args) {
        Binary binary = new Binary();
        System.out.println(Arrays.toString(binary.toBinary(29)));
    }
}
