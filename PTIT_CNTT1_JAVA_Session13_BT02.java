import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PTIT_CNTT1_JAVA_Session13_BT02 {

    public static List<String> removduplicates(List<String> input) {

        List<String> uniqueList = new ArrayList<>();

        for (String medicine : input) {
            if (!uniqueList.contains(medicine)) {
                uniqueList.add(medicine);
            }
        }

        Collections.sort(uniqueList);

        return uniqueList;
    }

    public static void main(String[] args) {

        List<String> medicines = new ArrayList<>();

        medicines.add("Paracetamol");
        medicines.add("Ibuprofen");
        medicines.add("Panadol");
        medicines.add("Paracetamol");
        medicines.add("Aspirin");
        medicines.add("Ibuprofen");

        System.out.println("Input: " + medicines);

        List<String> result = removduplicates(medicines);

        System.out.println("Output: " + result);
    }
}