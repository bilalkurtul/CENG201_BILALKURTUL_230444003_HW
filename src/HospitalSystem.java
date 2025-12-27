import java.util.HashMap;

public class HospitalSystem {

    PatientList patientList = new PatientList();   // admitted patients
    DischargeStack dischargeStack = new DischargeStack(); // discharged patients

    // two queues for priority logic
    TreatmentQueue normalQueue = new TreatmentQueue();
    TreatmentQueue priorityQueue = new TreatmentQueue();

    // hashmap for fast patient search
    HashMap<Integer, Patient> patientMap = new HashMap<>();

    // add new patient to system
    public void addPatient(Patient p) {
        patientList.addPatient(p);
        patientMap.put(p.id, p);
    }

    // add treatment request
    public void addTreatmentRequest(PriorityTreatmentRequest req) {
        if (req.priority) {
            priorityQueue.enqueue(new TreatmentRequest(req.patientId));
        } else {
            normalQueue.enqueue(new TreatmentRequest(req.patientId));
        }
    }

    // process treatment request
    public void processTreatment() {
        TreatmentRequest req;

        // priority patients first
        if (priorityQueue.size() > 0) {
            req = priorityQueue.dequeue();
        } else {
            req = normalQueue.dequeue();
        }

        // after treatment, add to discharge stack
        if (req != null) {
            dischargeStack.push(new DischargeRecord(req.patientId));
        }
    }

    // print whole system state
    public void printSystem() {
        System.out.println("Patients:");
        patientList.printList();

        System.out.println("\nDischarge Records:");
        dischargeStack.printStack();
    }
}
