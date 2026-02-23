abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}

interface BonusCalculator {
    double getBonus();
}

class OfficeStaff extends Employee {
    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee implements BonusCalculator {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }
}

public class PTIT_CNTT1_JAVA_Session10_BT05 {
    public static void main(String[] args) {
        Employee staff = new OfficeStaff("Nguyen Van A", 8000);
        Employee manager = new Manager("Tran Van B", 15000, 5000);

        System.out.println("Bang luong:");
        System.out.println("Nhan vien: " + staff.name + " - Luong: " + staff.calculateSalary());
        System.out.println("Quan ly: " + manager.name + " - Luong: " + manager.calculateSalary());
    }
}