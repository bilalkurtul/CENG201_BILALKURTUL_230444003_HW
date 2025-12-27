public class Task3Main {

    public static void main(String[] args) {

        DischargeStack stack = new DischargeStack();

        // add 5 discharge records
        for (int i = 1; i <= 5; i++) {
            stack.push(new DischargeRecord(i));
        }

        // remove 2 records
        stack.pop();
        stack.pop();

        System.out.println("Remaining discharge stack:");
        stack.printStack();
    }
}
