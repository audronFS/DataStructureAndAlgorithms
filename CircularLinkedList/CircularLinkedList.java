package CircularLinkedList;

import LinkedList.Node;

public class CircularLinkedList {
    private Node first;
    private Node last;

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
        if(isEmpty())
            first = newNode;
        else {
            last.next = newNode;
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
    public int deleteLast(){}
}
