/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

/**
 *
 * @author NPC Tech
 */
public class Employee {
    private int idNumber;
    private String name;
    private double salary;

    public Employee(int idNumber, String name, double salary) {
        this.idNumber = idNumber;
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return "ID: " + this.getIdNumber() + "\n" 
                + "Name: " + this.getName() + "\n"
                + "Salary: U$" + this.getSalary();
    }
    
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
