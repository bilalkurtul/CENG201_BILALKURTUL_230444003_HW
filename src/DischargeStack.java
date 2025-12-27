public class DischargeStack {

    // node for stack
    private class Node {
        DischargeRecord data; // discharge data
        Node next;

        Node(DischargeRecord data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // top of stack

    // add new discharge record
    public void push(DischargeRecord record) {
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
    }

    // remove last added record (LIFO)
    public DischargeRecord pop() {
        if (top == null) {
            return null;
        }

        DischargeRecord temp = top.data;
        top = top.next;
        return temp;
    }

    // see last record without removing
    public DischargeRecord peek() {
        if (top == null) {
            return null;
        }
        return top.data;
    }

    // print all records in stack
    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
