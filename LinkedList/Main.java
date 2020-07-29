package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 2;
        Node nodeB = new Node();
        nodeB.data = 4;
        Node nodeC = new Node();
        nodeC.data = 6;
        Node nodeD = new Node();
        nodeD.data = 8;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        System.out.println(listLength(nodeC));
    }
    public static int listLength(Node aNode){
        int length = 0;
        while(aNode != null){
            length++;
            aNode=aNode.next;
        }
        return length;
    }
}
