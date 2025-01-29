public class Bird extends Animal{

    public Bird(String name) {
        // Using the super keyword to initialize the constructor
        // of the parent class here in the child class
        super(name);
        System.out.println("Bird constructor called");
    }

    public void fly(){
        System.out.println("This bird flies");
    }
}
