package data_structures.linked_list;

public class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<Object> linkedList = new LinkedList<>();

        linkedList.push("abc");
        linkedList.push(123);
        linkedList.push(0.3847);

        linkedList.print();
    }
}
