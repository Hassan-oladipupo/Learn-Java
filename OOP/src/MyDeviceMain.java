public class MyDeviceMain {
    public  static void main(String[] args){
        MyDevice myPhone = new MyDevice("Samsung", "A10");
        myPhone.showDeviceDetails();
        myPhone.brand = "Iphone";
        myPhone.model = "XR";
        myPhone.batteryLife = 87;
        myPhone.isConnected = false;
        myPhone.showDeviceDetails();
        myPhone.connect();
        myPhone.showDeviceDetails();
    }
}
