public class Laptop {
    String owner, brand;
    Laptop(String owner, String brand) {
        this.owner = owner;
        this.brand = brand;

        System.out.println("Object Laptop " + this.brand + " milik " + this.owner +  "sudah dibuat");
    }
};