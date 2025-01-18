

public class Hello {

    public static void main(String[] args) {

        // Declaring Variable and Printing Value 
    //     int num1 = 3;
    //     int num2 = 7;
    //     int result = num1 + num2;
    //     System.out.println(result);
    //     String myName = "Hassan Oladipupo";
    //     System.out.println(myName);

    //     // Data type

    //     // Integer
    //     int num3 = 6;
    //     long large = 5467l;
    //     short small = 558;
    //     byte by = 7;

    //     // Float
    //     double twice = 8.9;
    //     float fg = 5.7f;

    //     // Boolean
    //     boolean statement = true;

    //     // Character
    //     char c = 'k';


    //     //Type Conversion In Java

    //     //Convert Int to Byte 
    //     int x = 25;
    //     byte  y = (byte) x;
    //     System.out.println(y);


    //     //Convert Float  to byte
    //     float flow = 6.7f;
    //     byte  bite = (byte) flow;
    //     System.out.println(bite);


    //  //Type Promotion
    //     byte pick = 100;
    //     byte picker = 3;
    //     int newResult = pick * picker;
    //     System.out.println(newResult);
        



    //     //Arithmetic Operators 

    //     int num = 7;
    //     int nums = 3;

    //      //Addition
    //      int numResult = num + nums;
    //      System.out.println(numResult);

    //      //Subtraction 
    //     // int numResult = num - nums;

    //     // //Multiplication 
    //     // int numResult = num * nums;

    //     // //Division 
    //     // int numResult = num / nums;

    //     // //Modulo 
    //     // int numResult = num % nums;

    //     //Increment By 1
    //      num += 1;

    //      //ShortCut 
    //     num++; //Post increment by 1
    //     ++num;  //pre Increment  by 1

    //   //Increment By 2 
    //   num += 2;

      //Decrement by 2

    //   num -= 2;

    //    //Decrement by 1
    //    num -= 1;
    //  //ShortCut 
    //    num -- ;



    //    //Relational Operator In Java

    //    double cargo = 8.9;
    //    double car = 9.8;

       //Greater Than
      //   boolean relationResult  = cargo > car;


    //    //Less Than
    // boolean relationResult  = cargo < car;


    // //Greater Than Or Equal To
    //  boolean relationResult  = cargo >= car;

    //    //Less Than Or Equal To
    //  boolean relationResult  = cargo >= car;


    //      // Equal To
    //  boolean relationResult  = cargo == car;


       // Not  Equal To
    //  boolean relationResult  =    cargo != car;


    //   System.out.println(relationResult);


   //Logical Operators (AND, OR, NOT)

    //   int x=7;
	// 	int y=5;
	// 	int a=5;
	// 	int b=9;
		
    //       //AND
    //  		boolean result= x>y && a<b ;
            
    //         // OR
   	// 	boolean result= x>y || a<b ;

    //AND
   	// 	boolean result= x>y && a>b ;

      //OR
  	// 	boolean result= x>y || a>b ;

    //AND
  	// 	boolean result= x<y && a<b ;

    //OR
  	// 	boolean result= x<y || a<b ;

    //OR
 	// 	boolean result= x<y || a<b || a>1 ;
		
	// 	//AND NOT
	// 	boolean result= a>b && y != x;

	// 	System.out.println(result);



  //Conditional Statement 
    int x=18;
		if(x>10) {
			System.out.println("Hello");
		}
		
		int newx=28;
		if(newx>10 && newx<=20) {      
			System.out.println("Hello");
		}
		
		else
		System.out.println("Bye");

        int bankAccount = 3000;
        int piggyBalance = 70000;
        

        if(bankAccount < 10000  && piggyBalance > 100000)
        System.out.println("Transfer Piggy balance to bank account!!");
        else if(bankAccount < 5000  && piggyBalance < 100000)
        System.out.println("I no guide!!");
        else
        System.out.println("Bring billing, i too guide!!");


        //Ternary Operator In Java short form of If Else  (?:)

        int n = 4;
        int ternaryResult = 0;

        ternaryResult = n%2==0 ? 10:20;
        System.out.println(ternaryResult);


        //Switch Statement in Java
        int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    default:
        System.out.println("Weekend");
}

String season = "cloudy";

  switch (season) {
      case "winter":
        System.out.println("Good time for harvesting!!");
          break;
      case "summer":
           System.out.println("Enjoy your summer holiday!!");
          break;
      case "Rainy":
          System.out.println("Keep eye on farm produce!!");
           break;
      case "sunny":
         System.out.println("Good time to for planting!!");
          break;
      default:
           System.out.println("Unrecognized season!!");
          break;
  }

  //Loop: use to automate repetitive task

  //While Loop

  int i = 1;
  while(i <= 4)
  {
    System.out.println("Hassan" + i);
       i++;
  
  }
   
    

//Nested Loop: A loop inside another loop
    int k = 1;
  while(k <= 4)
  {
    System.out.println("HI" + k);
    int j = 1;
    while(j <= 3){
       System.out.println("Bye" + j);
       j++;
    }
       k++;
  }
  System.out.println("Hello");


  //Do while Loop 
   int yo = 7;
   do{
			System.out.println("Start Learning Java"+yo);
			yo++;
		}while(yo<=4);

    // For Loop
    for(int go = 7; go<=10; go++)
    {
      System.out.println("Continue learning "  +  go);
    }

    for(int dy = 1; dy <=5; dy++)
    {
        System.out.println("Day  " + dy);
        for(int tm = 1; tm <=9; tm++)
        {
        System.out.println(" "+(tm+8)+"-"+(tm+9));
        }
    }








    }

    

   


}