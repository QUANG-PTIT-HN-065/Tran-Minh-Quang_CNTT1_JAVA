public class PTIT_CNTT1_JAVA_Session04_BT01 {

    public static String capitalizeWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(
                    Character.toUpperCase(word.charAt(0))
                    + word.substring(1).toLowerCase()
                    + " "
                );
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {

        String title = " lap TRiNH java Co ban ";
        String author = "nguyan   van   a";

        title = title.trim().replaceAll("\\s+", " ");
        author = author.trim().replaceAll("\\s+", " ");

        title = title.toUpperCase();
        author = capitalizeWords(author);

        System.out.println("[" + title + "] Tác giả: " + author);
    }
}
