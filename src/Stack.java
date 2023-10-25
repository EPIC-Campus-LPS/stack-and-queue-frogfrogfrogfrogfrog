

import java.util.EmptyStackException;


/**
 * This class implements a simple stack using an array of integer values
 *
 * @author Cardin Nguyen
 * @version 1.0, 9/22/2023
 * @see EmptyStackException
 */


public class Stack {


    // creates the stack
    private int[] stack;


    /**
     * creates a stack out of the array that exists
     *
     * @param arr
     */
    public Stack(int[] arr){
        this.stack = arr;
    }


    /**
     * pushes an element onto the stack
     *
     * @param element return an array with the pushed element
     */
    public int[] push(int element){


        // creates an array that's one bigger than the current stack
        int[] pushed_array = new int[stack.length + 1];
        pushed_array[0] = element;


        // copies the current stack onto the new pushed_array with starting index of 1
        System.arraycopy(stack, 0, pushed_array, 1, pushed_array.length - 1);


        //updates the stack with the new array
        stack = pushed_array;
        return stack;
    }


    /**
     * takes away an element from the stack
     *
     * @return a stack without the top value
     */


    public int[] pop(){


        // if stack length is 0 it will throw exception instead of index error


        if (stack.length == 0){
            throw new EmptyStackException();


        } else {


            // creates an array that's one smaller than the current stack
            int[] popped_array = new int[stack.length - 1];


            // copies the current stack onto the popped_array with the stack index being 1
            System.arraycopy(stack, 1, popped_array, 0, popped_array.length);


            //updates the array
            stack = popped_array;
            return stack;


        }
    }


    /**
     * looks into the top element of the stack
     * if the stack is empty it throws an exception
     *
     * @return the top element of the stack
     */


    public int peek(){


        // if stack length is 0 it will throw exception instead of index error


        if (stack.length == 0){
            throw new EmptyStackException();


            // returns the first stack number
        } else {
            return (stack[0]);
        }
    }


    /**
     * Finds the size of the stack
     *
     * @return the size of the stack
     */




    public int size(){
        return (stack.length);
    }


    /**
     * Determines whether the stack is empty or not
     *
     * @return whether the stack is empty or not
     */
    public boolean isEmpty() {
        return (stack.length == 0);
    }

    public int[] list(){
        return stack;
    }
}
