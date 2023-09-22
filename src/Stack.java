import java.util.EmptyStackException;

/**
 * Class that acts like a stack using an array
 *
 * @author Marie Viita
 * @version 1.0, 09/22/2023
 */
public class Stack {

    // creates an array for the stack
    public int[] stack;
    // creates an integer to keep track of the size of stack

    public int size = 0;

    /**
     * Constructor for the Stack class, creates a stack object
     */
    public Stack() {
        // constructor, doesn't need any variables
    }

    /**
     * Adds a value to the top of the stack
     *
     * @param element takes the value to add to the top of the stack
     */
    public void push(int element) {

        // if the stack is empty, makes the stack into a new array with one element
        if (size == 0) {

            stack = new int[1];

            stack[0] = element;

            // increases stack size by one, since there is one element
            size++;

        } else {

            // stack size is increased by one
            size++;

            // previous stack is written to a temp array
            int[] temp = stack;

            // stack array is set to a new array with the correct amount of elements
            stack = new int[size];

            // last element in the stack array is set to the new element value
            stack[size - 1] = element;

            // the remainder of the stack array is copied from the temp array
            for (int i = 0; i < size - 1; i++) {

                stack[i] = temp[i];

            }

        }

    }

    /**
     * Returns and removes the element at the top of the stack
     *
     * @return the value of the element removed
     */
    public int pop() {

        // if the array is empty, throws an exception
        if (size == 0) {

            throw new EmptyStackException();

        }

        // sets a temp integer to the value of the latest element
        int temp = stack[size - 1];

        // size is decreased by one because an element is being removed
        size--;

        // returns the temp integer
        return temp;

    }

    /**
     * Returns the element at the top of the stack
     *
     * @return the value of the element at the top of the stack
     */
    public int peek() {

        // throws an exception if the stack is empty
        if (size == 0) {

            throw new EmptyStackException();

        }

        // returns the value of the latest element
        return stack[size - 1];

    }

    /**
     * Returns the size of the stack
     *
     * @return size of stack
     */
    public int size() {

        // returns the size of the stack
        return size;

    }

    /**
     * Returns true if stack is empty, false if not
     *
     * @return if stack is empty
     */
    public boolean isEmpty() {

        // if the stack size is 0, returns true, else returns false
        return size == 0;

    }

}