public class Student {
    private String name;
    private String username;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setAge(int age){
        if(age <= 16){
            System.out.println("Age not qualify");
        }
        this.age = age;
    }
}

