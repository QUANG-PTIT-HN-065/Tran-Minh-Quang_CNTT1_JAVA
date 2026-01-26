import java.util.Scanner;
public class PTIT_CNTT1_Session02_BT01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhap so sach dang muon: ");
        int soSach = sc.nextInt();

        if (tuoi >= 18 && soSach < 3) {
            System.out.println("Ket qua: Ban DU DIEU KIEN muon sach quy hiem.");
        } else {
            if (tuoi < 18) {
                System.out.println("Ket qua: Ban CHUA DU TUOI de muon sach quy hiem.");
            } else {
                System.out.println("Ket qua: Ban DA MUON QUA SO LUONG cho phep.");
            }
        }
        sc.close();
    }
}
