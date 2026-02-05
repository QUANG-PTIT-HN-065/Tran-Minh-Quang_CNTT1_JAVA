class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void display() {
        System.out.println("Ten: " + name);
        System.out.println("Luong co ban: " + baseSalary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phong ban: " + department);
    }
}

public class PTIT_CNTT1_JAVA_Session09_BT03 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nguyen Van A", 15000000, "IT");
        manager.display();
    }
}
