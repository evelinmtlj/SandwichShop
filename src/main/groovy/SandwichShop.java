import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of your sandwich 1 or 2:"); // ask user sandwich size
        int size = scanner.nextInt();

        if (size == 1) {
            System.out.println("Your price is 5.45");
        } else if (size == 2) {
            System.out.println("Your price is 8.95");


        }


    }
}














