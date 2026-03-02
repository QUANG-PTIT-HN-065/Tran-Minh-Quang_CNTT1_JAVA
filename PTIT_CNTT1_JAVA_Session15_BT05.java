import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Patient {
    private String id;
    private String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

class TreatmentStep {
    private String description;
    private String time;

    public TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    @Override
    public String toString() {
        return description + " - " + time;
    }
}

class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Them buoc: " + step);
    }

    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            TreatmentStep removed = steps.pop();
            System.out.println("Undo buoc: " + removed);
            return removed;
        }
        System.out.println("Khong co buoc nao de undo");
        return null;
    }

    public void displaySteps() {
        System.out.println("Cac buoc xu ly cua " + patient + ":");
        for (TreatmentStep step : steps) {
            System.out.println(step);
        }
        System.out.println("-------------------");
    }

    public Patient getPatient() {
        return patient;
    }
}

class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases = new LinkedList<>();

    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Tiep nhan: " + c.getPatient());
    }

    public EmergencyCase getNextCase() {
        EmergencyCase next = cases.poll();
        if (next != null) {
            System.out.println("Dang xu ly: " + next.getPatient());
        } else {
            System.out.println("Khong con ca nao");
        }
        return next;
    }
}

public class PTIT_CNTT1_JAVA_Session15_BT05 {
    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        EmergencyCase case1 = new EmergencyCase(new Patient("P01", "Nguyen Van A"));
        EmergencyCase case2 = new EmergencyCase(new Patient("P02", "Tran Thi B"));

        queue.addCase(case1);
        queue.addCase(case2);

        EmergencyCase current = queue.getNextCase();

        current.addStep(new TreatmentStep("Tiep nhan", "08:00"));
        current.addStep(new TreatmentStep("Chan doan", "08:10"));
        current.addStep(new TreatmentStep("Dieu tri", "08:20"));

        current.displaySteps();

        current.undoStep();
        current.displaySteps();
    }
}