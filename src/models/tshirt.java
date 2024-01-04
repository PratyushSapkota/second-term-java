package models;

import java.util.Arrays;

public class tshirt {
    String name;
    double price;
    int product_code;
    String brand;
    String description;
    String[] sizes;

    //constructor
    public tshirt(String name, double price, int product_code, String brand, String description, String[] sizes) {
        this.name = name;
        this.price = price;
        this.product_code = product_code;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }


    //getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    // creating a method that prints out in desired format
    public void describeProduct(){
        System.out.println("-------Product Detail-------");
        System.out.println("Item name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Product Code: " + product_code);
        System.out.println("Sizes: " + Arrays.toString(sizes));

    }
}
