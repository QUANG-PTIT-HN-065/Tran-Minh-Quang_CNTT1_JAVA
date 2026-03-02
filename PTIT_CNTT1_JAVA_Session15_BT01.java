import java.util.Stack;

class EditAction {
    private String description;
    private String time;

    public EditAction(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return description + " - " + time;
    }
}

class MedicalRecordHistory {
    private Stack<EditAction> history = new Stack<>();

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Da them: " + action);
        displayHistory();
    }

    public EditAction undoEdit() {
        if (!history.isEmpty()) {
            EditAction removed = history.pop();
            System.out.println("Undo: " + removed);
            displayHistory();
            return removed;
        }
        System.out.println("Khong co lich su de undo");
        return null;
    }

    public EditAction getLatestEdit() {
        if (!history.isEmpty()) {
            return history.peek();
        }
        return null;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        System.out.println("Lich su hien tai:");
        for (EditAction action : history) {
            System.out.println(action);
        }
        System.out.println("-------------------");
    }
}

public class PTIT_CNTT1_JAVA_Session15_BT01 {
    public static void main(String[] args) {
        MedicalRecordHistory record = new MedicalRecordHistory();

        record.addEdit(new EditAction("Cap nhat chan doan", "10:00"));
        record.addEdit(new EditAction("Them ket qua xet nghiem", "10:15"));
        record.addEdit(new EditAction("Chinh sua lieu trinh", "10:30"));

        System.out.println("Chinh sua gan nhat: " + record.getLatestEdit());

        record.undoEdit();
        record.undoEdit();
    }
}