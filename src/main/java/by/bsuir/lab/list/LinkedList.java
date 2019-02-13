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
}
