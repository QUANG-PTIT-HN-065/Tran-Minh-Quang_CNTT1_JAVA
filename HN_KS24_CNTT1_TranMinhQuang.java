import java.util.Scanner;

class Student {

    private String id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(String id, String name, double score) {
        setId(id);
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.matches("SV\\d{3}")) {
            this.id = id;
        } else {
            System.out.println("Mã sinh viên không hợp lệ! (VD: SV001)");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank() {
        if (score >= 8.0) return "Gioi";
        if (score >= 6.5) return "Kha";
        return "Trung Binh";
    }

    @Override
    public String toString() {
        return "Ma: " + id +
                " | Ten: " + name +
                " | Diem: " + score +
                " | Hoc luc: " + getRank();
    }
}

public class HN_KS24_CNTT1_TranMinhQuang {

    public static void inputStudents(Student[] students, int n, Scanner sc) {

        for (int i = 0; i < n; i++) {

            System.out.println("Sinh vien thu " + (i + 1));

            String id;
            while (true) {
                System.out.print("Nhap ma SV (SVxxx): ");
                id = sc.nextLine();
                if (id.matches("SV\\d{3}")) break;
                System.out.println("Sai dinh dang!");
            }

            System.out.print("Nhap ten: ");
            String name = sc.nextLine();

            System.out.print("Nhap diem: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(id, name, score);
        }
    }

    public static void displayStudents(Student[] students, int n) {

        if (n == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
    }

    public static void searchByRank(Student[] students, int n, Scanner sc) {

        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh): ");
        String keyword = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (students[i].getRank().equalsIgnoreCase(keyword)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }

    public static void sortStudents(Student[] students, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (students[j].getScore() < students[j + 1].getScore()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("Da sap xep giam dan theo diem!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int n = 0;

        int choice;

        do {
            System.out.println("\n===== QUAN LY DIEM SINH VIEN =====");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo hoc luc");
            System.out.println("4. Sap xep theo hoc luc giam dan");
            System.out.println("5. Thoat");
            System.out.println("==================================");
            System.out.print("Chon chuc nang: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    inputStudents(students, n, sc);
                    break;

                case 2:
                    displayStudents(students, n);
                    break;

                case 3:
                    searchByRank(students, n, sc);
                    break;

                case 4:
                    sortStudents(students, n);
                    break;

                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 5);

        sc.close();
    }
}
