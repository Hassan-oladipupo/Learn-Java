public class Car {
    // Class Properties or Attribute
    String color;
    String model;
    int Year;
    int price;


    // Class default constructor
    public Car(){
        color = "Unknown";
        model = "Unknown";
        Year = 0;
        price = 0;
    }

    // Class Method
    void showCarDetails (){
        System.out.println(
                "This car is a " + model + " " + color + " color" + " it was built in " + Year +
                        " and the price is " + " " + price
        );
    }
}
