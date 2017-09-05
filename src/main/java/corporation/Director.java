package corporation;

public class Director extends Employee {
    public Director(String firstName, String lastName) {
        super(firstName, lastName, Role.DIRECTOR);
    }


    public void hireManager1(String name){
        System.out.println(name);
    }

    public void hireWorker1(String name){
        System.out.println("Director " + getFirstName() + " " + "hired" + " worker " + name);
    }



}

