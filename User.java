import java.util.Scanner;

public class User {

    private String name;
    private String mobile;
    private String password;
    private String address;

    Scanner sc = new Scanner(System.in);

    // Register
    public void register() {

        System.out.println("\n========== USER REGISTRATION ==========");

        System.out.print("Enter Name : ");
        name = sc.nextLine();

        System.out.print("Enter Mobile Number : ");
        mobile = sc.nextLine();

        System.out.print("Enter Address : ");
        address = sc.nextLine();

        System.out.print("Create Password : ");
        password = sc.nextLine();

        System.out.println("\nRegistration Successful!");
    }

    // Login
    public boolean login() {

        System.out.println("\n========== LOGIN ==========");

        System.out.print("Enter Mobile Number : ");
        String m = sc.nextLine();

        System.out.print("Enter Password : ");
        String p = sc.nextLine();

        if (m.equals(mobile) && p.equals(password)) {
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome, " + name + "!");
            return true;
        } else {
            System.out.println("\nInvalid Mobile Number or Password.");
            return false;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }
}
