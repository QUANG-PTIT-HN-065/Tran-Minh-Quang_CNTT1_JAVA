import java.util.*;

class Medicine {
    private String drugId;
    private String drugName;
    private double unitPrice;
    private int quantity;

    public Medicine(String drugId, String drugName, double unitPrice, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getDrugId() {
        return drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-12.0f %-10d %-15.0f",
                drugId, drugName, unitPrice, quantity, getTotalPrice());
    }
}

public class PTIT_CNTT1_JAVA_Session13_BT06 {

    private static List<Medicine> medicineList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    adjustQuantity();
                    break;
                case 3:
                    deleteMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n========== MENU KE DON THUOC ==========");
        System.out.println("1. Them thuoc vao don");
        System.out.println("2. Dieu chinh so luong");
        System.out.println("3. Xoa thuoc");
        System.out.println("4. In hoa don");
        System.out.println("5. Tim thuoc gia re (< 50000)");
        System.out.println("6. Thoat");
        System.out.print("Chon chuc nang: ");
    }

    private static void addMedicine() {
        System.out.print("Nhap ma thuoc: ");
        String id = scanner.nextLine();

        for (Medicine m : medicineList) {
            if (m.getDrugId().equals(id)) {
                System.out.print("Nhap so luong muon them: ");
                int addQty = Integer.parseInt(scanner.nextLine());
                m.setQuantity(m.getQuantity() + addQty);
                System.out.println("Da cong them so luong.");
                return;
            }
        }

        System.out.print("Nhap ten thuoc: ");
        String name = scanner.nextLine();

        System.out.print("Nhap don gia: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap so luong: ");
        int qty = Integer.parseInt(scanner.nextLine());

        medicineList.add(new Medicine(id, name, price, qty));
        System.out.println("Da them thuoc moi.");
    }

    private static void adjustQuantity() {
        System.out.print("Nhap ma thuoc can dieu chinh: ");
        String id = scanner.nextLine();

        Iterator<Medicine> iterator = medicineList.iterator();
        while (iterator.hasNext()) {
            Medicine m = iterator.next();
            if (m.getDrugId().equals(id)) {
                System.out.print("Nhap so luong moi: ");
                int newQty = Integer.parseInt(scanner.nextLine());

                if (newQty == 0) {
                    iterator.remove();
                    System.out.println("Thuoc da duoc xoa do so luong = 0.");
                } else {
                    m.setQuantity(newQty);
                    System.out.println("Da cap nhat so luong.");
                }
                return;
            }
        }

        System.out.println("Khong tim thay thuoc.");
    }

    private static void deleteMedicine() {
        System.out.print("Nhap ma thuoc can xoa: ");
        String id = scanner.nextLine();

        boolean removed = medicineList.removeIf(m -> m.getDrugId().equals(id));

        if (removed) {
            System.out.println("Da xoa thuoc.");
        } else {
            System.out.println("Khong tim thay thuoc.");
        }
    }

    private static void printInvoice() {
        if (medicineList.isEmpty()) {
            System.out.println("Don thuoc rong.");
            return;
        }

        System.out.println("\n============== HOA DON ==============");
        System.out.printf("%-10s %-20s %-12s %-10s %-15s\n",
                "Ma", "Ten thuoc", "Don gia", "So luong", "Thanh tien");

        double total = 0;

        for (Medicine m : medicineList) {
            System.out.println(m);
            total += m.getTotalPrice();
        }

        System.out.println("---------------------------------------------");
        System.out.printf("Tong tien: %.0f VND\n", total);

        medicineList.clear();
        System.out.println("Don thuoc da duoc xoa sau khi in.");
    }

    private static void findCheapMedicine() {
        boolean found = false;

        for (Medicine m : medicineList) {
            if (m.getUnitPrice() < 50000) {
                if (!found) {
                    System.out.println("Danh sach thuoc gia re:");
                    found = true;
                }
                System.out.println(m.getDrugName() + " - " + m.getUnitPrice());
            }
        }

        if (!found) {
            System.out.println("Khong co thuoc nao gia duoi 50000.");
        }
    }
}