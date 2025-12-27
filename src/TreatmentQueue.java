public class TreatmentQueue {

    // node for queue structure
    private class Node {
        TreatmentRequest data; // request data
        Node next;             // next node

        Node(TreatmentRequest data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // first element
    private Node rear;  // last element
    private int size;   // queue size

    // add new request to queue (FIFO)
    public void enqueue(TreatmentRequest request) {
        Node newNode = new Node(request);

        if (rear == null) { // queue empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // remove first request from queue
    public TreatmentRequest dequeue() {
        if (front == null) {
            return null; // queue empty
        }

        TreatmentRequest temp = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return temp;
    }

    // return queue size
    public int size() {
        return size;
    }

    // print all requests in queue
    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
