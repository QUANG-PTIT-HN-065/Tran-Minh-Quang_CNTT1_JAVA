public class PTIT_CNTT1_JAVA_Session06_BT03 {

    private String productId;
    private String productName;
    private double price;
    
    public PTIT_CNTT1_JAVA_Session06_BT03(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price); 
    }
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // setter có kiểm tra dữ liệu
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Loi: Gia san pham phai lon hon 0!");
        }
    }

    public void displayInfo() {
        System.out.println("Ma SP: " + productId);
        System.out.println("Ten SP: " + productName);
        System.out.println("Gia ban: " + price);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        PTIT_CNTT1_JAVA_Session06_BT03 p = new PTIT_CNTT1_JAVA_Session06_BT03("SP01", "Laptop", 15000000);
        p.displayInfo();
        p.setPrice(-5000);
        p.displayInfo();
    }
}
