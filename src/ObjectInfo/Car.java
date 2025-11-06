package ObjectInfo;

public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void delivery(int amount) {
        this.quantity += amount;
    }


    public void sell(int amount) {
        if (amount <= quantity) {
            this.quantity -= amount;
        } else {
            System.out.println("Not enough cars in stock to sell " + amount);
        }

    }

    @Override
    public String toString() {
        return "Car Details:" + "\nModel: " + model + "\nBrand: " + brand + "\nYear: " + year + "\nPrice: $" + price + "\nColor: " + color + "\nQuantity: " + quantity;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Model S", "Tesla", 2025, 79999.99, "Red", 10);

        System.out.println(car1.toString());

        car1.sell(3);
        System.out.println("\nAfter selling 3 cars:");
        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Quantity: " + car1.getQuantity());
        car1.setColor("Black");
        car1.setPrice(74999.99);
        car1.delivery(5);
        System.out.println("\nAfter updates:");
        System.out.println(car1.toString());
    }








}
