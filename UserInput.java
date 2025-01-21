
import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
      
      // input for text
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your name");
      String userName = scanner.nextLine();  //input 
       System.out.println("Welcome to Java course " + userName);

       //Input for Number
       System.out.println("Enter your age");
       int age = scanner.nextInt();
       System.out.println("Your age is : " + age);

       //Simple calculation
       System.out.println("Please enter a number");
       int a = scanner.nextInt();
       System.out.println("Please enter a number");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("The sum is :" + sum);

      scanner.close();
    }
}