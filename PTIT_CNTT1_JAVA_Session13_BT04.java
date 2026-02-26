import java.util.LinkedList;

class EmergencyRoom {
    private LinkedList<String> queue = new LinkedList<>();

    public void patientCheckIn(String name) {
        queue.addLast(name);
    }

    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
    }

    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Khong con benh nhan nao.");
            return;
        }

        String patient = queue.removeFirst();

        if (patient.equals("C")) {
            System.out.println("Dang cap cuu: " + patient);
        } else {
            System.out.println("Dang kham: " + patient);
        }
    }
}

public class PTIT_CNTT1_JAVA_Session13_BT04 {
    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}