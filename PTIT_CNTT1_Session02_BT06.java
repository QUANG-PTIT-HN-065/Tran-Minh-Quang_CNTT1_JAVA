import java.util.Scanner;

public class PTIT_CNTT1_Session02_BT06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = -1;
        int min = -1;
        int tong = 0;
        int dem = 0;

        for (int i = 2; i <= 8; i++) {
            String ngay;

            if (i <= 7) {
                ngay = "Thu " + i;
            } else {
                ngay = "Chu Nhat";
            }

            System.out.print("Nhap luot muon ngay " + ngay + ": ");
            int luotMuon = scanner.nextInt();

            if (luotMuon == 0) {
                continue; // bo qua ngay dong cua
            }

            if (max == -1 || luotMuon > max) {
                max = luotMuon;
            }

            if (min == -1 || luotMuon < min) {
                min = luotMuon;
            }

            tong += luotMuon;
            dem++;
        }

        double trungBinh = (dem > 0) ? (double) tong / dem : 0;

        System.out.println("KET QUA THONG KE");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + trungBinh);
    }
}
