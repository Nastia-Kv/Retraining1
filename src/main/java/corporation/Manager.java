package corporation;

public class Manager extends Employee {
    public Manager(String firstName, String lastName) {
        super(firstName, lastName, Role.DIRECTOR);
    }

    public void hireWorker(String name){
        System.out.println("Director " + Role.MANAGER + " " + "hired" + " worker " + name);
    }
}
