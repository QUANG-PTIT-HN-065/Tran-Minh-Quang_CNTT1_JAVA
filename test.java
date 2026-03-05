import java.util.*;

/* ================= INTERFACE ================= */
interface IRepository<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}

/* ================= ABSTRACT CLASS ================= */
abstract class Product {

    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateFinalPrice();

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

/* ================= ELECTRONIC PRODUCT ================= */
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
        System.out.println("Warranty: " + warrantyMonths + " months");
        System.out.println("Final Price: " + calculateFinalPrice());
        System.out.println("-----------------------");
    }
}

/* ================= FOOD PRODUCT ================= */
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
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Final Price: " + calculateFinalPrice());
        System.out.println("-----------------------");
    }
}

/* ================= REPOSITORY ================= */
class ProductRepository implements IRepository<Product> {

    private List<Product> list = new ArrayList<>();
    private Map<String, Product> map = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (map.containsKey(item.getId())) {
            return false;
        }

        list.add(item);
        map.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {

        Product p = map.remove(id);

        if (p != null) {
            list.remove(p);
            return true;
        }

        return false;
    }

    @Override
    public Product findById(String id) {
        return map.get(id);
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    public void sortByPrice() {

        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.calculateFinalPrice(), o2.calculateFinalPrice());
            }
        });

    }
}

/* ================= MAIN ================= */
public class Main {

    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("E01", "Laptop", 20000000, 24));
        repo.add(new ElectronicProduct("E02", "Phone", 10000000, 6));
        repo.add(new FoodProduct("F01", "Milk", 30000, 10));
        repo.add(new FoodProduct("F02", "Bread", 20000, 5));

        System.out.println("===== PRODUCT LIST =====");

        for (Product p : repo.findAll()) {
            p.displayInfo();
        }

        System.out.println("===== FIND PRODUCT =====");

        Product p = repo.findById("E01");

        if (p != null) {
            p.displayInfo();
        }

        System.out.println("===== SORT BY FINAL PRICE =====");

        repo.sortByPrice();

        for (Product pr : repo.findAll()) {
            pr.displayInfo();
        }

        System.out.println("===== REMOVE PRODUCT =====");

        repo.removeById("F02");

        for (Product pr : repo.findAll()) {
            pr.displayInfo();
        }
    }
}
