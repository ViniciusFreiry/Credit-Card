public class Buy implements Comparable<Buy> {
    private String description;
    private double price;

    public Buy(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Description: " + description + "\nPrice: " + price;
    }

    @Override
    public int compareTo(Buy otherBuy) {
        return Double.valueOf(this.getPrice()).compareTo(Double.valueOf(otherBuy.getPrice()));
    }
}