import java.util.Scanner;

public class PTIT_CNTT1_JAVA_Session03_BT05 {

    public static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Khong tim thay sach ma " + bookId);
            return n;
        }

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Da xoa sach ma " + bookId);
        return n - 1; 
    }

    public static void displayBooks(int[] arr, int n) {
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;

        while (n > 0) {
            System.out.println("Kho sach hien tai (" + n + " cuon):");
            displayBooks(books, n);

            System.out.print("Nhap ma sach can xoa (0 de thoat): ");
            int bookId = sc.nextInt();

            if (bookId == 0) {
                break;
            }

            n = deleteBook(books, n, bookId);
        }

        sc.close();
    }
}
