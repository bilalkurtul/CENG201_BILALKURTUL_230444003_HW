public class Patient {

    int id;          // patient id number
    String name;     // patient full name
    int severity;    // sickness level between 1-10
    int age;         // patient age

    // constructor for patient object
    public Patient(int id, String name, int severity, int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    // print patient info on screen
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Severity: " + severity +
                ", Age: " + age;
    }
}
