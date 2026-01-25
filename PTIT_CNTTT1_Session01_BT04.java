import java.util.Scanner;

public class PTIT_CNTTT1_Session01_BT04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giá sách (USD)
        System.out.print("Nhập giá sách (USD kiểu double): ");
        double priceUSD = sc.nextDouble();

        // Tỷ giá cố định theo output mẫu
        float exchangeRate = 25450.0f;

        // Tính giá chính xác (double)
        double exactPrice = priceUSD * exchangeRate;

        // Ép kiểu sang long để làm tròn thanh toán
        long roundedPrice = (long) exactPrice;

        // Xuất kết quả
        System.out.println("Giá chính xác (số thực): " + exactPrice);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedPrice);
    }
}
PTIT_CNTTT1_Session01_BT01.java
