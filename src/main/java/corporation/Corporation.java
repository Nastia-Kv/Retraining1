package corporation;

import java.util.ArrayList;
import java.util.List;


public class Corporation {
    List<Employee> listOfEmployees = new ArrayList<Employee>();

    private int id = 1;

    public void addEmployee(Employee employee) {
        if (listOfEmployees.contains(employee)){
            System.out.println("Employee " + employee.toString() + " with " + employee.getRole() + " is already with us");
        } else {
        employee.setId(id++);
        listOfEmployees.add(employee);
        System.out.println("Employee " + employee + " added");
    }  }

//    public void removeEmployee(Employee employee) {
//        listOfEmployees.remove(employee);
//        System.out.println("Employee " + employee + " removed");
//    }

    public void removeEmployee(Employee employee) {
        if (listOfEmployees.contains(employee)) {
            System.out.println("removing employee " + employee);
            listOfEmployees.remove(employee);
            System.out.println(listOfEmployees.size() + " employee(s) after firing is(are) left");
            System.out.println(listOfEmployees);
        } else {
            System.out.println("Unable to fire an employee, who is not a part of our corporation. No employee with the role " + employee.getRole() + " found.");
        }

        //System.out.println("Employee " + employee + " removed");
    }

    public void printAllEmployees() {
        for (Employee employees : listOfEmployees) {
        }
        System.out.println("Number of employees - " + listOfEmployees.size());
        System.out.println("The list of all employees:" + listOfEmployees);

    }


    public void printEmployeesBasedOnRole(Role role) {
        boolean found = false;
        for (Employee employee : listOfEmployees) {
            if (employee.getRole() == role) {
                System.out.println(employee.getFirstName() + " - " + employee.getRole().toString());
                found = true;

            }

        }
        if (!found) {
            System.out.println("There is no employee with " + role + " position. It's a high time to recruit the  " + role);
        }
    }


    public void hireEmployees(Employee employeeWhoHires, Employee employeeWhoHired) {
        if (employeeWhoHires.getRole().getNumber() > employeeWhoHired.getRole().getNumber()) {
            listOfEmployees.add(employeeWhoHired);
            System.out.println("Welcome our newcomer - " + employeeWhoHired.toString() + " - " + employeeWhoHired.getRole());

        } else {
            System.out.println(employeeWhoHires + " who is " + employeeWhoHires.getRole() + " cannot hire " + employeeWhoHired.getRole());
        }

    }

    //    public void printAllWorkers(){
//        System.out.println("Workers");
//        for (Employee employee : listOfEmployees){
//            if (employee.getRole()==Role.WORKER){
//                System.out.println(employee);
//            }
//        }
//    }
//
//    public void printAllManagers(){
//        System.out.println("Managers");
//        for (Employee employee : listOfEmployees){
//            if (employee.getRole()==Role.MANAGER){
//                System.out.println(employee);
//            }
//        }
//    }
//
//    public void printAllDirectors(){
//        System.out.println("Directors");
//        for (Employee employee : listOfEmployees){
//            if (employee.getRole()==Role.DIRECTOR){
//                System.out.println(employee);
//            }
//        }
//    }

}






