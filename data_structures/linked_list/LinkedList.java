package linked_list;

/**
 * Linked list, is a sequence of data structures or node, which are connected
 * together via links.
 */
public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    class Node<U> {
        U key;
        Node<U> next;

        Node(U key) {
            this.key = key;
            this.next = null;
        }
    }

    /**
     * Pretty print the content of the list.
     */
    public void view() {
        Node<T> node = head;

        while (node != null) {
            System.out.print(node.key + " -> ");
            node = node.next;
        }

        System.out.print("NULL\n");
    }

    /**
     * Check whether a list is empty or not.
     * 
     * @return boolean depending on the list content
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Push a key at the beginning of the list.
     * 
     * @param key data, key, or value to store
     */
    public void push(T key) {
        Node<T> node = new Node<>(key);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    /**
     * Append or push a key at the end of the list
     * 
     * @param key
     */
    public void append(T key) {
        Node<T> node = new Node<>(key);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    /**
     * Remove a key at the beginning of the list
     */
    public void shift() {
        if (head == null) {
            throw new NullPointerException("The list is empty");
        }

        // This remove the current head and replaced by the next head pointer
        head = head.next;

        // If the prior head next pointer is null then we also need to set
        // the tail as null as there is no more key exist in the list.
        if (head == null) {
            tail = null;
        }
    }

    /**
     * Remove a key at the end of the list
     */
    public void pop() {
        if (head == null) {
            throw new NullPointerException("The list is empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node<T> node = head;

            // Traversing the list to find the second to last node
            while (node.next.next != null) {
                node = node.next;
            }

            // This remove the next pointer of this node which is tail
            // and current node becomes the tail
            node.next = null;
            tail = node;
        }
    }

    /**
     * Check whether a list contain a given key
     * 
     * @param key
     * @return boolean
     */
    public boolean contain(T key) {
        Node<T> node = head;

        while (node != null) {
            if (node.key == key) {
                return true;
            }

            node = node.next;
        }

        return false;
    }
}