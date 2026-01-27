import java.util.Scanner;

public class PTIT_CNTT1_JAVA_Session03_BT02 {

    public static int searchbooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
            "Doraemon",
            "Sherlock Holmes",
            "Harry Potter",
            "Clean Code",
            "Java Basics"
        };

        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();

        int index = searchbooks(books, search);

        if (index != -1) {
            System.out.println("Tim thay sach '" + search + "' tai vi tri so: " + index);
        } else {
            System.out.println("Sach khong ton tai trong thu vien.");
        }

        sc.close();
    }
}
