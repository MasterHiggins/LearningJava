import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five integers:");

        int largest = Integer.MIN_VALUE; // Starting with the smallest value

        for (int i = 0; i < 5; i++) {  //Loop to go through all the values
            int currentValue = scanner.nextInt();
            if (currentValue > largest) {   //If the current value being checked is larger than the largest value, then it is updated to the largest value
                largest = currentValue;
            }
        }

        System.out.println("The largest integer is: " + largest);
    }
}


//Having prior Java knowledge definitely helps a bit