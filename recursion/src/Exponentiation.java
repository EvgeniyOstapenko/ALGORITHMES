public class Exponentiation {
    int finalNumber = 0;
    boolean odd = false;
    boolean stop = false;
    int i = 0;

    public void toWork(int number, int degree) {
        if (degree == 1) {
            return;
        } else {

            if (!stop && degree % 2 != 0) {
                odd = true;
                stop = true;
                i++;
            }

            degree /= 2;
            number = number * number;
            toWork(number, degree);

            if (finalNumber < number) {
                finalNumber = number;
            }

            if (degree % 2 != 0 && degree != 1) {
                finalNumber = finalNumber * number;
            }

            if (odd) {
                finalNumber = finalNumber * 2;
                odd = false;
            }
        }
    }

    public static void main(String[] args) {
        Exponentiation exponentiation = new Exponentiation();
        exponentiation.toWork(2, 20);
        System.out.println(exponentiation.finalNumber);

    }
}
