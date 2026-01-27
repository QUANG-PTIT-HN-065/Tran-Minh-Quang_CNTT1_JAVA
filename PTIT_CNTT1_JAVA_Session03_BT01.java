import java.util.Scanner;

public class PTIT_CNTT1_JAVA_Session03_BT01 {

    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];

        System.out.println("Nhap ma so cho " + n + " cuon sach:");

        for (int i = 0; i < n; i++) {
            System.out.print("Sach thu " + (i + 1) + ": ");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("Ma so khong hop le. Vui long nhap lai.");
                i--; 
                sc.next();
            }
        }
        return arr;
    }

    public static void displayLibraries(int[] arr) {
        System.out.print("Danh sach ma sach: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach can quan ly: ");
        int n = sc.nextInt();

        int[] books = addBookToLibraries(n);

        System.out.println("KET QUA");
        displayLibraries(books);
    }
}
