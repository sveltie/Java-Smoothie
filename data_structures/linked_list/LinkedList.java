package data_structures.linked_list;

public class LinkedList<T> {
    private Node<T> head;

    private class Node<U> {
        U data;
        Node<U> next;

        Node(U data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = head;
        head = node;
    }

    public void print() {
        Node<T> tempNode = head;

        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }

        System.out.print("NULL\n");
    }
}
