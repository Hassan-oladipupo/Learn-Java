import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount : ");
        double principalAmount = scanner.nextDouble();

        System.out.println("Enter the rate value: ");
        double rate = scanner.nextDouble();
        System.out.println("Enter total period: ");
        double time = scanner.nextDouble();

        double SimpleInterestValue = principalAmount * rate * time / 100;
        System.out.println("The simple interest value equals: " + "$" + SimpleInterestValue);
        scanner.close();

    }
}