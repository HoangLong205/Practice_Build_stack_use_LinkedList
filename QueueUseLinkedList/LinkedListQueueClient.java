public class LinkedListQueueClient {
        public static void main(String[] args) {
            MyLinkedListQueue queue = new MyLinkedListQueue();
            queue.enqueue(10);
            queue.displayQueue();
            queue.enqueue(20);
            queue.displayQueue();
            queue.dequeue();
            queue.displayQueue();
            queue.dequeue();
            queue.enqueue(30);
            queue.displayQueue();
            queue.enqueue(40);
            queue.enqueue(50);
            queue.displayQueue();
            System.out.println("Dequeued item is " + queue.dequeue().key);
        }
}
