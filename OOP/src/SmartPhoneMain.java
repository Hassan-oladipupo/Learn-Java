public class SmartPhoneMain {
    public static void main(String[] args){
        SmartPhone mySmartphone1 = new SmartPhone("POP 5", "Infinix",1000 );
        SmartPhone mySmartPhone2 = new SmartPhone("XR", "Apple", 1000);
        mySmartPhone2.applyDiscount(20);


        //passing object of smartphone 1 as parameter
        mySmartPhone2.comparePrice(mySmartphone1);
        System.out.println(".......................");
        mySmartPhone2.displaySmartPhoneDetails();
        System.out.println(".......................");
        mySmartphone1.displaySmartPhoneDetails();

        // using the copy construct to create a new Smartphone object

        SmartPhone mySmartPhone3 = new SmartPhone(mySmartPhone2);
        mySmartPhone3.applyDiscount(5);
        System.out.println(".......................");
        mySmartPhone3.displaySmartPhoneDetails();
    }
}
