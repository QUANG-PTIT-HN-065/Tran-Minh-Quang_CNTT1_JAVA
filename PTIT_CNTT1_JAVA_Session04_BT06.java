import java.util.regex.*;
public class PTIT_CNTT1_JAVA_Session04_BT06 {

    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";

        String[] blacklist = {"tệ", "ngu ngốc", "không đáng"};

        String result = filterReview(review, blacklist);

        System.out.println("Review sau khi xử lý: " + result);
    }

    public static String filterReview(String review, String[] blacklist) {

        // 1. Thay thế từ nhạy cảm
        for (String word : blacklist) {
            String regex = "(?i)\\b" + Pattern.quote(word) + "\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(review);

            StringBuffer sb = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(
                    sb,
                    "*".repeat(matcher.group().length())
                );
            }
            matcher.appendTail(sb);
            review = sb.toString();
        }

        // 2. Cắt nếu quá 200 ký tự (không cắt giữa từ)
        if (review.length() > 200) {
            int cutIndex = review.lastIndexOf(" ", 200);
            if (cutIndex == -1) cutIndex = 200;

            StringBuilder builder = new StringBuilder();
            builder.append(review.substring(0, cutIndex));
            builder.append("...");

            review = builder.toString();
        }

        return review;
    }
}
