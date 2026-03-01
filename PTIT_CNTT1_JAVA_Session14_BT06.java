import java.util.*;

class Patient {
     String name;
     int age;
     String department;

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + age + " tuổi)";
    }
}

public class PTIT_CNTT1_JAVA_Session14_BT06 {
    public static void main(String[] args) {

        List<Patient> patientList = new ArrayList<>();
        patientList.add(new Patient("Lan", 30, "Tim mạch"));
        patientList.add(new Patient("Hùng", 45, "Nội tiết"));
        patientList.add(new Patient("Mai", 28, "Tim mạch"));

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patientList) {
            if (!departmentMap.containsKey(p.getDepartment())) {
                departmentMap.put(p.getDepartment(), new ArrayList<>());
            }
            departmentMap.get(p.getDepartment()).add(p);
        }

        for (String dept : departmentMap.keySet()) {
            System.out.println("Khoa " + dept + " -> " + departmentMap.get(dept));
        }

        String searchDept = "Tim mạch";
        if (departmentMap.containsKey(searchDept)) {
            System.out.println("\nDanh sách khoa " + searchDept + ":");
            for (Patient p : departmentMap.get(searchDept)) {
                System.out.println(p);
            }
        }

        String maxDept = "";
        int maxCount = 0;

        for (String dept : departmentMap.keySet()) {
            int size = departmentMap.get(dept).size();
            if (size > maxCount) {
                maxCount = size;
                maxDept = dept;
            }
        }

        System.out.println("\nKhoa " + maxDept + " đang đông nhất (" + maxCount + " bệnh nhân)");
    }
}