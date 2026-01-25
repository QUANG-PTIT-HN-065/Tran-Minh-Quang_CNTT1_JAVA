public class PTIT_CNTTT1_Session01_BT03 {
    public static void main(String[] args) {

        // Khai báo biến
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);

        // Biến tạm
        String temp;

        /*
         * === GIẢI THÍCH BỘ NHỚ ===
         *
         * - Các biến book1, book2, temp nằm trên STACK
         * - Các chuỗi "Java Basic", "Python Intro" nằm trên HEAP (String Pool)
         *
         * STACK:              HEAP (String Pool):
         * book1 =>  "Java Basic"
         * book2 +>"Python Intro"
         */

        temp = book1;
        /*
         * temp trỏ tới cùng vùng nhớ Heap với book1
         *
         * STACK:
         * book1 => "Java Basic"
         * book2 => "Python Intro"
         * temp => "Java Basic"
         */

        book1 = book2;
        /*
         * book1 đổi tham chiếu, trỏ sang "Python Intro"
         *
         * STACK:
         * book1 => "Python Intro"
         * book2 => "Python Intro"
         * temp  => "Java Basic"
         */

        book2 = temp;
        /*
         * book2 trỏ sang chuỗi mà temp đang giữ
         *
         * STACK:
         * book1 => "Python Intro"
         * book2 => "Java Basic"
         * temp  => "Java Basic"
         *
         * Hoán đổi hoàn tất
         */

        System.out.println("Sau khi hoán đổi:  Book1 = " + book1 + ", Book2 = " + book2);
    }
}
