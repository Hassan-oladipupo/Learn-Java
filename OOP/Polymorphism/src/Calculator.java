public class Calculator {
    // polymorphism (many forms) explain how we can use one method to perform different action

    //1. static (compile-time) polymorphism: having multiple methods with the same name but
    //   different parameters,
     public int add(int a, int b){
         return  a + b;
     }

     public int add(int a, int b, int c ){
         return  a + b +c;
     }

     public double add(double a, double b){
         return  a + b;
     }
}
