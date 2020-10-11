
// Judge ready

package working_wit_abstraction.lab.hotel_reservation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PriceCalculator priceCalculator = new PriceCalculator();
        String[] tokens = s.nextLine().split("\\s+");
        double basePrice = Double.parseDouble(tokens[0]);
        int daysTotal = Integer.parseInt(tokens[1]);
        String season = tokens[2];
        String discount = tokens[3];
        double totalPrice = priceCalculator.calculateTotalCost(basePrice, daysTotal, season, discount);
        System.out.printf("%.2f%n", totalPrice);
        
    }
}
