import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a one-digit number (0-9): ");
        int userInput = scanner.nextInt();     //Getting the last entered value

        String[] words = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };     //List of the number words

        if (userInput >= 0 && userInput <= 9) {    //Checking to ensure The number was valid
            System.out.println("Number in words: " + words[userInput]);
        } else {
            System.out.println("Invalid Number!");
        }
    }
}
