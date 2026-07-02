public class Product {

    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayProduct() {
        System.out.printf("%-3d %-20s ₹%-8.2f Stock: %d\n",
                id, name, price, stock);
    }

    // Grocery Products
    public static Product[] getProducts() {

        Product[] products = {

            new Product(1, "Rice 5kg", 320, 20),
            new Product(2, "Wheat Flour 5kg", 260, 20),
            new Product(3, "Sugar 1kg", 48, 30),
            new Product(4, "Salt 1kg", 25, 30),
            new Product(5, "Cooking Oil 1L", 175, 20),
            new Product(6, "Milk 1L", 60, 40),
            new Product(7, "Bread", 45, 25),
            new Product(8, "Eggs (12)", 90, 20),
            new Product(9, "Butter", 58, 15),
            new Product(10, "Cheese", 120, 15),
            new Product(11, "Apple 1kg", 180, 20),
            new Product(12, "Banana", 60, 25),
            new Product(13, "Tomato 1kg", 45, 30),
            new Product(14, "Onion 1kg", 40, 30),
            new Product(15, "Potato 1kg", 35, 35),
            new Product(16, "Carrot 1kg", 55, 20),
            new Product(17, "Soap", 35, 25),
            new Product(18, "Shampoo", 180, 15),
            new Product(19, "Toothpaste", 95, 20),
            new Product(20, "Biscuits", 30, 40),
            new Product(21, "Tea Powder", 140, 15),
            new Product(22, "Coffee", 220, 10),
            new Product(23, "Soft Drink", 40, 30),
            new Product(24, "Orange Juice", 110, 15),
            new Product(25, "Chocolate", 50, 25)

        };

        return products;
    }
}