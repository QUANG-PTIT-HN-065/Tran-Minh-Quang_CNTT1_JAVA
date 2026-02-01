public class PTIT_CNTT1_JAVA_Session06_BT02 {

    String username;
    String password;
    String email;

    public PTIT_CNTT1_JAVA_Session06_BT02(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Doi mat khau thanh cong!");
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        PTIT_CNTT1_JAVA_Session06_BT02 acc = new PTIT_CNTT1_JAVA_Session06_BT02("quangtran", "123456", "quang@gmail.com");
        acc.displayInfo();
        acc.changePassword("newpass2026");
        acc.displayInfo();
    }
}
