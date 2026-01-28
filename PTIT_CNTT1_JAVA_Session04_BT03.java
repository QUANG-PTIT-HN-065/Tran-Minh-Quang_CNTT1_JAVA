import java.time.LocalDate;
public class PTIT_CNTT1_JAVA_Session04_BT03 {

    public static void main(String[] args) {

        String[] transactions = {
            "BK001-20/01",
            "BK005-21/01",
            "BK099-22/01"
        };

        long startSb = System.currentTimeMillis();

        StringBuilder report = new StringBuilder();
        report.append("BÁO CÁO MƯỢN SÁCH\n");
        report.append("Ngày tạo: ")
              .append(LocalDate.now())
              .append("\n");

        for (String t : transactions) {
            report.append("Giao dịch: ")
                  .append(t)
                  .append("\n");
        }

        long endSb = System.currentTimeMillis();
        long timeSb = endSb - startSb;

        long startStr = System.currentTimeMillis();

        String reportStr = "BÁO CÁO MƯỢN SÁCH\n";
        reportStr += "Ngày tạo: " + LocalDate.now() + "\n";

        for (String t : transactions) {
            reportStr += "Giao dịch: " + t + "\n";
        }

        long endStr = System.currentTimeMillis();
        long timeStr = endStr - startStr;

        System.out.println(report);
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeSb);
        System.out.println("Số thời gian thực thi đối với String: " + timeStr);
    }
}
