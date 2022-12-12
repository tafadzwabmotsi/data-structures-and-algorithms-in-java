package chaptersix.queue;

public interface Queue <E> {

    /**
     * size - Returns the number of elements in the queue
     * @return The number of elements in the queue
     * */
    int size();

    /**
     * isEmpty - Tests whether the queue is empty
     * @return A boolean true if the queue is empty,
     * otherwise false
     * */
    boolean isEmpty();

    /**
     * enqueue - Inserts an element at the rear of the queue
     * @param e - The element to be inserted
     * */
    void enqueue(E e);

    /**
     * first - Returns, but does not remove, the first element
     * of the queue (null is empty)
     * @return the first element or null
     * */
    E first();

    /**
     * dequeue - Removes and returns the first element of the
     * queue (null if empty)
     * @return the first element or null
     * */
    E dequeue();
}
