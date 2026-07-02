import java.util.*;

public class Cart {

    private Product[] cart = new Product[50];
    private int[] quantity = new int[50];
    private int count = 0;

    // Add product to cart
    public void addToCart(Product product, int qty) {

        if (qty <= 0) {
            System.out.println("Invalid quantity!");
            return;
        }

        if (qty > product.getStock()) {
            System.out.println("Stock not available!");
            return;
        }

        cart[count] = product;
        quantity[count] = qty;
        count++;

        product.setStock(product.getStock() - qty);

        System.out.println(product.getName() + " added to cart.");
    }

    // View cart
    public void viewCart() {

        if (count == 0) {
            System.out.println("\nYour cart is empty.");
            return;
        }

        System.out.println("\n========== YOUR CART ==========");
        double total = 0;

        for (int i = 0; i < count; i++) {

            double amount = cart[i].getPrice() * quantity[i];

            System.out.println(
                    (i + 1) + ". "
                    + cart[i].getName()
                    + "  Qty: " + quantity[i]
                    + "  Price: ₹" + cart[i].getPrice()
                    + "  Total: ₹" + amount);

            total += amount;
        }

        System.out.println("--------------------------------");
        System.out.println("Grand Total : ₹" + total);
    }

    // Remove item
    public void removeItem(int index) {

        if (index < 1 || index > count) {
            System.out.println("Invalid choice.");
            return;
        }

        cart[index - 1].setStock(
                cart[index - 1].getStock() + quantity[index - 1]);

        for (int i = index - 1; i < count - 1; i++) {
            cart[i] = cart[i + 1];
            quantity[i] = quantity[i + 1];
        }

        count--;

        System.out.println("Item removed successfully.");
    }

    // Calculate total bill
    public double getTotal() {

        double total = 0;

        for (int i = 0; i < count; i++) {
            total += cart[i].getPrice() * quantity[i];
        }

        return total;
    }

    // Check cart empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Clear cart after order
    public void clearCart() {
        count = 0;
    }
}