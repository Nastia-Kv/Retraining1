import corporation.lohika.*;

import static corporation.lohika.Role.DIRECTOR;
import static corporation.lohika.Role.MANAGER;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Nastia", "Kvas", 27);
//        person.setHeight(175);
//        System.out.println(person.getHeight());
//        Employee employee = null;
//        System.out.println(employee);
//
//        employee = new Employee("Nastia", "Kvas", Role.WORKER) {
//            @Override
//            public int getId() {
//                return super.getId();
//            }
//
//            @Override
//            public Role getRole() {
//                return super.getRole();
//            }
//
//            @Override
//            public void setAge(int age) {
//                super.setAge(age);
//            }
//
//            @Override
//            public int getAge() {
//                return super.getAge();
//            }
//        };
//
//        System.out.println(employee.getRole());

        LohikaCorporation lohika = new LohikaCorporation();

        Employee worker = new Worker("Nastia", "Kvas", Role.WORKER);
        Employee manager = new Manager("Oksana", "Ivaniuk", MANAGER);
        Employee director = new Director("Zoriana", "Petriv", DIRECTOR);

        lohika.addEmployee(worker);
        lohika.addEmployee(manager);
        lohika.addEmployee(director);

        lohika.removeEmployee(worker);

        lohika.printAllEmployees();


    }

}
