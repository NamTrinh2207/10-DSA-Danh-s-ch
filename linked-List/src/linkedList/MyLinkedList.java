package linkedList;


public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int size = 0;//trả về số lượng các phần tử

    public MyLinkedList() {
    }

    public int size() {
        return size;
    }

    public Object get(int index) {  // lấy ra phần tử ở vị trí thứ index
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public boolean contains(E element) {  //kiểm tra phần tử có tồn tại trong danh sách hay không
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        if (temp.data.equals(element)) {
            return true;
        }
        return false;
    }

    public int indexOf(E element) { //trả về vị trí của một phần tử trong ds
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getData().equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void addFirst(E element) {  //thêm phần tử vào danh sách
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        size++;
    }

    public void addLast(E element) {  //thêm phần tử vào danh sách
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        size++;
    }

    public void addIndex(int index, E data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        size++;
    }

    public E remote(int index) { //xóa phần tử thứ index
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
        }
        size--;
        return (E) data;
    }

    public boolean remoteElement(E element) {
        if (head.data.equals(element)) {
            remote(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    size--;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public MyLinkedList<E> copy() {
        if (size == 0) {
            throw new NullPointerException();
        }
        MyLinkedList<E> temp = new MyLinkedList<>();
        Node tempNode = head;
        temp.addFirst((E) tempNode.data);
        tempNode = tempNode.next;
        while (tempNode != null) {
            temp.addLast((E) tempNode.data);
            tempNode = tempNode.next;
        }
        return temp;
    }


}
