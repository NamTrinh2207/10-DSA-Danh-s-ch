package linkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("------------ TESTING -----------");
        MyLinkedList linkedListl = new MyLinkedList(10);
        linkedListl.addFirst(11);
        linkedListl.addFirst(12);
        linkedListl.addFirst(13);

        linkedListl.add(5, 8);
        linkedListl.add(4, 9);
        linkedListl.printList();
    }
}