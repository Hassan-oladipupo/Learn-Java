public class Dog extends Animal{
    public Dog(String name) {
        // Using the super keyword to initialize the constructor
        // of the parent class here in the child class
        super(name);
        System.out.println("Dog constructor called!");
    }

    public void barks(){
        System.out.println("This dog barks");
    }

}
