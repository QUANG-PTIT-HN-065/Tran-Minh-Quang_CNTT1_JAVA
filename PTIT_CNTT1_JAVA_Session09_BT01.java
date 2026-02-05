class Person {
    protected String fullName;
    protected int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Ho ten: " + fullName);
        System.out.println("Tuoi: " + age);
    }
}

class Student extends Person {
    private String studentId;
    private double averageScore;

    public Student(String fullName, int age, String studentId, double averageScore) {
        super(fullName, age);
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Diem trung binh: " + averageScore);
    }
}

public class PTIT_CNTT1_JAVA_Session09_BT01 {
    public static void main(String[] args) {
        Student st = new Student("Tran Minh Quang", 20, "SV001", 8.5);
        st.displayInfo();
    }
}
