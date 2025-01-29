public class MyDevice {
    //Member variables or field or properties or attribute
    String brand;
    String model;
    int batteryLife = 0;
    boolean isConnected = false;


    // Class default constructor: constructor with no parameter
  //    public MyDevice(){
//        System.out.println("Initializing value with constructor");
//        brand = "Unknown";
//        model = "Unknown";
//    }

    // Class parameterized constructor: constructor with parameters
    public MyDevice(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    // class method
    void connect(){
        System.out.println("connecting...");
        isConnected = true;

    }

    void disConnect(){
        System.out.println("disconnecting...");
        isConnected = false;
    }

    void showDeviceDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("batterLife: " + batteryLife);
        System.out.println("Connected: " + isConnected);
    }
}
