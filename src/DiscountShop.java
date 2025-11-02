import java.util.Scanner;

public class DiscountShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your coins: ");
        int coins = scanner.nextInt();
        
        System.out.print("Enter item price: ");
        int price = scanner.nextInt();
        
        if (coins < price) {
            System.out.println("Not enough");
        } else if (coins == price) {
            System.out.println("Enough for exact purchase");
        } else {
            if (coins >= price * 2) {
                double discountPrice = price * 0.8;
                System.out.printf("Discount applied! New price: %.1f%n", discountPrice);
            } else {
                System.out.println("Enough for purchase");
            }
        }
        
        scanner.close();
    }
}