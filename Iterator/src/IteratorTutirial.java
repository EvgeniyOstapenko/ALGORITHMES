import java.util.Iterator;

public class IteratorTutirial {
}

class SimpleIterator<T> implements Iterator<T> {
    private T[] objects;
    private int index = 0;

    SimpleIterator(T[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public T next() {
        return objects[index++];
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        SimpleIterator <Integer> s = new SimpleIterator(integers);

        while (s.hasNext()) {
            Integer i = s.next();
            System.out.println(i);
        }
    }
}
