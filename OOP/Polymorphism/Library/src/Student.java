public class Student extends LibraryMember{

    public Student(String name) {
        super(name);
    }

    @Override
    public void borrowBook() {

        System.out.println(name + " can borrow three books!");
    }
}
