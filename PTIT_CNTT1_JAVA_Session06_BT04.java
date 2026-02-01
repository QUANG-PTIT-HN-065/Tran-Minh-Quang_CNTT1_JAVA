public class PTIT_CNTT1_JAVA_Session06_BT04 {

    private String empId;
    private String empName;
    private double salary;


    public PTIT_CNTT1_JAVA_Session06_BT04() {
        this.empId = "Chua co";
        this.empName = "Chua co";
        this.salary = 0;
    }

    public PTIT_CNTT1_JAVA_Session06_BT04(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.salary = 0;
    }

    public PTIT_CNTT1_JAVA_Session06_BT04(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Ma NV: " + empId);
        System.out.println("Ten NV: " + empName);
        System.out.println("Luong: " + salary);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        PTIT_CNTT1_JAVA_Session06_BT04 e1 = new PTIT_CNTT1_JAVA_Session06_BT04();
        PTIT_CNTT1_JAVA_Session06_BT04 e2 = new PTIT_CNTT1_JAVA_Session06_BT04("NV01", "Nguyen Van A");
        PTIT_CNTT1_JAVA_Session06_BT04 e3 = new PTIT_CNTT1_JAVA_Session06_BT04("NV02", "Tran Thi B", 15000000);
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
