import java.util.Scanner;

public class PTIT_CNTTT1_Session01_BT02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ: ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        double tienPhatGoc = n * m * 5000;
        double tienPhatSauDieuChinh = tienPhatGoc;

        // Điều kiện tăng 20%
        if (n > 7 && m >= 3) {
            tienPhatSauDieuChinh = tienPhatGoc * 1.2;
        }

        boolean khoaThe = tienPhatSauDieuChinh > 50000;

        // Xuất kết quả
        System.out.println("Tiền phạt gốc: " + tienPhatGoc + " VND");
        System.out.println("Tiền phạt sau điều chỉnh: " + tienPhatSauDieuChinh + " VND");
        System.out.println("Yêu cầu khóa thẻ: " + khoaThe);
    }
}
