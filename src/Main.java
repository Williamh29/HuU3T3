import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();

        if (num <= 0) {
            System.out.println("That's not positive!");
        } else {
            if (num % 2 != 0) {
                if (num % 5 == 0) {
                    System.out.println("Divisible by 5!");
                } else if (num % 7 == 0) {
                    System.out.println("Divisible by 7!");
                } else if (num % 5 == 0 && num % 7 == 0) {
                    System.out.println("Divisible by both 5 and 7");
                } else if (num % 5 != 0 && num % 7 != 0) {
                    System.out.println("Not Divisible by 5 or 7!");
                }
            } else {
                if (num > 1000) {
                    System.out.println("Big Even Number!");
                } else if (num > 100 && num < 1000) {
                    System.out.println("Medium Even Number!");
                } else {
                    System.out.println("Small Even Number!");
                }
            }
        }
    }
}