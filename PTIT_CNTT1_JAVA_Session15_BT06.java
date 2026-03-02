import java.util.*;
// 1. BỆNH NHÂN CHỜ KHÁM (QUEUE - FIFO)

class Patient {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + gender;
    }
}

class PatientWaitingQueue {
    private Queue<Patient> waitingQueue = new LinkedList<>();
    private int totalPatients = 0;

    public void addPatient(Patient p) {
        waitingQueue.offer(p);
        totalPatients++;
    }

    public Patient callNext() {
        Patient p = waitingQueue.poll();
        if (p != null) totalPatients--;
        return p;
    }

    public void displayQueue() {
        System.out.println("Danh sach cho kham:");
        for (Patient p : waitingQueue) {
            System.out.println(p);
        }
        System.out.println("Tong so: " + totalPatients);
        System.out.println("------------------");
    }
}

// 2. LỊCH SỬ CHỈNH SỬA (STACK - LIFO)

class EditAction {
    private String description;
    private String editedBy;
    private String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    @Override
    public String toString() {
        return description + " - " + editedBy + " - " + editTime;
    }
}

class MedicalRecordHistory {
    private Stack<EditAction> editStack = new Stack<>();
    private String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
    }

    public EditAction undoEdit() {
        if (!editStack.isEmpty()) {
            return editStack.pop();
        }
        return null;
    }

    public void displayHistory() {
        System.out.println("Lich su benh an " + recordId);
        for (EditAction e : editStack) {
            System.out.println(e);
        }
        System.out.println("------------------");
    }
}

// 3. HỆ THỐNG GỌI SỐ (QUEUE)

class Ticket {
    private int ticketNumber;
    private String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    @Override
    public String toString() {
        return "So " + ticketNumber + " - " + issuedTime;
    }
}

class TicketSystem {
    private Queue<Ticket> ticketQueue = new LinkedList<>();
    private int currentNumber = 0;

    public void issueTicket(String time) {
        currentNumber++;
        ticketQueue.offer(new Ticket(currentNumber, time));
    }

    public Ticket callNext() {
        return ticketQueue.poll();
    }

    public void displayTickets() {
        for (Ticket t : ticketQueue) {
            System.out.println(t);
        }
        System.out.println("------------------");
    }
}

// 4. UNDO NHẬP LIỆU (STACK)

class InputAction {
    private String fieldName;
    private String oldValue;
    private String newValue;
    private String actionTime;

    public InputAction(String fieldName, String oldValue, String newValue, String actionTime) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }

    @Override
    public String toString() {
        return fieldName + ": " + oldValue + " -> " + newValue + " (" + actionTime + ")";
    }
}

class UndoManager {
    private Stack<InputAction> undoStack = new Stack<>();
    private int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction action) {
        if (undoStack.size() >= maxUndoSteps) {
            undoStack.remove(0);
        }
        undoStack.push(action);
    }

    public InputAction undo() {
        if (!undoStack.isEmpty()) {
            return undoStack.pop();
        }
        return null;
    }

    public void displayUndoStack() {
        for (InputAction a : undoStack) {
            System.out.println(a);
        }
        System.out.println("------------------");
    }
}


public class PTIT_CNTT1_JAVA_Session15_BT06 {
    public static void main(String[] args) {

        PatientWaitingQueue pq = new PatientWaitingQueue();
        pq.addPatient(new Patient("P01", "Lan", 30, "Nu"));
        pq.addPatient(new Patient("P02", "Hùng", 45, "Nam"));
        pq.displayQueue();
        System.out.println("Dang kham: " + pq.callNext());
        pq.displayQueue();

        MedicalRecordHistory history = new MedicalRecordHistory("HS001");
        history.addEdit(new EditAction("Cap nhat chan doan", "BS A", "09:00"));
        history.addEdit(new EditAction("Them ket qua xet nghiem", "BS B", "09:30"));
        history.displayHistory();
        System.out.println("Undo: " + history.undoEdit());
        history.displayHistory();

        TicketSystem ts = new TicketSystem();
        ts.issueTicket("08:00");
        ts.issueTicket("08:05");
        ts.displayTickets();
        System.out.println("Dang goi: " + ts.callNext());
        ts.displayTickets();

        UndoManager um = new UndoManager(3);
        um.addAction(new InputAction("Ten", "Lan", "Lan Anh", "10:00"));
        um.addAction(new InputAction("Tuoi", "30", "31", "10:05"));
        um.displayUndoStack();
        System.out.println("Undo: " + um.undo());
        um.displayUndoStack();
    }
}