import java.util.Scanner;
import models.tshirt;
import models.Order;

public class Main {
    public static void main(String[] args) {

            //creating tshirt object
            String[] product1Sizes = {"XL", "Medium", "Large"};
            tshirt product1 = new tshirt("Gorkhali Batman", 1235, 571, "Karuna", "Graphic text: You either die a hero or live long enough to see yourself be a villain.", product1Sizes);
            product1.describeProduct();

            String[] product2Sizes = {"XL", "Small", "Large"};
            tshirt product2 = new tshirt("Nepali Superman", 1235, 572,"Karuna" , "It Was Krypton That Made Me Superman, But It's Nepal That Makes Me Human.", product2Sizes );
            product2.describeProduct();

            String[] product3Sizes = {"XL", "Medium", "XXL"};
            tshirt product3 = new tshirt("Kathmandu's Thanos", 1235, 573, "Karuna", "I Am Inevitable.", product3Sizes);
            product3.describeProduct();

            System.out.println("_______________________________________");

            //creating orders

            int[] order1Codes = { product1.getProduct_code(), product2.getProduct_code() };
            double[] order1Prices = { product1.getPrice(), product2.getPrice() };
            Order order1 = new Order("Gopal Sharma", 1232112312, order1Codes, order1Prices);
            order1.generateBill();

            int[] order2Codes = { product2.getProduct_code(), product3.getProduct_code() };
            double[] order2Prices = { product2.getPrice(), product3.getPrice() };
            Order order2 = new Order("Gopal Shrestha", 1232112312, order2Codes, order2Prices);
            order2.generateBill();

    }
}