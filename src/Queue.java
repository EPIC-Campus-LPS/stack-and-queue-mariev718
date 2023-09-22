import java.util.NoSuchElementException;

/**
 * Class that acts like a queue using an array
 *
 * @author Marie Viita
 * @version 1.0, 09/22/2023
 */
public class Queue {

    // creates an array to represent the queue
    private int[] queue;

    // creates an integer to track the size of the queue
    public int size = 0;

    /**
     * Constructor for the Queue class, creates a queue object
     */
    public Queue() {
        // constructor, does not need any variables
    }

    /**
     * Adds a value to the end of the queue
     *
     * @param element takes the value to add to the queue
     */
    public void add(int element) {

        // increases size of queue by one, because adding one element
        size++;

        // creates a temp array of the queue
        int[] temp = queue;

        // sets the queue to a new array of the new size
        queue = new int[size];

        // the first element in the queue is set to the value of the new element
        // in this case, the beginning of the array is the end of the queue and the end of the array is the beginning of the queue
        queue[0] = element;

        // checks that size does not equal 0, if it equals 0, nothing else needs to be done
        if (size != 1) {

            // for the remainder of the new queue array, copies values from the temp array
            for (int i = 1; i < size; i++) {

                queue[i] = temp[i - 1];

            }

        }

    }

    /**
     * Returns and removes the element at the head of the queue
     *
     * @return the value of the element at the head of queue
     */
    public int remove() {

        // if the queue is empty, throws exception
        if (size == 0) {

            throw new NoSuchElementException();

        }

        // element integer is created to hold the value at the beginning of queue
        int element = queue[size - 1];

        // size of queue is decreased by 1, because the element at the head of the queue is being removed
        size--;

        // the removed element is returned
        return element;

    }

    /**
     * Returns value of element at head of the queue
     *
     * @return the value of the element at head of queue
     */
    public int peek() {

        // throws exception if the queue is empty
        if (size == 0) {

            throw new NoSuchElementException();

        }

        // returns value of element at head of queue
        return queue[size - 1];

    }

    /**
     * Returns length of the queue
     *
     * @return the length of the queue
     */
    public int size() {

        // returns size of queue
        return size;

    }

    /**
     * Returns true if the queue is empty and false if it is not empty
     *
     * @return if the queue is empty
     */
    public boolean isEmpty() {

        // returns true if the queue is size 0, returns false if else
        return size == 0;

    }

}