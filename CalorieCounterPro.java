import java.util.Scanner;
 
public class CalorieCounterPro {
    public static void main(String[] args) {
        System.out.println("Welcome to Calorie Counter Pro!");
 
        // Step 1: Declare variables
        String food1, food2, food3;
        int calories1, calories2, calories3;
        int totalCalories = 0;
 
        // Step 2: Read input from the console
        java.util.Scanner scanner = new java.util.Scanner(System.in);
 
        System.out.println("Enter the name of the first food item:");
        food1 = scanner.nextLine();
        System.out.println("Enter the calories for " + food1 + ":");
        calories1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        System.out.println("Enter the name of the second food item:");
        food2 = scanner.nextLine();
        System.out.println("Enter the calories for " + food2 + ":");
        calories2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        System.out.println("Enter the name of the third food item:");
        food3 = scanner.nextLine();
        System.out.println("Enter the calories for " + food3 + ":");
        calories3 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        // Step 3: Calculate the total calorie intake
        totalCalories = calories1 + calories2 + calories3;
 
        // Step 4: Display the food items and their calories
        System.out.println("\nYour Calorie Intake:");
        System.out.println("1. " + food1 + " - " + calories1 + " calories");
        System.out.println("2. " + food2 + " - " + calories2 + " calories");
        System.out.println("3. " + food3 + " - " + calories3 + " calories");
 
        // Step 5: Display the total calorie intake
        System.out.println("\nTotal Calorie Intake: " + totalCalories + " calories");
 
        System.out.println("Thank you for using Calorie Counter Pro!");
        
        scanner.close(); // Close the scanner
    }
}