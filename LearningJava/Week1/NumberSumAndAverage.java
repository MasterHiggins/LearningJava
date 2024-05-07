import java.util.Scanner;

public class NumberSumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers (enter -999 to stop):");  //User enters value until -999

        int userInput;
        do {
            userInput = scanner.nextInt();
            if (userInput != -999) {
                sum += userInput;
                count++;
            }
        } while (userInput != -999);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Sum of entered numbers: " + sum);
            System.out.printf("Average of entered numbers: %.2f%n", average);
        } else {
            System.out.println("No valid numbers entered.");
        }

        scanner.close();
    }
}

//I'm not sure if this is what you asked for, as -999 ends the loop, but it skewed the results when it was a part of the average, so I left it like that.