public class PTIT_CNTT1_JAVA_Session07_BT01 {

    private String studentId;
    private String studentName;
    private static int totalStudent = 0;

    public PTIT_CNTT1_JAVA_Session07_BT01(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Ten sinh vien: " + studentName);
    }

    public static void displayTotalStudent() {
        System.out.println("Tong so sinh vien da tao: " + totalStudent);
    }

    public static void main(String[] args) {
        PTIT_CNTT1_JAVA_Session07_BT01 s1 = new PTIT_CNTT1_JAVA_Session07_BT01("B2100001", "Nguyen Van A");
        PTIT_CNTT1_JAVA_Session07_BT01 s2 = new PTIT_CNTT1_JAVA_Session07_BT01("B2100002", "Tran Thi B");
        PTIT_CNTT1_JAVA_Session07_BT01 s3 = new PTIT_CNTT1_JAVA_Session07_BT01("B2100003", "Le Van C");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        PTIT_CNTT1_JAVA_Session07_BT01.displayTotalStudent();
    }
}
