package working_wit_abstraction.lab.hotel_reservation;

public class PriceCalculator {

    public double calculateTotalCost(double basePrice, int daysTotal, String season, String discount) {
        double costPerDay = basePrice;
        switch (season) {
            case "Autumn":
                costPerDay *= Season.AUTUMN.multiplier;
                break;
            case "Spring":
                costPerDay *= Season.SPRING.multiplier;
                break;
            case "Winter":
                costPerDay *= Season.WINTER.multiplier;
                break;
            case "Summer":
                costPerDay *= Season.SUMMER.multiplier;
                break;
        }

        switch (discount) {
            case "VIP":
                costPerDay -= (costPerDay * DiscountType.VIP.discountSize) / 100;
                break;
            case "SecondVisit":
                costPerDay -= (costPerDay * DiscountType.SECOND_VISIT.discountSize) / 100;
                break;
            case "None":
                costPerDay -= (costPerDay * DiscountType.NONE.discountSize) / 100;
                break;
        }

        return costPerDay * daysTotal;
    }

    private enum DiscountType {
        VIP(20),
        SECOND_VISIT(10),
        NONE(0);

        private double discountSize;

        DiscountType(double discountSize) {
            this.discountSize = discountSize;
        }

    }

    private enum Season {
        AUTUMN(1),
        SPRING(2),
        WINTER(3),
        SUMMER(4);

        private int multiplier;

        Season(int multiplier) {
            this.multiplier = multiplier;
        }

    }

}
