public class PTIT_CNTT1_JAVA_Session06_BT06 {

    private int id;
    private String username;
    private String password;
    private String email;

    public PTIT_CNTT1_JAVA_Session06_BT06(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            System.out.println("Mat khau khong duoc rong");
        } else {
            this.password = password;
        }
    }

    public void setEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email != null && email.matches(emailRegex)) {
            this.email = email;
        } else {
            System.out.println("Email khong hop le");
        }
    }

    public String getEmail() {
        return email;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        PTIT_CNTT1_JAVA_Session06_BT06 u1 = new PTIT_CNTT1_JAVA_Session06_BT06(1, "admin", "123456", "admin@gmail.com");
        u1.displayInfo();
        PTIT_CNTT1_JAVA_Session06_BT06 u2 = new PTIT_CNTT1_JAVA_Session06_BT06(2, "user1", "abc123", "user1gmail.com");
        u2.displayInfo();
        PTIT_CNTT1_JAVA_Session06_BT06 u3 = new PTIT_CNTT1_JAVA_Session06_BT06(3, "user2", "", "user2@gmail.com");
        u3.displayInfo();
        u1.setPassword("");
        u1.setEmail("abc@xyz.com");
    }
}
