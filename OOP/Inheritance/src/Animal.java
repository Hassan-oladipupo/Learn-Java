public class Animal {

    private String name;
    //class constructor
    public Animal(String name){
        this.name = name;
        System.out.println("Animal constructor called!");
    }
    //class function
    public void eat(){
        System.out.println("This animal eats food!");
    }
}
