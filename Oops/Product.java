package Oops;
import java.util.Scanner;
public class Product {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
       return quantity;
    }
}
