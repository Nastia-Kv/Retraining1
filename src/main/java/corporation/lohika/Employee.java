package corporation.lohika;

import javax.management.relation.Role;

public abstract class Employee {
    private corporation.lohika.Role role;
    private int id;
    private String firstName;
    private String lastName;
    private int age;


    public Role getRole() {
        return role;
    }

    void setId(){


    }
    public int getId() {
        return id;
    }
protected Employee(String firstName, String lastName, corporation.lohika.Role role){

    this.firstName = firstName;
    this.lastName = lastName;
    this.role = role;
    this.age = age;
}
}
