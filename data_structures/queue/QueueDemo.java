package queue;

public class QueueDemo {
    public static void main(String args[]) {
        char buffer[] = { 'a', 'b', 'c', 'd', 'e' };
        QueueArray<Character> q = new QueueArray<>(5);

        // enqueue every single item in buffer array
        for (char b : buffer) {
            q.enqueue(b);
        }

        // full
        q.enqueue('f');

        // the reason why q needs to be dequeued two times is because when write loops
        // back to 0 and we want to insert something at that index then it would be a
        // problem since write will be equal to read
        q.dequeue();
        q.dequeue();

        // now it's fine
        q.enqueue('f');
    }
}
