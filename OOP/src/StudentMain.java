import java.util.Scanner;

public class StudentMain {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student studentInfo = new Student();
        System.out.println("Enter your name");
        String name = scanner.nextLine();  //input
        studentInfo.setName(name);
        System.out.println("Welcome to Java course " + name);

        System.out.println("Enter your username");
        String username = scanner.nextLine();  //input
        studentInfo.setName(username);
        System.out.println("Your " + username + " is" + " valid");

        System.out.println("Enter your age");
        int age = scanner.nextInt();  //input
        studentInfo.setAge(age);
        System.out.println("Your " + age + " is" + " valid");
    }
}
