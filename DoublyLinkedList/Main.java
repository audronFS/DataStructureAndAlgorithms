package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyList = new DoublyLinkedList();
        doublyList.insertLast(6);
        doublyList.insertLast(5);
        doublyList.insertLast(4);
        doublyList.displayBackward();

//        System.out.println(doublyList.deleteLast());
        System.out.println(doublyList.insertAfter(5, 0));
        doublyList.displayForward();
        System.out.println(doublyList.deleteKey(4));
        doublyList.displayForward();

    }
}
