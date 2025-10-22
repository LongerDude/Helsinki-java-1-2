
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Test your app here
        ShoppingCart cart = new ShoppingCart();
        cart.add("bread", 1);
        cart.add("bread2", 15);
        cart.add("bread3", 21);
        cart.print();
        System.out.println(cart.price());
    }
}
