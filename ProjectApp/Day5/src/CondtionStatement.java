import java.util.Scanner;

public class CondtionStatement {

    public  static  void main(String[] args){
        // Condition statement:use to enable decision making in code

        //Type of condition statement

        //1. If statement

        boolean isSunny =  true;
        if(isSunny) {
            System.out.println("Hey, It a good day!!");

        }

        int age = 40;
        if(age >= 40){
            System.out.println("Fool at forty is a fool forever");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        if(name.equals("Hassan")){
            System.out.println("Hi Hassan");
        }
        System.out.println("Execute anyways");

        // Nested If statement: If statement inside another If statement
        int a = 5;
        int b = 2;
        if(a > 0){
            if(b > a){
                System.out.println("B is greater than A");
            }
            System.out.println("B is not greater than A");
        }

        //Logical Operators: THis combine multiple if statement
        int oldAge = 50;
        int newAge= 57;
        if((oldAge >= 50) && (newAge > oldAge)){
            System.out.println("This is the correct age!!");
        }


        int oldGrade = 7;
        int newGrade= 10;
        if((oldGrade >= 7) || (newGrade < oldGrade)){
            System.out.println("Correct grade!!");
        }

        // If else statement: use to check both true and false case in a condition statement
        int number = 9;
        if(number % 2 == 0){
            System.out.println("This is an even number!");
        }
        else{
            System.out.println("This is an Odd number!");
        }

        String weather = "Cloudy";
        if(weather.equals("cloudy")){
            System.out.println("Is going to be raining!");
        }
        else{
            System.out.println("Is not going to be raining");
        }

        //Nested If else statement: this mean If else statement inside another If else statement
        int negativeValue = -20;
        if( negativeValue > 0){
            System.out.println("Number is Positive!");
        }
        else {
            if(negativeValue < 0){
                System.out.println("Number is Negative!");
            }
            else {
                System.out.println("Number is zero!");
            }


        }


        scanner.close();
    }

}
