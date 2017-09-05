package corporation;

public abstract class Employee{

    private String firstName;
    private String lastName;
    private Role role;
    private int id;
    private int age;

    protected Employee(String firstName, String lastName, Role role){

        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;

    }

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return  " " + getFirstName() + " " + getLastName()+ " ";
    }



}
