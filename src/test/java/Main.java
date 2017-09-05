import corporation.*;

import static corporation.Role.DIRECTOR;
import static corporation.Role.MANAGER;
import static corporation.Role.WORKER;

public class Main {
    public static void main(String[] args) {
        Corporation lohika = new Corporation();

        Employee worker = new Worker("Nastia", "Kvas");
        Employee manager = new Manager("Oksana", "Ivaniuk");
        Employee director = new Director("Zoriana", "Petriv");

        System.out.println("Adding employees using addEmployee() method");
        System.out.println();

        //lohika.addEmployee(worker);
        //lohika.addEmployee(manager);
        lohika.addEmployee(director);

        System.out.println("=============================================================");
        System.out.println("Printing all employees");
        System.out.println();

        lohika.printAllEmployees();
        System.out.println("=============================================================");

        lohika.removeEmployee(worker);
        System.out.println("=============================================================");
        System.out.println();

        lohika.printAllEmployees();
        System.out.println();

        System.out.println("=============================================================");

        lohika.printEmployeesBasedOnRole(DIRECTOR);
        lohika.printEmployeesBasedOnRole(MANAGER);
        lohika.printEmployeesBasedOnRole(WORKER);
        System.out.println("=============================================================");

        lohika.hireEmployees(director, manager);
        lohika.printAllEmployees();
        System.out.println();

        //lohika.hireEmployees(director, worker);
        lohika.printAllEmployees();
        System.out.println();

        lohika.addEmployee(worker);

        System.out.println("=============================================================");
        lohika.printEmployeesBasedOnRole(DIRECTOR);
        lohika.printEmployeesBasedOnRole(MANAGER);
        lohika.printEmployeesBasedOnRole(WORKER);

        lohika.removeEmployee(worker);


    }

}
