public class DischargeRecord {

    int patientId;        // discharged patient id
    long dischargeTime;   // time of discharge

    // constructor
    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }

    // print discharge info
    public String toString() {
        return "PatientID: " + patientId + ", Time: " + dischargeTime;
    }
}
