public class PTIT_CNTT1_JAVA_Session06_BT01 {

    String studentId;
    String fullName;
    int birthYear;
    double gpa;

    public PTIT_CNTT1_JAVA_Session06_BT01(String studentId, String fullName, int birthYear, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Ma SV: " + studentId);
        System.out.println("Ho ten: " + fullName);
        System.out.println("Nam sinh: " + birthYear);
        System.out.println("Diem TB: " + gpa);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        PTIT_CNTT1_JAVA_Session06_BT01 sv1 = new PTIT_CNTT1_JAVA_Session06_BT01("B2101234", "Nguyen Van A", 2003, 8.2);
        PTIT_CNTT1_JAVA_Session06_BT01 sv2 = new PTIT_CNTT1_JAVA_Session06_BT01("B2105678", "Tran Thi B", 2004, 7.6);

        sv1.displayInfo();
        sv2.displayInfo();
    }
}
