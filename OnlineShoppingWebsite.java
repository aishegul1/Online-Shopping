import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShoppingWebsite {
    static Scanner input = new Scanner(System.in);
    static List<String> listOfProduct = new ArrayList<>();
    static List<Double> productprices = new ArrayList<>();
    static double amountofpayment;

    public static void main(String[] args) {
        listOfProduct.add("Clock Product Code 0");
        listOfProduct.add("Monitor Product Code 1");
        listOfProduct.add("Bag Product Code 2");
        listOfProduct.add("TV Product Code 3");
        listOfProduct.add("Book Product Code 4");


        productprices.add(150.0);
        productprices.add(3000.0);
        productprices.add(5000.0);
        productprices.add(6000.0);
        productprices.add(100.0);

        List<String> newProducts = new ArrayList<>();
        newProducts.add("Jewelry Product Code 5");
        newProducts.add("Pot Product Code 6");
        newProducts.add("Clothes Product Code 7");
        listOfProduct.addAll(newProducts);

        List<Double> newProductPrices = new ArrayList<>();
        newProductPrices.add(9000.0);
        newProductPrices.add(200.0);
        newProductPrices.add(400.0);
        productprices.addAll(newProductPrices);
        customerChoice();
    }//main
    public static void customerChoice() {
        showListOfProducts();// urunListesiniGoster
        System.out.println("Please enter the product code");
        int productCode = input.nextInt();
        if (productCode >= 0 && productCode < listOfProduct.size()) {
            System.out.println("Enter how many you want");
            int piece = input.nextInt();
            double TotalItemPrice = productprices.get(productCode) * piece;
            amountofpayment += TotalItemPrice;
            continueOrNo();
        } else {
            System.out.println("Please enter a valid product code.");
            customerChoice();//Recursive Method
        }

    }//musteriSecim()

    private static void continueOrNo() {
        System.out.println("Would you like to continue the shopping?" +
                "\nFor Yes ==>1\nFor No ==> 2");
        int continueOrNo = input.nextInt();

        if (continueOrNo == 1) {
            customerChoice();
        } else if (continueOrNo == 2) {
            pay();
        } else {
            System.out.println("please enter a valid option");
            continueOrNo();//recursive method
        }

    }

    private static void pay() {
        LocalDate establishmentDay = LocalDate.of(2023, 04, 16);
        LocalDate date = LocalDate.now();
        if (date.isEqual(establishmentDay)) {
            slowPrint("Welcome to Berry's Online Shopping WebSite! " +
                    "\nIn honor of the first year of our online shopping website\nEverything from us! Have a great day!", 60);
        } else {
            slowPrint("Thank you for choosing Berry's Online Shopping WebSite...  ", 60);
            System.out.println(amountofpayment + " £");
        }
    }

    private static void slowPrint(String text, int delay) {
        for (char ch : text.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void showListOfProducts() {
        System.out.println("************************ List Of Products ***********************");
        for (int i = 0; i < listOfProduct.size(); i++) {
            System.out.println(i + " - " + listOfProduct.get(i) + " Price " + productprices.get(i) + " £");
        }
    }
}
