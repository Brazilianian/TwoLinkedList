public class MyNode<T> {
    private MyNode<T> next;
    private MyNode<T> prev;
    private T item;

    public MyNode() {
    }

    public MyNode(MyNode<T> prev, T item, MyNode<T> next) {
        this.prev = prev;
        this.item = item;
        this.next = next;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public MyNode<T> getPrev() {
        return prev;
    }

    public void setPrev(MyNode<T> prev) {
        this.prev = prev;
    }
}
