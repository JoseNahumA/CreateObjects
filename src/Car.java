public class Car { // Attributes
    public String brand;
    public String model;
    public int yearManufactured;
    public String color;
    public double price;

    // Constructor method
    public void car (String brand, String model, int yearManufactured, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.yearManufactured = yearManufactured;
        this.color = color;
        this.price = price;
    }

    // Méthods
    public void showInformation() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year of Manufacture: " + this.yearManufactured);
        System.out.println("Color: " + this.color);
        System.out.println("Price: $" + this.price);
    }

    public void turnOn() {
        System.out.println("Vehicle is turn on.");
    }

    public void turnOff() {
        System.out.println("Vehicle is turn off.");
    }
}