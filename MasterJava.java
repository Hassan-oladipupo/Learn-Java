public class MasterJava{
    public static void main(String[] args){
        //Displaying text to console 
    System.out.println("Hello World!");
    System.out.println("Hello student");
    
    
    //Escape sequence: use for breaking lines in text
    System.out.println("Oladipupo \nHassan");
    
    //Basic maths
    System.out.println(4+3);
    System.out.println(3-2);
    System.out.println(10/2);
    System.out.println(2*3);

    // Variable declaration and Assigning
    int myAge; //declaring variable
    myAge = 56; //Assigning Variable
    int myWeight = 800; // declaration and assigning 
    System.out.println(myAge);
    System.out.println(myWeight);


    //Primitive Data types in Java

    //DataTypes For Whole Number: numbers with no decimal point 
     
     //1. Byte: ranges -128 to 127
          byte newByte = 127;
     // 2.  Short : ranges -32,768 to 32,767
            short   newShort = 3287;
     // 3. Int: ranges -2, 147,483,648 to 2,147,483,647
            int newInt = 342455;
       //4. long
              long newLong = 300_00_00_000L;

    //DataTypes For Decimal Number: numbers with  decimal point 

    //1. Float: store 32bits of floating point numbers
       float newFloat = 32.4f;

    // 2. Double: stores 64bits of double point number 
        double newDouble = 3.14159665;

        //Data type Char: to store a single character
        char newChar = 'A';
        //Data type Boolean: to store value that are either true or false 

        boolean isBoolean = true;
        boolean isPresent = false;
        System.out.println(isPresent);

        //String data type for storing string

        String greeting = "Hello Java";
        String cargo = "new ship";
        System.out.println(greeting);

        //Arithmetics with Variables
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("The sum is : " + sum);
        int difference = a - b;
        System.out.println("The difference is : " + difference);

        

       //TypeCasting, it involves converting one data type to another 
         // 1. Implicit typecasting: convert from smaller data type value to bigger data type  value and it happens automatically and no data lost
           int intNumber = 14;
           double doubleNumber = intNumber;
           System.out.println(doubleNumber);       

           // 2. explicit typecasting: convert from bigger data type value to smaller data type  value and it happens manually and result to loss of data

           double doubleNumber2 = 45.6;
           int intNumber2 = (int) doubleNumber2;
            System.out.println(intNumber2);       



    }
}