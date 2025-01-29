public class SmartPhone {
    private String model;
    private String brand;
    private  double price;

    // class parameterized constructor
    public  SmartPhone(String model, String brand, double price){
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    // class copy construct
    public SmartPhone(SmartPhone mySmartPhone){
        this.model = mySmartPhone.model;
        this.brand = mySmartPhone.brand;
        this.price = mySmartPhone.price;
    }

    //class method
    public void comparePrice(SmartPhone smartPhone){
        if(this.price < smartPhone.price){
            System.out.println(this.model + " is " + "cheaper than " + smartPhone.model);
        }
       else if(this.price > smartPhone.price){
            System.out.println(this.model + " is " + "more expensive than " + smartPhone.model);
        }
       else{
            System.out.println(this.model + " is " + "expensive as " + smartPhone.model);
        }
    }
    public void  applyDiscount(double discountApply){
        this.price -= price * discountApply / 100;
    }

    // class method
    public  void displaySmartPhoneDetails(){
        System.out.println("Model:" + model);
        System.out.println("Brand:" + brand);
        System.out.println("price:" + price);
    }
}
