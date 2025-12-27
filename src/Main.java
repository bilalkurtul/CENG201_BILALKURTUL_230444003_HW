public class Main {

    public static void main(String[] args) {

        PatientList patientList = new PatientList();

        // add 5 patients
        patientList.addPatient(new Patient(1, "Ali Yilmaz", 7, 45));
        patientList.addPatient(new Patient(2, "Ayse Demir", 4, 30));
        patientList.addPatient(new Patient(3, "Mehmet Kaya", 9, 60));
        patientList.addPatient(new Patient(4, "Zeynep Acar", 3, 25));
        patientList.addPatient(new Patient(5, "Can Ozkan", 6, 50));

        // remove one patient
        patientList.removePatient(2);

        // search patient
        Patient foundPatient = patientList.findPatient(3);
        if (foundPatient != null) {
            System.out.println("Patient founded: " + foundPatient);
        } else {
            System.out.println("Patient not found.");
        }

        // print final list
        System.out.println("\nFinal patient list:");
        patientList.printList();
    }
}
