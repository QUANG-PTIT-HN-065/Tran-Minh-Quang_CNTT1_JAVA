
import java.util.*;

class Patient {

    String id;
    String fullName;
    int age;
    String diagnosis;

    public Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "ID : " + id
                + " | FullName : " + fullName
                + " | Age : " + age
                + " | Diagnosis : " + diagnosis;
    }
}

public class PTIT_CNTT1_JAVA_Session13_BT05 {

    private static ArrayList<Patient> patientList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    displayPatients();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("===============MENU===============");
        System.out.println("1. Tiep nhan benh nhan");
        System.out.println("2. Cap nhat chan doan");
        System.out.println("3. Xuat vien");
        System.out.println("4. Sap xep danh sach benh nhan");
        System.out.println("5. Hien thi danh sach benh nhan");
        System.out.println("6. Thoat");
        System.out.println("==================================");
        System.out.print("Chon chuc nang: ");
    }

    private static void addPatient() {
        System.out.print("Nhap ID benh nhan: ");
        String id = scanner.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                System.out.println("ID da ton tai.");
                return;
            }
        }

        System.out.print("Nhap ten benh nhan: ");
        String name = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap chan doan: ");
        String diagnosis = scanner.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Benh nhan da duoc them thanh cong.");
    }

    private static void updateDiagnosis() {
        System.out.print("Nhap ID benh nhan de cap nhat chan doan: ");
        String id = scanner.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                System.out.print("Nhap chan doan moi: ");
                String newDiagnosis = scanner.nextLine();
                p.setDiagnosis(newDiagnosis);
                System.out.println("Chan doan da duoc cap nhat.");
                return;
            }
        }

        System.out.println("Khong tim thay benh nhan voi ID da cho.");
    }

    private static void dischargePatient() {
        System.out.print("Nhap ID benh nhan de xuat vien: ");
        String id = scanner.nextLine();

        Iterator<Patient> iterator = patientList.iterator();
        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId().equals(id)) {
                iterator.remove();
                System.out.println("Benh nhan da duoc xuat vien.");
                return;
            }
        }

        System.out.println("Khong tim thay benh nhan voi ID da cho.");
    }

    private static void sortPatients() {
        patientList.sort(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge();
                }
                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });

        System.out.println("Danh sach benh nhan da duoc sap xep.");
    }

    private static void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sach trong.");
            return;
        }

        System.out.println("=========Danh sach benh nhan=========");
        for (Patient p : patientList) {
            System.out.println(p);
        }
    }
}
