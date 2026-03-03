import java.util.List;

interface IRepository<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}

abstract class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateFinalPrice();

    public void displayInfo() {
        System.out.println("Mã: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Giá gốc: " + price);
    }

    public String getId() {
        return id;
    }
}

class ElectronicProduct extends Product {

    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        if (warrantyMonths > 12) {
            return price + 1000000;
        }
        return price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Số tháng bảo hành: " + warrantyMonths);
        System.out.println("Giá thực tế: " + calculateFinalPrice());
        System.out.println("-------------------------");
    }
}

class FoodProduct extends Product {

    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateFinalPrice() {
        return price - (price * discountPercent / 100.0);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phần trăm giảm giá: " + discountPercent + "%");
        System.out.println("Giá sau giảm: " + calculateFinalPrice());
        System.out.println("-------------------------");
    }
}



public class ThucHanh_Session16 {
    public static void main(String[] args) {

    }
}