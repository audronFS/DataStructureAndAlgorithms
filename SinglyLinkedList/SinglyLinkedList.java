package SinglyLinkedList;

import LinkedList.Node;

public class SinglyLinkedList {
    private Node first;
//    private Node last; //This is to build a Circular LinkedList

    public SinglyLinkedList() {
    }
    public boolean isEmpty(){
        return (first == null);
    }
    //used to insert at the beginning of the list
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
//        if(newNode.next == null)
//            last = newNode;
    }
    public void insertLast(int data){
//        Node newLast = new Node();
//        newLast.data = data;
//        last.next = newLast;
//        last = newLast;
        Node last = first;
        while(last.next != null){
            last = last.next;
        }
        Node newLast = new Node();
        newLast.data = data;
        last.next = newLast;
    }
    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }
    public void displayList(){
        System.out.println("List (first --> last)");
        Node current = first;
        while(current != null){
            current.displayNode();
            current=current.next;
        }
        System.out.println();
    }
}
