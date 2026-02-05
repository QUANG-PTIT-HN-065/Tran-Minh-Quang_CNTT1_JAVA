class Animal {
    public void sound() {
        System.out.println("Dong vat phat ra am thanh");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Cho keu: Gau Gau");
    }

    public void wagTail() {
        System.out.println("Cho dang vay duoi");
    }
}

public class PTIT_CNTT1_JAVA_Session09_BT04 {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.sound();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.wagTail();
        }
    }
}
