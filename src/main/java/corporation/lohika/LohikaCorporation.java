package corporation.lohika;

import java.util.ArrayList;


public class LohikaCorporation {
    ArrayList<Employee> list = new ArrayList<Employee>();

   public void addEmployee(Employee employee){
       list.add(employee);
       System.out.println("Employee" + employee + "added");
   }

    public void removeEmployee(Employee employee){
        list.remove(employee);
        System.out.println("Employee" + employee + "removed");
    }

    public void printAllEmployees(){
         for (Employee employees : list){
             System.out.println(employees);
         }
    }

}
