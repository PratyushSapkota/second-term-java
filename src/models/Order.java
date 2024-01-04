package models;

import java.util.Arrays;

public class Order {
    String buyerName;
    long phoneNumber;
    int[] itemCode;
    double[] prices;

    //constructor
    public Order(String buyerName, long phoneNumber, int[] itemCode, double[] prices) {
        this.buyerName = buyerName;
        this.phoneNumber = phoneNumber;
        this.itemCode = itemCode;
        this.prices = prices;
    }

    //getter and setter
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getItemCode() {
        return itemCode;
    }

    public void setItemCode(int[] itemCode) {
        this.itemCode = itemCode;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }


    // creating a method that prints out in desired format
    public void generateBill(){
        System.out.println("---------Order Details---------");
        System.out.println("Name: " + buyerName);
        System.out.println("Phone Number: " + phoneNumber);

        // calculating vat for each price
        for(int i=0; i < prices.length; i++){
            double price = prices[i];
            prices[i] = price + (((double) 13 /100) * price);
        }

        System.out.println("Products: " + Arrays.toString(itemCode));
        System.out.println("Prices: " + Arrays.toString(prices));
    }
}
