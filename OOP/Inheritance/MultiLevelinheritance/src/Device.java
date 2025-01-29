public class Device {
    private String brand;
    private String model;

    // class constructor
    public Device(
            String brand,
            String model
    ){
        this.brand = brand;
        this.model = model;
    }

    // class method
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
