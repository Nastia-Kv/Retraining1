import corporation.*;

import static corporation.Role.DIRECTOR;
import static corporation.Role.MANAGER;

public class Main {
    public static void main(String[] args) {
        Corporation lohika = new Corporation();
        Corporation soft = new Corporation();

        Employee worker = new Worker("Nastia", "Kvas");
        Worker worker1 = new Worker("Pavlo", "Petriv");
        Employee manager = new Manager("Oksana", "Ivaniuk");
        Employee director = new Director("Zoriana", "Petriv");
        Director director1 = new Director("Zoriana", "Petriv");

        lohika.addEmployee(worker);
        lohika.addEmployee(manager);
        lohika.addEmployee(director);

        lohika.printAllEmployees();

        lohika.removeEmployee(worker);


        System.out.println("test");

        lohika.printAllEmployees();
        director1.hireManager1("Oksana");
        director.hireManager("Yulia");
        director1.hireWorker1("Igor");

        manager.hireWorker1("Eugene");
        worker1.hireWorker("Natalia");

        System.out.println("ffdsfsffs");

        lohika.printAllDirectors();
        lohika.printAllWorkers();
        lohika.printAllManagers();

    }

}
