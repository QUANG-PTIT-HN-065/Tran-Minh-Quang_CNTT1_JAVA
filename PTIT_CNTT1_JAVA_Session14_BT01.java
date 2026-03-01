import java.util.LinkedHashSet;

public class PTIT_CNTT1_JAVA_Session14_BT01 {
    public static void main(String[] args) {

        LinkedHashSet<String> patients = new LinkedHashSet<>();

        patients.add("Nguyễn Văn A – Yên Bái");
        patients.add("Trần Thị B – Thái Bình");
        patients.add("Nguyễn Văn A – Yên Bái");
        patients.add("Lê Văn C – Hưng Yên");

        System.out.println("Danh sách gọi khám:");
        for (String name : patients) {
            System.out.println(name);
        }
    }
}