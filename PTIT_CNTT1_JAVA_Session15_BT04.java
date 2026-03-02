import java.util.LinkedList;
import java.util.Queue;

class EmergencyPatient {
    private String id;
    private String name;
    private int priority;

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        String level = (priority == 1) ? "Cap cuu" : "Thong thuong";
        return id + " - " + name + " - " + level;
    }
}

class EmergencyQueue {
    private Queue<EmergencyPatient> emergencyQueue = new LinkedList<>();
    private Queue<EmergencyPatient> normalQueue = new LinkedList<>();

    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQueue.offer(p);
        } else {
            normalQueue.offer(p);
        }
        System.out.println("Da tiep nhan: " + p);
        displayQueue();
    }

    public EmergencyPatient callNextPatient() {
        EmergencyPatient next;
        if (!emergencyQueue.isEmpty()) {
            next = emergencyQueue.poll();
        } else {
            next = normalQueue.poll();
        }

        if (next != null) {
            System.out.println("Dang kham: " + next);
        } else {
            System.out.println("Khong con benh nhan nao");
        }

        displayQueue();
        return next;
    }

    public void displayQueue() {
        System.out.println("Danh sach cho kham:");
        for (EmergencyPatient p : emergencyQueue) {
            System.out.println(p);
        }
        for (EmergencyPatient p : normalQueue) {
            System.out.println(p);
        }
        System.out.println("-------------------");
    }
}

public class PTIT_CNTT1_JAVA_Session15_BT04 {
    public static void main(String[] args) {
        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("E01", "Nguyen Van A", 2));
        queue.addPatient(new EmergencyPatient("E02", "Tran Thi B", 1));
        queue.addPatient(new EmergencyPatient("E03", "Le Van C", 2));
        queue.addPatient(new EmergencyPatient("E04", "Pham Thi D", 1));

        queue.callNextPatient();
        queue.callNextPatient();
        queue.callNextPatient();
    }
}