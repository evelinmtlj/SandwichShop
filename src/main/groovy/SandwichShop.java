import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your sandwich 1 or 2:"); // ask user sandwich size
        int size = scanner.nextInt();
        double price1 = 5.45;
        double price2  = 8.95;
        double totalPrice= 0;
        if (size == 1) {
            System.out.println("Your price is 5.45");
        } else if (size == 2) {
            System.out.println("Your price is 8.95");
        }else {
            System.out.println("Invalid sandwich size");

System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age<=17) {


        } else if (age <= 65) {

        }
        System.out.print("The cost of you sandwich is $%.2f%n", price);
    }
}














