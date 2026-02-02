public class PTIT_CNTT1_JAVA_Session07_BT04 {

    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("Nguyen Van A");
        ClassRoom sv2 = new ClassRoom("Tran Thi B");
        ClassRoom sv3 = new ClassRoom("Le Van C");

        sv1.dongQuy(100000);
        sv2.dongQuy(150000);
        sv3.dongQuy(200000);

        ClassRoom.xemTongQuy();
    }
}

class ClassRoom {

    private String tenSinhVien;
    private static double classFund = 0;

    public ClassRoom(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void dongQuy(double soTien) {
        classFund += soTien;
        System.out.println(tenSinhVien + " đã đóng: " + soTien);
    }

    public static void xemTongQuy() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }
}
