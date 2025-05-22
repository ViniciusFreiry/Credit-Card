import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the credit card limit:");
        double limit = input.nextDouble();
        CreditCard card = new CreditCard(limit);

        int close = 1;
        while(close != 0) {
            System.out.println("Enter the purchase description:");
            String description = input.next();

            System.out.println("Enter the purchase price:");
            double price = input.nextDouble();

            if (card.doBuy(new Buy(description, price))) {
                System.out.println("Purchase completed!");
                System.out.println("Enter 0 to exit or 1 to continue");
                close = input.nextInt();
            } else {
                System.out.println("Insufficient balance!");
                close = 0;
            }
        }

        System.out.println("\n***********************");
        System.out.println("PURCHASE HISTORY:\n");
        Collections.sort(card.getBuys());

        for (Buy c : card.getBuys()) {
            System.out.println(c.getDescription() + " - " +c.getPrice());
        }
        System.out.println("***********************");

        System.out.println("\nCard balance: " + card.getBalance());
    }
}