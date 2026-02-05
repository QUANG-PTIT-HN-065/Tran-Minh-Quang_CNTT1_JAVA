class Animal {
    public void sound() {
        System.out.println("Dong vat phat ra am thanh");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Cho sua: Gau gau");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meo keu: Meo meo");
    }
}

public class PTIT_CNTT1_JAVA_Session09_BT02 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}
