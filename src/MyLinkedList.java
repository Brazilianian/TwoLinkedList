import java.util.LinkedList;

public class MyLinkedList<T> {

    private MyNode<T> first;
    private MyNode<T> last;

    public MyLinkedList() {
        first = null;
    }

    public void setFirst(T item) {
        MyNode<T> newNode = new MyNode<>(null, item, first);
        MyNode<T> temp = first;
        first = newNode;
        if (temp == null) {
            last = first;
        } else {
            temp.setPrev(first);
        }
    }

    public void setLast(T item) {
        MyNode<T> newNode = new MyNode<>(last, item, null);
        MyNode<T> temp = last;
        last = newNode;
        if (temp == null) {
            first = last;
        } else {
            temp.setNext(newNode);
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
