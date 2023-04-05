package queue;

/**
 * Queue is a linear data collection of items where items are inserted and
 * removed in FIFO order or "First in, first out"
 */
interface Queue<T> {
    public void enqueue(T item);

    public T dequeue();

    public boolean isEmpty();
}
