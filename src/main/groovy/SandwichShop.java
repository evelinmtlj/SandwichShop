import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your sandwich 1 or 2:"); // ask user sandwich size
        int size = scanner.nextInt();
        if (size != 1 && size != 2) { // this check if size isn't equal to 1 or 2 it will output invalid size
            System.out.println("INVALID SANDWICH SIZE");
            return; /*this stops if the user enters
            other answer that isn't 1 or 2
            */
        }
        scanner.nextLine(); // use this so the user can type their answer for the next question
        System.out.println("Would you like your sandwich loaded yes or no? ");
        String response = scanner.nextLine().trim().toLowerCase();
        boolean answer = response.equals("yes");
        double price1 = 5.45;
        double price2 = 8.95;
        double regularLoaded = 1.0;
        double largeLoaded = 1.75;
        double totalPrice = 0; // this will change depending on the answer

        if (size == 1) {
            totalPrice = price1; // Nesting was necessary just in case not loaded
            if (answer) {
                totalPrice += regularLoaded; // same thing as adding total price and regularloaded
            }
        } else if (size == 2) {
            totalPrice = price2;
            if (answer) {
                totalPrice += largeLoaded;

            }
        }


        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        {

            if (age <= 17) {
                totalPrice = totalPrice - (totalPrice * .10); // discount
            } else if (age >= 65) {
                totalPrice = totalPrice - (totalPrice * .20); //discount
            }


            System.out.printf("The cost of your sandwich is $%.2f%n", totalPrice);
        }

    }
    }