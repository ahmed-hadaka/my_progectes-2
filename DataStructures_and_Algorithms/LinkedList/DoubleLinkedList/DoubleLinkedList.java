package DoubleLinkedList;

/**
 *
 * @AhmedHadaka
 */
public class DoubleLinkedList {

    private Node first;
    private Node last;

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int iData) {
        Node newNode = new Node(iData);
        if (isEmpty()) {
            last = newNode;
        } else {
            newNode.setNext(first);
        }
        first = newNode;
    }

    public void insertLast(int iData) {
        Node newNode = new Node(iData);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
    }

    public void deleteFirst() {
        if (!isEmpty()) {
            Node temp = first;
            if (first.getNext() == null) {
                last = null;
            }
            first = first.getNext();
            System.out.println("deleted: " + temp.toString());
            return;
        }
        System.out.println("there is no item to be deleted");
    }

    @Override
    public String toString() {
        Node current = first;
        String result = "{ ";
        while (current != null) {
            result += current.toString();
            current = current.getNext();
        }
        result += " }";
        return result;
    }
}
