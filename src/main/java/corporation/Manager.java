package corporation;

public class Manager extends Employee {
    public Manager(String firstName, String lastName) {
        super(firstName, lastName, Role.MANAGER);
    }

    public void hireWorker(String name){
        System.out.println("Manager " + getFirstName() + " " + "hired" + " worker " + name);
    }
}
