package linked_list;

public class LinkedListDemo {
    public static void main(String args[]) {
        // Initialize the Linked List
        LinkedList<String> linkedList = new LinkedList<>();

        // Push all the data
        linkedList.push("Foo");
        linkedList.push("Bar");
        linkedList.push("Cat");

        // Print out the list
        linkedList.view();

        // Print out the list head and the list tail
        System.out.println(linkedList.head.key);
        System.out.println(linkedList.tail.key);

        // Check removing data from the end of the list
        linkedList.pop();
        linkedList.view();

        // Check removing data from the beginning of the list
        linkedList.shift();
        linkedList.view();
    }
}