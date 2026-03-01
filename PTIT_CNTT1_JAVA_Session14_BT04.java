import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PTIT_CNTT1_JAVA_Session14_BT04 {
    public static void main(String[] args) {

        List<String> danhSach = new ArrayList<>();
        danhSach.add("Cúm A");
        danhSach.add("Sốt xuất huyết");
        danhSach.add("Cúm A");
        danhSach.add("Covid-19");
        danhSach.add("Cúm A");
        danhSach.add("Sốt xuất huyết");

        TreeMap<String, Integer> thongKe = new TreeMap<>();

        for (String benh : danhSach) {
            if (thongKe.containsKey(benh)) {
                thongKe.put(benh, thongKe.get(benh) + 1);
            } else {
                thongKe.put(benh, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}