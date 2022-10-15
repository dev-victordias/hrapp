/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

import java.util.Arrays;

/**
 *
 * @author NPC Tech
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HR App Starts");
        
        Department d1;
        d1 = new Department("Human Resources");
        System.out.println(d1);
        
        Employee e1 = new Employee(1, "Victor Dias", 8000);
        Employee e2 = new Employee(2, "Sara Kill", 8000);
        Employee e3 = new Employee(13, "Lula", 10_000);
        Employee e4 = new Employee(12, "Circo", 10_000);
   
        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d1.addEmployee(e3);
        d1.addEmployee(e4);
        
        System.out.println();
        System.out.println("List of Employees:");
        for(var e : d1.getEmployees()) {
            System.out.println(e);
        }
        
        System.out.println();
        System.out.println("Total salary is: U$" + d1.getTotalSalary());        
        System.out.println("Average salary is: U$" + d1.getAverageSalary());

    }
    
}
