import  java.util.Scanner;
public class BudgetTrackerPlus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your monthly income: ");
        int monthlyIncome = scanner.nextInt();

        System.out.println("Enter your rent fee: ");
        int rentFee = scanner.nextInt();

        System.out.println("Enter your groceries fee: ");
        int groceries = scanner.nextInt();

        System.out.println("Enter your transportation fee: ");
        int transportationFee = scanner.nextInt();

        System.out.println("Enter your entertainment fee: ");
        int entertainmentFee = scanner.nextInt();

        int totalExpense = rentFee + groceries + transportationFee + entertainmentFee;

        System.out.println("Your total expense for the month is: " + totalExpense);

        int remainingBudget = monthlyIncome - totalExpense;

        System.out.println("Your remaining budget is: " + remainingBudget);

        int amountSpentOnRent =  monthlyIncome - rentFee / 100;

        System.out.println("Percentage spent on rent is: " + amountSpentOnRent + "%");

        int amountSpentOnGroceries = monthlyIncome - groceries / 100;

        System.out.println("Percentage spent on groceries is: " + amountSpentOnGroceries + "%");

        int amountSpentOnTransport = monthlyIncome - transportationFee / 100;

        System.out.println("Percentage spent on transportation is: " + amountSpentOnTransport + "%");


        int amountSpentOnEntertainment = monthlyIncome - entertainmentFee / 100;

        System.out.println("Percentage spent on entertainment is: " + amountSpentOnEntertainment + "%");

        scanner.close();

    }
}