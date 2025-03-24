package Oops;
import java.util.Scanner;
public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept product information
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Product ID, Price, and Quantity for Product " + (i + 1) + ":");
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find product with highest price
        int highestPricePid = products[0].getProductId();
        double highestPrice = products[0].getPrice();
        for (Product product : products) {
            if (product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                highestPricePid = product.getProductId();
            }
        }
        System.out.println("Product with highest price has PID: " + highestPricePid);

        // Calculate total amount spent
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }

    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }
}
