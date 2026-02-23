import java.util.*;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

public class PTIT_CNTT1_JAVA_Session10_BT06 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 600));
        products.add(new Product("Mouse", 50));

        List<Product> sortByPrice = new ArrayList<>(products);
        Collections.sort(sortByPrice, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("Sap xep theo gia tang dan (Anonymous Class):");
        for (Product p : sortByPrice) {
            System.out.println(p);
        }

        List<Product> sortByName = new ArrayList<>(products);
        sortByName.sort((p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("\nSap xep theo ten A-Z (Lambda):");
        for (Product p : sortByName) {
            System.out.println(p);
        }

    }
}