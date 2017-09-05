package corporation;

public class Worker extends Employee {
    public Worker(String firstName, String lastName) {
        super(firstName, lastName, Role.WORKER);
    }

    public void hireWorker(String name){
        System.out.println("Worker " + getFirstName() + " " + "cannot hire anybody");
    }
}
