public class LibraryMember {
    protected String name;

    //class constructor
    public LibraryMember(String name){
        this.name = name;
    }

    //class method
    public void borrowBook(){
        System.out.println(name + " can borrow book!");
    }
}
