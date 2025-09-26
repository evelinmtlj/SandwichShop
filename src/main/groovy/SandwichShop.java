import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your sandwich 1 or 2:"); // ask user sandwich size
        int size = scanner.nextInt();
        double price1 = 5.45;
        double price2 = 8.95;
        double totalPrice = 0;
        if (size == 1) {
            totalPrice = price1;
        } else if (size == 2) {
            totalPrice = price2;
        } else {
            System.out.println("Invalid sandwich size");
        }


        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        if (age <= 17) {
            totalPrice = totalPrice - (totalPrice * .10);
        } else if (age >= 65) {
            totalPrice = totalPrice - (totalPrice * .20);
        }


        System.out.printf("The cost of your sandwich is $%.2f%n", totalPrice);
    }


}