import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your sandwich 1 or 2:"); // ask user sandwich size
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Would you like your sandwich loaded yes or no? ");
        String response = scanner.nextLine().trim().toLowerCase();
        boolean answer = response.equals("yes");
        double price1 = 5.45;
        double price2 = 8.95;
        double regularLoaded = 1.0;
        double LargeLoaded = 1.75;
        double totalPrice = 0;
        if (size == 1) {
            totalPrice = price1;
            if  (answer) {
                totalPrice += regularLoaded;
            }
        } else if (size == 2) {
            totalPrice = price2;
            if (answer){
                totalPrice += price2;
            }
        } else {
         System.out.println("Error sandwich size not found");
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