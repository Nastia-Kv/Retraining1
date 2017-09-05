import corporation.*;

import static corporation.Role.DIRECTOR;
import static corporation.Role.MANAGER;
import static corporation.Role.WORKER;

public class Main {
    public static void main(String[] args) {
        Corporation lohika = new Corporation();

        Employee worker = new Worker("Nastia", "Kvas");
        //Worker worker1 = new Worker("Pavlo", "Petriv");
        Employee manager = new Manager("Oksana", "Ivaniuk");
        Employee director = new Director("Zoriana", "Petriv");
        //Director director1 = new Director("Zoriana", "Petriv");
        System.out.println();

        lohika.addEmployee(worker);
        lohika.addEmployee(manager);
        lohika.addEmployee(director);
//
//        lohika.printAllEmployees();
//
//        lohika.removeEmployee(worker);
//        System.out.println();
//
//
//        System.out.println("test1");
//        System.out.println("test");
//        System.out.println();
//
//        lohika.printAllEmployees();
//        System.out.println();
//
//        System.out.println();
//
//        lohika.printAllDirectors();
//        lohika.printAllWorkers();
//        lohika.printAllManagers();

        lohika.printEmployees(DIRECTOR);
        //lohika.printEmployees(MANAGER);
        //lohika.printEmployees(WORKER);


    }

}
