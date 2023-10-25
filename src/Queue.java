import java.util.NoSuchElementException;


/**
 * This class implements a simple queue using an array of integer values
 *
 * @author Cardin Nguyen
 * @version 1.0, 9/22/2023
 * @see NoSuchElementException
 */


public class Queue {
    private int[] queue;


    /**
     * creates a queue out of the array that exists
     *
     * @param arr
     */
    public Queue(int[] arr){
        this.queue = arr;
    }


    /**
     * Adds an element to the current queue
     *
     * @param element
     * @return an array with the added element
     */
    public int[] add(int element){


        //makes a new array that's one larger than the current queue
        int[] added_array = new int[queue.length + 1];


        //makes the beginning of the array the added element
        added_array[added_array.length - 1] = element;


        //copies the array onto the new array
        System.arraycopy(queue, 0, added_array, 0, added_array.length -1);


        //updates the queue and returns it
        queue = added_array;
        return queue;
    }


    /**
     * Removes an element to the current array
     *
     * @return an array with the removed element
     */
    public int[] remove(){

        // throws an exception if the length is 0
        if (queue.length == 0){
            throw new NoSuchElementException();

        } else {


            // creates a copy of the queue that's one less than the current queue
            int[] removed_array = new int[0];
            System.arraycopy(queue, 0, removed_array, 0, removed_array.length);


            //updates the queue and returns it
            queue = removed_array;
            return removed_array;

        }
    }


    /**
     * Looks at an element at the top of the queue
     * If the queue is empty it throws an exception
     *
     * @return the next element in the queue
     */


    public int peek(){
        if (queue.length == 0) {
            throw new NoSuchElementException();
        } else {
            return queue[0];
        }
    }


    /**
     * Finds the size of the queue
     *
     * @return the size of the queue
     */


    public int size(){
        return queue.length;
    }


    /**
     * Determines if the queue is empty or not
     *
     * @return whether the queue is empty
     */
    public boolean isEmpty() {
        return (queue.length == 0);
    }
}

