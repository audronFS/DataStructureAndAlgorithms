package Queue;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.remove();
        queue.insert(6);


        System.out.println(queue.peekFront());

        //System.out.println(queue.());

        queue.view();


    }
}
