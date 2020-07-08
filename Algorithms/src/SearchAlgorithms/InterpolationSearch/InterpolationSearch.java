package SearchAlgorithms.InterpolationSearch;

public class InterpolationSearch {

    public static int interpolationSearch(int[] integers, int elementToSearch) {

        int startIndex = 0;
        int lastIndex = (integers.length - 1);

        while ((startIndex <= lastIndex) && (elementToSearch >= integers[startIndex]) &&
                (elementToSearch <= integers[lastIndex])) {
            // используем формулу интерполяции для поиска возможной лучшей позиции для существующего элемента
            int pos = startIndex +
                    (((lastIndex - startIndex) /  (integers[lastIndex] - integers[startIndex]))
                            * (elementToSearch - integers[startIndex]));

            if (integers[pos] == elementToSearch)
                return pos;

            if (integers[pos] < elementToSearch)
                startIndex = pos + 1;

            else
                lastIndex = pos - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = interpolationSearch(new int[]{0,1,2,3,4,5,6,7,8,9,10}, 6);
        System.out.println(index);
    }
}
