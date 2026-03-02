import java.util.Stack;

class MedicationProcessChecker {
    private Stack<String> stack = new Stack<>();

    public boolean checkProcess(String[] actions) {
        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];

            if (action.equals("PUSH")) {
                stack.push(action);
            } else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Khong hop le: POP khi Stack rong tai buoc " + (i + 1));
                    return false;
                }
                stack.pop();
            } else {
                System.out.println("Hanh dong khong hop le tai buoc " + (i + 1));
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Khong hop le: Ket thuc ca truc nhung van con thao tac chua hoan tat");
            return false;
        }

        System.out.println("Quy trinh hop le");
        return true;
    }

    public void reset() {
        stack.clear();
    }
}

public class PTIT_CNTT1_JAVA_Session15_BT03 {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] process1 = {"PUSH", "PUSH", "POP", "POP"};
        checker.checkProcess(process1);
        checker.reset();

        String[] process2 = {"PUSH", "POP", "POP"};
        checker.checkProcess(process2);
        checker.reset();

        String[] process3 = {"PUSH", "PUSH", "POP"};
        checker.checkProcess(process3);
    }
}