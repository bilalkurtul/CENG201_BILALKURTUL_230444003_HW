public class PatientList {

    // node class for linked list
    private class Node {
        Patient data;   // patient data
        Node next;      // next node reference

        Node(Patient data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // first node of list

    // add patient to end of list
    public void addPatient(Patient p) {
        Node newNode = new Node(p);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // remove patient by id
    public void removePatient(int id) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // if patient is first node
        if (head.data.id == id) {
            head = head.next;
            System.out.println("Patient removed.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data.id != id) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Patient not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Patient removed.");
        }
    }

    // find patient with id
    public Patient findPatient(int id) {
        Node temp = head;

        while (temp != null) {
            if (temp.data.id == id) {
                return temp.data;
            }
            temp = temp.next;
        }

        return null;
    }

    // print all patients in list
    public void printList() {
        if (head == null) {
            System.out.println("No patient in list.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
