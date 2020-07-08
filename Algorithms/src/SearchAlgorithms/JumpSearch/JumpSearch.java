package SearchAlgorithms.JumpSearch;

public class JumpSearch {

    public static int jumpSearch(int[] integers, int elementToSearch) {
        int arrayLength = integers.length;
        int jumpStep = (int) Math.sqrt(integers.length);
        int previousStep = 0;

        while (integers[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int)(Math.sqrt(arrayLength));
            if (previousStep >= arrayLength)
                return -1;
        }
        while (integers[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength))
                return -1;
        }

        if (integers[previousStep] == elementToSearch)
            return previousStep;
        return -1;
    }

    public static int myJumpSearch(int[] integers, int elementToSearch) {
        int arrayLength = integers.length;
        int jumpStep = (int) Math.sqrt(arrayLength);
        int previousStep = 0;

        while (integers[jumpStep - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int)(Math.sqrt(arrayLength));
            if (previousStep >= arrayLength)
                return -1;
        }
        while (integers[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == jumpStep)
                return -1;
        }
        if (integers[previousStep] == elementToSearch)
            return previousStep;
        return -1;
    }

    public static void main(String[] args) {
        int index = jumpSearch(new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99}, 67);
        System.out.println(index);
    }
}
