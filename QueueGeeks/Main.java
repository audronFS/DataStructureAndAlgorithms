package QueueGeeks;

public class Main {
        public static void main(String[] args)
        {
            Queue queue = new Queue(5);

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);

//            System.out.println(queue.dequeue()
//                    + " dequeued from queue\n");
            queue.enqueue(60);

            System.out.println("Front item is "
                    + queue.front());

            System.out.println("Rear item is "
                    + queue.rear());

            queue.view();
        }
    }

// This code is contributed by Gaurav Miglani


