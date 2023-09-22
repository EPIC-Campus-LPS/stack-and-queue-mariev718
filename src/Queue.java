import java.util.NoSuchElementException;

public class Queue {

    private int[] queue;

    public int size = 0;

    public Queue() {
    }

    public void add(int element) {

        size++;

        int[] temp = queue;

        queue = new int[size];

        queue[0] = element;

        if (size != 1) {

            for (int i = 1; i < size; i++) {

                queue[i] = temp[i - 1];

            }

        }

    }

    public int remove() {

        if (size == 0) {

            throw new NoSuchElementException();

        }

        int element = queue[size - 1];

        size--;

        return element;

    }

    public int peek() {

        if (size == 0) {

            throw new NoSuchElementException();

        }

        return queue[size - 1];

    }

    public int size() {

        return size;

    }

    public boolean isEmpty() {

        return size == 0;

    }

}
