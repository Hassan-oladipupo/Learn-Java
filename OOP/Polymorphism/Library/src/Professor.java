public class Professor extends LibraryMember{


    public Professor(String name) {
        super(name);
    }

    //Dynamic (run time ) polymorphism when the subClass override the method of
    // it super class and the method to be use will be determined by the object passed
    //  if the super class object is passed the super class method will be used during the runtime
    //  if the subclass class object is passed the subclass method will be used during the runtime
    @Override
    public void borrowBook() {

        System.out.println(name + " can borrow ten books!");
    }
}
