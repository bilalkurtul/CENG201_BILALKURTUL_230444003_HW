public class Task4Main {

    public static void main(String[] args) {

        // create hospital system object
        HospitalSystem system = new HospitalSystem();

        // add 10 patients to system
        // patients are added to linked list and hashmap
        for (int i = 1; i <= 10; i++) {
            system.addPatient(
                    new Patient(
                            i,                     // patient id
                            "Patient " + i,        // patient name
                            i % 10 + 1,             // severity level
                            20 + i                 // patient age
                    )
            );
        }

        // add normal treatment requests
        system.addTreatmentRequest(new PriorityTreatmentRequest(1, false));
        system.addTreatmentRequest(new PriorityTreatmentRequest(2, false));
        system.addTreatmentRequest(new PriorityTreatmentRequest(3, false));
        system.addTreatmentRequest(new PriorityTreatmentRequest(4, false));
        system.addTreatmentRequest(new PriorityTreatmentRequest(5, false));

        // add priority treatment requests (emergency cases)
        system.addTreatmentRequest(new PriorityTreatmentRequest(6, true));
        system.addTreatmentRequest(new PriorityTreatmentRequest(7, true));
        system.addTreatmentRequest(new PriorityTreatmentRequest(8, true));

        // process 4 treatment requests
        // priority patients will be processed first
        system.processTreatment();
        system.processTreatment();
        system.processTreatment();
        system.processTreatment();

        // print final state of hospital system
        // shows patient list and discharge records
        System.out.println("\nFinal Hospital System State:");
        system.printSystem();
    }
}
