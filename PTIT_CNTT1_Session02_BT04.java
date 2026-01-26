import java.util.Scanner;

public class PTIT_CNTT1_Session02_BT04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;

        do {
            System.out.print("Nhap ma ID sach moi (phai > 0): ");
            id = scanner.nextInt();

            if (id <= 0) {
                System.out.println("Loi: ID phai la so duong. Moi nhap lai!");
            }
        } while (id <= 0);

        System.out.println("Xac nhan: Ma sach " + id + " da duoc ghi nhan.");
    }
}
