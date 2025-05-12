import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnException {

    public static void main(String[] args){

        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);

        try{
            int userInput = scanner.nextInt();

            int result = 10/userInput;
            System.out.println("The result is " + result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            int addNumber = scanner.nextInt();

            int newResult = 10/addNumber;
            System.out.println("The result is " + newResult);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: Don't enter zero" );
        } catch (InputMismatchException e){
            System.out.println("InputMismatchException: Enter a number");
        }
        catch(Exception e){
            System.out.println("Unexpected error occur: " + e.getMessage());
        }


    }
}
