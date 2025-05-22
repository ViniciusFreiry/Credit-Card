public class Buy {
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
}