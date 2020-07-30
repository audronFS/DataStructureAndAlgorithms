package DoublyLinkedList;

public class DoublyLinkedList {
    private  Node first;
    private Node last;

    public boolean isEmpty(){
        return first == null;
    }
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;
        }else{
            first.previous = newNode;
        }
        newNode.next = first;
        this.first = newNode;
    }
    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = newNode;
        }else {
            newNode.previous = last;
            last.next = newNode;
        }
        last = newNode;
    }
    public int deleteFirst(){
        int temp = first.data;
        if(first.next == null)
            last = null;
        else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }
    public int deleteLast(){
        int temp = last.data;
        if(last.previous == null){
            first = null;
        }else{
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data){
        Node newNode = new Node();
        newNode.data = data;
        Node keyNode = first;
        while (keyNode.data != key){
            keyNode = keyNode.next;
            if(keyNode == null){
                return false;
            }
        }
        if(keyNode == last){
            newNode.next = null;
            last = newNode;
        }else {
            newNode.next = keyNode.next;
            keyNode.next.previous = newNode;
        }
        keyNode.next = newNode;
        newNode.previous = keyNode;
        return true;
    }
    public boolean insertBefore(int key, int data){
        return true;
    }
    public Node deleteKey(int key) {
        Node keyNode = first;
        while (keyNode.data != key) {
            keyNode = keyNode.next;
            if (keyNode == null) {
                return null;
            }
        }
        if(keyNode==last){
            last = keyNode.previous;
        }else{
            keyNode.next.previous = keyNode.previous;
        }
        if(keyNode == first){
            first = keyNode.next;
        }else{
            keyNode.previous.next = keyNode.next;
        }
        return keyNode;
    }
    public void displayForward(){
        System.out.println("List (first --> last)");
        Node current = first;
        while(current != null){
            current.displayNode();
            current=current.next;
        }
        System.out.println();
    }
    public void displayBackward(){
        System.out.println("List (Last --> first)");
        Node current = last;
        while(current != null){
            current.displayNode();
            current=current.previous;
        }
        System.out.println();
    }

}
