import java.util.LinkedList;
import java.util.Queue;

class Patient {
    private String id;
    private String name;
    private int age;

    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " tuoi";
    }
}

class PatientQueue {
    private Queue<Patient> queue = new LinkedList<>();

    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Da tiep nhan: " + p);
        displayQueue();
    }

    public Patient callNextPatient() {
        if (!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println("Dang kham: " + p);
            displayQueue();
            return p;
        }
        System.out.println("Khong con benh nhan nao");
        return null;
    }

    public Patient peekNextPatient() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        System.out.println("Danh sach cho kham:");
        for (Patient p : queue) {
            System.out.println(p);
        }
        System.out.println("-------------------");
    }
}

public class PTIT_CNTT1_JAVA_Session15_BT02 {
    public static void main(String[] args) {
        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("P01", "Nguyen Van A", 30));
        pq.addPatient(new Patient("P02", "Tran Thi B", 25));
        pq.addPatient(new Patient("P03", "Le Van C", 40));

        System.out.println("Benh nhan tiep theo: " + pq.peekNextPatient());

        pq.callNextPatient();
        pq.callNextPatient();
    }
}