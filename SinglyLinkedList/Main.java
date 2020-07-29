package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.insertFirst(8);
        sList.insertFirst(7);
        sList.insertFirst(6);
        sList.insertFirst(56);
        sList.displayList();
        sList.deleteFirst();
        sList.displayList();
        sList.insertLast(100);
        sList.displayList();
    }
}
