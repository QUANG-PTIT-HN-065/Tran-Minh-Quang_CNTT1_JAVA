import java.util.regex.*;
public class PTIT_CNTT1_JAVA_Session04_BT05 {
     public static void main(String[] args) {
        String[] logs = {
            "2024-05-20 | NguyenVanA | BORROW | BK12345",
            "2024-05-21 | TranVanB | RETURN | BK12345",
            "2024-05-22 | NguyenVanA | BORROW | BK67890"
        };

        String regex = "(\\d{4}-\\d{2}-\\d{2})\\s*\\|\\s*(\\w+)\\s*\\|\\s*(BORROW|RETURN)\\s*\\|\\s*(BK\\d+)";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);

            if (matcher.find()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                System.out.println("Ngày: " + date);
                System.out.println("Người dùng: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookId);
                System.out.println("--------------------");

                if (action.equals("BORROW")) borrowCount++;
                else if (action.equals("RETURN")) returnCount++;
            }
        }

        System.out.println("Tổng BORROW: " + borrowCount);
        System.out.println("Tổng RETURN: " + returnCount);
    }
   
}
