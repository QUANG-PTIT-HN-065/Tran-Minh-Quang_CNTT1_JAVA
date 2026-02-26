import java.util.*;

public class PTIT_CNTT1_JAVA_Session13_BT03 {

    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (T item : listA) {
            if (listB.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> listIntA = Arrays.asList(101, 102, 105);
        List<Integer> listIntB = Arrays.asList(102, 105, 108);

        List<Integer> commonInt = findCommonPatients(listIntA, listIntB);
        System.out.println("Test Case 1 Output: " + commonInt);

        List<String> listStrA = Arrays.asList("DN01", "DN02", "DN03");
        List<String> listStrB = Arrays.asList("DN02", "DN04");

        List<String> commonStr = findCommonPatients(listStrA, listStrB);
        System.out.println("Test Case 2 Output: " + commonStr);
    }
}