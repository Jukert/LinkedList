package by.bsuir.lab.list;


import by.bsuir.lab.SumMonomial;

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

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    public E get(int i) {

        Node temp = this.head;
        int j = 0;
        while (temp.next != null) {
            if (i == j) {
                 return (E) temp.data;
            }
            j++;
            temp = temp.next;
        }

        if (i == j) {
            return (E) temp.data;
        }
        return null;
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

        while (temp != null && temp.data.equals(e)) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }
        if (prev != null) {
            prev = temp;
        }
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
        SumMonomial sumMonomial = new SumMonomial();
        return (LinkedList<E>) sumMonomial.sum(this, list);
    }
}
