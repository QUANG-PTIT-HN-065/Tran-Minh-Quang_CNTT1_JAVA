public class PTIT_CNTT1_JAVA_Session04_BT04 {

   public static void main(String[] args) {
        String cardID = "TV202312345";

        if (!cardID.matches("^[A-Z]{2}.*")) {
            System.out.println("Thiếu hoặc sai tiền tố (phải là 2 chữ cái viết hoa)");
            return;
        }

        if (!cardID.startsWith("TV")) {
            System.out.println("Thiếu tiền tố TV");
            return;
        }

        if (!cardID.matches("^TV\\d{4}.*")) {
            System.out.println("Năm không hợp lệ");
            return;
        }

        if (!cardID.matches("^TV\\d{4}\\d{5}$")) {
            System.out.println("Phần số ngẫu nhiên không hợp lệ (phải đủ 5 chữ số)");
            return;
        }

        System.out.println("Mã thẻ hợp lệ!");
    }
}
