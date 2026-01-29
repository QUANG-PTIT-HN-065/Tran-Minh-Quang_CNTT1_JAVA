import java.util.Scanner;
import java.util.regex.Pattern;

public class MSSVManager {

    static final int MAX = 100;
    static String[] mssvList = new String[MAX];
    static int count = 0;

    static final String MSSV_REGEX = "^B\\d{7}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU QUAN LY MSSV =====");
            System.out.println("1. Hien thi danh sach MSSV");
            System.out.println("2. Them MSSV moi");
            System.out.println("3. Cap nhat MSSV theo vi tri");
            System.out.println("4. Xoa MSSV");
            System.out.println("5. Tim kiem MSSV");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            while (!sc.hasNextInt()) {
                System.out.print("Nhap so hop le: ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addMSSV(sc);
                    break;
                case 3:
                    updateMSSV(sc);
                    break;
                case 4:
                    deleteMSSV(sc);
                    break;
                case 5:
                    searchMSSV(sc);
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);

        sc.close();
    }

    static void display() {
        if (count == 0) {
            System.out.println("Danh sach rong.");
            return;
        }

        System.out.println("Danh sach MSSV:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + mssvList[i]);
        }
    }

    static void addMSSV(Scanner sc) {
        if (count >= MAX) {
            System.out.println("Danh sach da day!");
            return;
        }

        String mssv;
        do {
            System.out.print("Nhap MSSV (Bxxxxxxx): ");
            mssv = sc.nextLine().trim();
            if (!Pattern.matches(MSSV_REGEX, mssv)) {
                System.out.println("Sai dinh dang MSSV!");
            }
        } while (!Pattern.matches(MSSV_REGEX, mssv));

        mssvList[count++] = mssv;
        System.out.println("Them MSSV thanh cong!");
    }

    static void updateMSSV(Scanner sc) {
        if (count == 0) {
            System.out.println("Danh sach rong.");
            return;
        }

        System.out.print("Nhap vi tri can sua (1 - " + count + "): ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index < 1 || index > count) {
            System.out.println("Vi tri khong hop le!");
            return;
        }

        String newMssv;
        do {
            System.out.print("Nhap MSSV moi: ");
            newMssv = sc.nextLine().trim();
            if (!Pattern.matches(MSSV_REGEX, newMssv)) {
                System.out.println("Sai dinh dang MSSV!");
            }
        } while (!Pattern.matches(MSSV_REGEX, newMssv));

        mssvList[index - 1] = newMssv;
        System.out.println("Cap nhat thanh cong!");
    }

    static void deleteMSSV(Scanner sc) {
        if (count == 0) {
            System.out.println("Danh sach rong.");
            return;
        }

        System.out.print("Nhap MSSV can xoa: ");
        String target = sc.nextLine().trim();

        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].equalsIgnoreCase(target)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Khong tim thay MSSV!");
            return;
        }

        for (int i = pos; i < count - 1; i++) {
            mssvList[i] = mssvList[i + 1];
        }
        count--;

        System.out.println("Da xoa MSSV thanh cong!");
    }

    static void searchMSSV(Scanner sc) {
        if (count == 0) {
            System.out.println("Danh sach rong.");
            return;
        }

        System.out.print("Nhap chuoi can tim: ");
        String key = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].toLowerCase().contains(key)) {
                System.out.println("Tim thay: " + mssvList[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong co MSSV nao phu hop.");
        }
    }
}
