import java.util.ArrayList;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}

class OfficeEmployee extends Employee {
    private double baseSalary;

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class ProductionEmployee extends Employee {
    private int numOfProducts;
    private double price;

    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }
}

public class PTIT_CNTT1_JAVA_Session09_BT05 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyen Van A", 10000000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30000));

        double totalSalary = 0;

        System.out.println("Danh sach luong nhan vien:");

        int i = 1;
        for (Employee e : employees) {
            double salary = e.calculateSalary();
            System.out.printf("%d. %s - Luong: %,.0f\n", i++, e.getName(), salary);
            totalSalary += salary;
        }

        System.out.printf("\n=> TONG LUONG CONG TY: %,.0f\n", totalSalary);
    }
}
