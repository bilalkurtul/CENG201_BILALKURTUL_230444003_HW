public class PriorityTreatmentRequest {

    int patientId;      // patient id
    boolean priority;   // true if emergency
    long arrivalTime;   // request time

    // constructor
    public PriorityTreatmentRequest(int patientId, boolean priority) {
        this.patientId = patientId;
        this.priority = priority;
        this.arrivalTime = System.currentTimeMillis();
    }

    // print request info
    public String toString() {
        return "PatientID: " + patientId + ", Priority: " + priority;
    }
}
