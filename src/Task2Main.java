public class Task2Main {

    public static void main(String[] args) {

        TreatmentQueue queue = new TreatmentQueue();

        // add 8 requests
        for (int i = 1; i <= 8; i++) {
            queue.enqueue(new TreatmentRequest(i));
        }

        // process 3 requests
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        // print remaining
        System.out.println("Remaining queue:");
        queue.printQueue();
    }
}
