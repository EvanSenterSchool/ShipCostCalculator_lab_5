import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double productPrice;
        double  shippingPrice = 0.02;
        double productShipping;
        double productTotal;
        int freeShipping =100;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your product price?");

        if (scan.hasNextDouble()) {
            productPrice = scan.nextDouble();


            if (productPrice >= freeShipping)
                System.out.println("Shipping is free");
            else {
                productShipping = productPrice * shippingPrice;
                productTotal = productPrice + productShipping;
                System.out.println("The price of your product with shipping is " + productTotal + " and your shipping cost is " + productShipping);
            }
        }

        else
            System.out.println("Sorry you have entered the wrong data type");

    }
}