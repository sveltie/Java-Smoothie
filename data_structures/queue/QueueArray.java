package queue;

/**
 * Implementation of a Queue data structure using circular array by keeping
 * track of the reading and writing of the Queue
 */
public class QueueArray<T> implements Queue<T> {
    T q[];
    int read, write;

    /**
     * WARNING: casting Object to T (unchecked)
     * 
     * @param size
     */
    @SuppressWarnings("unchecked")
    QueueArray(int size) {
        q = (T[]) new Object[size];
        read = write = 0;
    }

    /**
     * Enqueue or push an item into the queue
     * 
     * @param item
     */
    public void enqueue(T item) {
        if (write == q.length) {
            if (read >= 2) {
                write = 0;
            } else {
                System.out.println("Queue is full");
                return;
            }
        }

        q[write++] = item;
    }

    /**
     * Get the first enqueued item. First in, first out.
     */
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        if (read == q.length) {
            read = 0;
        }

        return q[read++];
    }

    /**
     * Check whether the Queue is empty or not
     * 
     * @return boolean
     */
    public boolean isEmpty() {
        return (read == write);
    }
}
