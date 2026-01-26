import java.util.Scanner;

public class PTIT_CNTT1_Session02_BT03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int tienPhatMoiNgay = 5000;
        int total = 0;

        System.out.print("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so ngay tre cua cuon thu " + i + ": ");
            int soNgayTre = sc.nextInt();
            total += soNgayTre * tienPhatMoiNgay;
        }

        System.out.println("===> Tong tien phat: " + total + " VND");

        sc.close();
    }
}
