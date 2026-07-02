import java.util.Scanner;

public class Order {

    private Scanner sc = new Scanner(System.in);

    public void checkout(User user, Cart cart) {

        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty!");
            return;
        }

        System.out.println("\n========== ORDER SUMMARY ==========");
        System.out.println("Customer : " + user.getName());
        System.out.println("Address  : " + user.getAddress());

        double total = cart.getTotal();

        System.out.println("Total Bill : ₹" + total);

        System.out.println("\nSelect Payment Method");
        System.out.println("1. Cash on Delivery");
        System.out.println("2. UPI");
        System.out.println("3. Debit/Credit Card");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.println("Payment Mode : Cash on Delivery");
                break;

            case 2:
                System.out.print("Enter UPI ID: ");
                String upi = sc.nextLine();
                System.out.println("Payment Successful.");
                break;

            case 3:
                System.out.print("Enter Card Number: ");
                String card = sc.nextLine();

                System.out.print("Enter CVV: ");
                String cvv = sc.nextLine();

                System.out.println("Payment Successful.");
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("\nOrder Placed Successfully!");
        System.out.println("Thank you for shopping with Fetch2Cart.");

        deliverOrder();

        cart.clearCart();
    }

    // Delivery Status
    private void deliverOrder() {

        System.out.println("\nDelivery Status");
        System.out.println("----------------------");
        System.out.println("Preparing your order...");
        System.out.println("Packing your order...");
        System.out.println("Out for Delivery...");
        System.out.println("Delivered Successfully!");
    }
}
