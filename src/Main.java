
public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.setLast(6);
        myLinkedList.setLast(5);
        myLinkedList.setLast(4);

        myLinkedList.setFirst(2);
        myLinkedList.setFirst(1);
        myLinkedList.setFirst(0);

//        myLinkedList.deleteFirst();
//        myLinkedList.deleteLast();

        myLinkedList.print();
    }
}
