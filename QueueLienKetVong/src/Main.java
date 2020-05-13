public class Main {
    public static void main(String[] args) {
        // Create a queue and initialize front and rear
        Queue  q = new Queue();
        q .front = q .rear =  null;

        // Inserting elements in Circular Queue
        q.enqueue(q, 14);
        q.enqueue(q, 22);
        q.enqueue(q, 6);

        // Display elements present in Circular Queue
        q.displayQueue(q);

        // Deleting elements from Circular Queue
        System.out.printf(" Deleted value = %d", q.dequeue(q));
        System.out.printf(" Deleted value = %d", q.dequeue(q));

        // Remaining elements in Circular Queue
        q.displayQueue(q);

        q.enqueue(q, 9);
        q.enqueue(q, 20);
        q.displayQueue(q);


}
}
