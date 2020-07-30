package CircularLinkedList;

import LinkedList.Node;

public class CircularLinkedList {
    private Node first;
    private Node last;
    //private Node oldLast;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public boolean isEmpty() {
        return (first == null);
    }
    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()) {
            first = newNode;
            last = newNode;
        }
        else {
            last.next = newNode;
          //  oldLast = last;
            last = newNode;
        }
    }
    public int deleteFirst(){
        int temp = first.data;
        if(first.next == null)
            last = null;
        else
            first=first.next;
        return temp;
    }
//    public int deleteLast(){
//        int temp = last.data;
//        if(first.next == null){
//            first=null;
//            last = null;}
//        else{
//            oldLast.next=null;
//            last = oldLast;
//        }
//        return temp;
//    }
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
