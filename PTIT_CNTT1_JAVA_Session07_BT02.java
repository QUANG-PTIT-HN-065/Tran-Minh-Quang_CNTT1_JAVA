class Student {
    String name;
}

public class PTIT_CNTT1_JAVA_Session07_BT02 {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Student s1 = new Student();
        s1.name = "An";

        Student s2 = s1;
        s2.name = "Binh";

        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
