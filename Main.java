import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User();
        Cart cart = new Cart();
        Order order = new Order();

        Product[] products = Product.getProducts();

        boolean loggedIn = false;

             while (true) {

            System.out.println("\n========== FETCH2CART ==========");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Products");
            System.out.println("4. Add to Cart");
            System.out.println("5. View Cart");
            System.out.println("6. Remove Item");
            System.out.println("7. Checkout");
            System.out.println("8. Logout");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    user.register();
                    break;

                case 2:
                    sc.nextLine();
                    loggedIn = user.login();
                    break;

                case 3:

                    System.out.println("\n========== PRODUCTS ==========");

                    for (Product p : products) {
                        p.displayProduct();
                    }

                    break;

                case 4:

                    if (!loggedIn) {
                        System.out.println("Please login first.");
                        break;
                    }

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    boolean found = false;

                    for (Product p : products) {

                        if (p.getId() == id) {

                            cart.addToCart(p, qty);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }

                    break;

                case 5:

                    cart.viewCart();
                    break;

                case 6:

                    cart.viewCart();

                    System.out.print("Enter Item Number to Remove: ");
                    int remove = sc.nextInt();

                    cart.removeItem(remove);

                    break;

                case 7:

                    if (!loggedIn) {
                        System.out.println("Please login first.");
                        break;
                    }

                    order.checkout(user, cart);

                    break;

                case 8:

                    loggedIn = false;
                    System.out.println("Logged out successfully.");
                    break;

                case 9:

                    System.out.println("Thank you for using Fetch2Cart.");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}
