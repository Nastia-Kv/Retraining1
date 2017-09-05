package corporation;

import java.util.ArrayList;
import java.util.List;


public class Corporation {
    List<Employee> listOfEmployees = new ArrayList<Employee>();

    private int id = 1;

   public void addEmployee(Employee employee){
       employee.setId(id);
       id++;
       listOfEmployees.add(employee);
       System.out.println("Employee" + employee + "added");
   }

    public void removeEmployee(Employee employee){
        listOfEmployees.remove(employee);
        System.out.println("Employee" + employee + "removed");
    }

    public void printAllEmployees(){
         for (Employee employees : listOfEmployees){
             System.out.println("The list of all employees " + employees);
         }
    }

    public void printAllWorkers(Role role){
        System.out.println("Workers");
        for (Employee employee : listOfEmployees){
            if (employee.getRole()==Role.WORKER){
                System.out.println(employee);
            }
        }
    }

    public void printAllManagers(Role role){
        System.out.println("Managers");
        for (Employee employee : listOfEmployees){
            if (employee.getRole()==Role.MANAGER){
                System.out.println(employee);
            }
        }
    }

    public void printAllDirectors(Role role){
        System.out.println("Directors");
        for (Employee employee : listOfEmployees){
            if (employee.getRole()==Role.DIRECTOR){
                System.out.println(employee);
            }
        }
    }



}
