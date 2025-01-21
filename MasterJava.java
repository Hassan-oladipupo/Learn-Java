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


           double shapeValue = 78.9;
           System.out.println("The current shape value is :"  + shapeValue);

           int intConvert = (int) shapeValue;

             System.out.println("The current shape value is :"  + intConvert);

             double doubleConvert = (double) intConvert;

               System.out.println("The current shape value is :"  + doubleConvert);

               float floatConvert = (float) doubleConvert;

               System.out.println("The current shape value is :"  + floatConvert);

                 long longConvert = (long) floatConvert;

               System.out.println("The current shape value is :"  + longConvert);


        //Operators: special symbol use to perform operation on variables 

        //Type
         //1.  Modulo operators: gives remainder value after division
            
             int num1 = 8;
             int num2 = 3;

             int resultModulo = num1 % num2;
             System.out.println("The result is: " + resultModulo);

             //2. Unary
                 int num3 =+5;
                 int num4 =-5;
                 
                //3. Post Increment: Increase the value of the variable by one after re-assigning

                int num5 = 10;
                int num6 = num5++;
               System.out.println("Post Increment");
                System.out.println("num5 is : " + num5);
                System.out.println("num6 is : " + num6);

                //4. Pre Increment: Increase the value of the variable by one before re-assigning

                int num7 = 10;
                int num8 = ++num7;
               System.out.println("Pre Increment");
                System.out.println("num7 is : " + num7);
                System.out.println("num8 is : " + num8);
           

                   //5. Post Decrement: decrease the value of the variable by one after re-assigning

                int num9 = 15;
                int num10 = num9++;
               System.out.println("Post Decrement");
                System.out.println("num9 is : " + num9);
                System.out.println("num10 is : " + num10);

                //6. Pre Decrement: Decrease the value of the variable by one before re-assigning

                int num11 = 17;
                int num12 = ++num11;
               System.out.println("Pre Decrement");
                System.out.println("num11 is : " + num11);
                System.out.println("num12 is : " + num12);

                //Relational Operators: use to perform comparison between two values

                //1 Equal to (==)
                    int newNum1 = 10;
                    int newNum2 = 5;
                    boolean resultNum12 = (newNum1 == newNum2);
                     System.out.println("is newNum1 equal newNum2 ? : " + resultNum12);


                //1 Not Equal to (!=)
                    int newNum3 = 10;
                    int newNum4 = 5;
                    boolean resultNum34 = (newNum3  != newNum4);
                     System.out.println("is newNum3 not equal newNum2 ? : " + resultNum34);


                     

                //3 greater than (>)
                    int newNum5 = 10;
                    int newNum6 = 5;
                    boolean resultNum56 = (newNum5 >  newNum6);
                     System.out.println("is newNum5 greater than newNum6 ? : " + resultNum56);

              //4 greater than or equal to  (>=)
                    int newNum7 = 10;
                    int newNum8 = 5;
                    boolean resultNum78 = (newNum7 >=  newNum8);
                     System.out.println("is newNum7 greater or  equal newNum8 ? : " + resultNum78);


              //5 less  than (<)
                    int newNum9 = 10;
                    int newNum10 = 5;
                    boolean resultNum109 = (newNum9 <  newNum10);
                     System.out.println("is newNum9 less than newNum10 ? : " + resultNum109);

              //4 less than or equal to  (<=)
                    int newNum11 = 10;
                    int newNum12 = 5;
                    boolean resultNum1112 = (newNum11 <=  newNum12);
                     System.out.println("is newNum11 less or  equal newNum12 ? : " + resultNum1112);


                     //Compound Operators

                     //1. Additional assignment: use to add value at the left to the variable at the right 

                     int operaNum1 = 4;
                    System.out.println("The result of operaNum1 before addition assignment is :" + operaNum1);
                     operaNum1 +=  3;
                    System.out.println("The result of operaNum1 after addition assignment is :" + operaNum1);

                //2. Subtraction assignment: use to subtract value at the left from the variable at the right 

                     int operaNum2 = 4;
                    System.out.println("The result of operaNum2 before subtraction assignment is :" + operaNum2);
                     operaNum2 -=  3;
                    System.out.println("The result of operaNum2 after subtraction assignment is :" + operaNum2);

                  //3. Multiplication assignment: use to multiply value at the left to the variable at the right 

                     int operaNum3 = 4;
                    System.out.println("The result of operaNum2 before multiplication assignment is :" + operaNum3);
                     operaNum3 *=  3;
                    System.out.println("The result of operaNum2 after addition multiplication assignment is :" + operaNum3);

                     //4. Division assignment: use to divide value at the left by the variable at the right 

                     int operaNum4 = 4;
                    System.out.println("The result of operaNum2 before division assignment is :" + operaNum4);
                     operaNum4 /=  2;
                    System.out.println("The result of operaNum2 after division assignment :" + operaNum4);






    }
}