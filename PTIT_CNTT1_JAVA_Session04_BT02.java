public class PTIT_CNTT1_JAVA_Session04_BT02 {

    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";

        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + "Kệ:".length();

            int end = description.indexOf(",", start);
            if (end == -1) {
                end = description.length();
            }

            String position = description.substring(start, end).trim();
            System.out.println("Vị trí tìm thấy: " + position);

            String newDescription = description.replace("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Mô tả mới: " + newDescription);
        }
    }
}
