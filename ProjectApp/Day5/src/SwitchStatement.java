package ProjectApp.Day5.src;

import java.util.Scanner;

public class SwitchStatement {
    //Enums: are us to define fix value that do not change in our program
    public enum CoffeSize{
        LARGE, SMALL, MEDIUM, VENTI
    }
    public  static void main(String[] args){
        //Switch statement offer more readable alternative to if-else-if statement

        //Switch statement with Int
        int days = 4;
        String dayOfWeek = "";
        switch (days){
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;

            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;


            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        System.out.println("Today is: " + dayOfWeek);

        // Switch statement with char
        char grade ='A';
        switch (grade){
            case 'A':
                System.out.println("Excellent!!");
                break;
            case 'B':
                System.out.println("Good job!!");
                break;
            case 'C':
                System.out.println("Well done!!");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }

        // Switch statement with string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter season to get your season advice: ");
        String season = scanner.nextLine();
        switch (season){
            case "summer":
                System.out.println("Good time to enjoy!!");
                break;

            case "rainy":
                System.out.println("Start saving up funds!!");
                break;

            case "winter":
                System.out.println("Winter is always very cold!!");
                break;
            default:
                System.out.println("Unrecognized season!");

        }



        CoffeSize size = CoffeSize.LARGE;

        float price;
        switch (size){
            case LARGE:
                price = 67.8f;
                break;
            case MEDIUM:
                price = 50.8f;
                break;
            case SMALL:
                price = 40.8f;
                break;
            case VENTI:
                price = 37.8f;
                break;
            default:
                price = 460.76f;

        }
        System.out.println("Coffe price is: " + "$"+price);
        scanner.close();
    }
}
