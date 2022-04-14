import java.util.LinkedList;

public class MyLinkedList<T> {

    private MyNode<T> first;
    private MyNode<T> last;

    public MyLinkedList() {
        first = null;
    }

    public void setFirst(T item) {
        MyNode<T> newNode = new MyNode<>(null, item, first);
        if (first == null) {
            first = newNode;
            last = first;
        } else {
            first.setPrev(first);
            first = newNode;
        }
    }

    public void setLast(T item) {
        MyNode<T> newNode = new MyNode<>(last, item, null);
        if (last == null) {
            last = newNode;
            first = last;
        } else {
            last.setNext(newNode);

            last = newNode;
        }
    }

    public void deleteFirst() {
        first = first.getNext();
        first.setPrev(null);
    }

    public void deleteLast() {
        last = last.getPrev();
        last.setNext(null);
    }

    public void print() {
        MyNode<T> x = first;
        while(x != null) {
            MyNode<T> next = x.getNext();
            System.out.println(x.getItem());
            x = next;
        }
    }
}
