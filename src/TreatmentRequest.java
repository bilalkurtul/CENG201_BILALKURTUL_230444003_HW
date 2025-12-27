public class TreatmentRequest {

    int patientId;        // id of patient who wants treatment
    long arrivalTime;     // time when request created

    // constructor
    public TreatmentRequest(int patientId) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis(); // take current time
    }

    // print request info
    public String toString() {
        return "PatientID: " + patientId + ", Time: " + arrivalTime;
    }
}
