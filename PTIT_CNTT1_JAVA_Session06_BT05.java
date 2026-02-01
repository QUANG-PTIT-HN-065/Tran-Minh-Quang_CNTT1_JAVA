public class PTIT_CNTT1_JAVA_Session06_BT05 {

    private String bookId;
    private String title;
    private double price;

    public PTIT_CNTT1_JAVA_Session06_BT05(String bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Ma sach: " + bookId);
        System.out.println("Ten sach: " + title);
        System.out.println("Gia: " + price);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        PTIT_CNTT1_JAVA_Session06_BT05 b1 = new PTIT_CNTT1_JAVA_Session06_BT05("B01", "Lap trinh Java", 120000);
        PTIT_CNTT1_JAVA_Session06_BT05 b2 = new PTIT_CNTT1_JAVA_Session06_BT05("B02", "Cau truc du lieu", 150000);

        b1.displayInfo();
        b2.displayInfo();
    }
}
