public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes;
    public class Node{
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData(){
            return data;
        }
    }

    public MyLinkedList() {
    }
    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        numNodes++;

        if (tail == null)
            tail = head;
    }

    public void addLast(E e) {
        Node newNode = new Node(e);

        if (tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }

        numNodes++;
    }
    public void add(int index, E e) {
        if (index == 0) addFirst(e);
        else if (index >= numNodes) addLast(e);
        else {
            Node current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node temp = current.next;
            current.next = new Node(e);
            (current.next).next = temp;
            numNodes++;
        }
    }
    public E removeFirst() {
        if (numNodes == 0) return null;
        else {
            Node temp = head;
            head = head.next;
            numNodes--;
            if (head == null) tail = null;
            return temp.element;
        }
    }
    public E remove(int index) {
        if (index < 0 || index >= numNodes) return null; // Out of range
        else if (index == 0) return removeFirst(); // Remove first
        else if (index == numNodes - 1) return removeLast(); // Remove last
        else {
            Node previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            numNodes--;
            return current.element;
        }
    }

}
