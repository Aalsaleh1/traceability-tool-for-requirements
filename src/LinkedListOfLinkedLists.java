class LinkedList<T> {
    private Node<T> head;
    public LinkedList<T> next;

    LinkedList() {
        this.head = null;
        this.next = null;
    }

    public boolean empty() {
        return head == null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void remove(T data) {
        if (empty()) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node<T> prev = head;
        Node<T> current = head.next;

        while (current != null) {
            if (current.data.equals(data)) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOfLinkedLists<T> {
    private LinkedList<LinkedList<T>> head;
    private LinkedList<LinkedList<T>> current;

    public void findFirst() {
        current = head;
    }

    public boolean empty() {
        return head == null;
    }

    public LinkedList<LinkedList<T>> retrieve() {
        return current;
    }

    public void findNext() {
        current = current.next;
    }

    public void insert(LinkedList<LinkedList<T>> list) {
        if (empty()) {
            head = current = list;
        } else {
            LinkedList<LinkedList<T>> temp = current.next;
            current.next = list;
            list.next = temp;
            current = list;
        }
    }

    public void remove(LinkedList<LinkedList<T>> list) {
        if (empty()) {
            return;
        }

        if (head == list) {
            head = head.next;
            return;
        }

        LinkedList<LinkedList<T>> prev = head;
        LinkedList<LinkedList<T>> current = head.next;

        while (current != null) {
            if (current == list) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

//    public void print() {
 //       findFirst();
 //       while (current != null) {
  ////          current.data.print();
   //         findNext();
   //     }
    }

