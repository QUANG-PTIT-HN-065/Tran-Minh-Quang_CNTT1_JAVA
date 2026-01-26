import java.util.Scanner;

public class PTIT_CNTT1_Session02_BT05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diem = 100;   // điểm uy tín ban đầu
        int ngayTre;

        System.out.println("HE THONG DANH GIA DOC GIA");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");

        while (true) {
            System.out.print("So ngay tre cua lan nay: ");
            ngayTre = scanner.nextInt();

            if (ngayTre == 999) {
                break; // mã thoát
            }

            if (ngayTre <= 0) {
                diem += 5;
                System.out.println("-> Tra dung han: +5 diem.");
            } else {
                int truDiem = ngayTre * 2;
                diem -= truDiem;
                System.out.println("-> Tra tre " + ngayTre + " ngay: " + truDiem + " diem.");
            }
        }

        System.out.println("Tong diem uy tin: " + diem);

        if (diem > 120) {
            System.out.println("Xep loai: DOC GIA THAN THIET");
        } else if (diem >= 80) {
            System.out.println("Xep loai: DOC GIA TIEU CHUAN");
        } else {
            System.out.println("Xep loai: DOC GIA CAN LUU Y");
        }
    }
}
