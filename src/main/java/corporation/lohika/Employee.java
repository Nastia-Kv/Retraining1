package corporation.lohika;

public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final Role role;
    private int id;
    private int age;

    void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

protected Employee(String firstName, String lastName, Role role){

    this.firstName = firstName;
    this.lastName = lastName;
    this.role = role;

}

}
