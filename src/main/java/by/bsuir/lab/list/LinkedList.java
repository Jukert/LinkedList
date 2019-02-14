package by.bsuir.lab.list;


public class LinkedList<E> {

    Node<E> head;

    static class Node<E> {

        E data;
        Node next;

        public Node(E data) {
            this.data = data;
        }
    }


    public void add(E value) {

        Node node = new Node(value);
        node.next = null;

        if (head == null) {
            head = node;
            return;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
    }

    public String print() {

        StringBuilder sb = new StringBuilder("[");
        Node<E> temp = head;
        if (head == null) {
            return null;
        }
        while (temp.next != null) {
            sb.append(temp.data.toString());
            temp = temp.next;
            sb.append(", ");
        }
        sb.append(temp.data);
        sb.append("]");
        return sb.toString();
    }

    public void remove(E e) {

        Node temp = head, prev = null;

        if (temp == null) {
            return;
        }

        while (temp != null && temp.data != e) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }
        prev.next = temp.next;
    }

    public int size() {
        int i = 0;

        Node temp = head;
        if (temp == null) {
            return 0;
        }

        while (temp.next != null) {
            i++;
            temp = temp.next;
        }

        return i + 1;
    }

    public LinkedList<E> summ(LinkedList<E> list) {


        return null;
    }
}
