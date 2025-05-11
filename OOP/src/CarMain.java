public class CarMain {
    public static void main(String[] args) {
       //Instantiating the Car class: this will create an object of class
        Car Toyota = new Car();
        Toyota.color = "Black";
        Toyota.model = "Toyota corolla";
        Toyota.price = 400000;
        Toyota.Year = 2011;

        // calling the class method
        Toyota.showCarDetails();
        System.out.println(Toyota.Year + " " + Toyota.model + " price is: " + Toyota.price );

        Car BMW = new Car();
        BMW.color = "White";
        BMW.model = "BMW X5";
        BMW.price = 700000;
        BMW.Year = 2021;
        BMW.showCarDetails();
        System.out.println(BMW.Year + " " + BMW.model + " price is: " + BMW.price );

    }
}