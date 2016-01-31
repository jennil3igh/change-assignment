package assignment1;

/*
 Assignment 1
 Jennifer Castano
 */
import java.util.Scanner;

public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int amount, originalChange, price, change,
                quarters, dimes, nickels, pennies;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a whole number from 1 to 99. "
                + "That will be the price of the item in cents: ");
        price = keyboard.nextInt();
        System.out.print("Now enter in the amount of cents you will be paying with: ");
        amount = keyboard.nextInt();
        System.out.println("I will find a combination of coins");
        System.out.print("that equals that amount of change: ");
        System.out.println(amount - price);

        change = amount - price;
        originalChange = change;
        quarters = change / 25;
        change = change % 25;
        dimes = change / 10;
        change = change % 10;
        nickels = change / 5;
        change = change % 5;
        pennies = change;

        System.out.println(originalChange
                + " cents in coins can be given as:");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels and");
        System.out.println(pennies + " pennies");
    }

}
