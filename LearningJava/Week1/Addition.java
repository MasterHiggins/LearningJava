import java.util.Scanner;
public class Addition {
    public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    int num1, num2, sum;
    System.out.println ("Enter first number: ");
    num1 = input.nextInt();
    System.out.println ("Enter second number: ");
    num2 = input.nextInt();
    sum = num1 + num2;
    System.out.printf("sum = %d\n", sum);
    //System.out.println ("Sum = " + sum);
    }
}
