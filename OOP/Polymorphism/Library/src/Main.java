public class Main {
    public static void main(String[] args) {

        LibraryMember [] members = new LibraryMember[3];
          members [0] = new LibraryMember("Hassan");
          members [1] = new Student("Taiwo");
          members [2] = new Professor("Dr Oseni");

        for(LibraryMember member:members){
            member.borrowBook();
        }

    }
}