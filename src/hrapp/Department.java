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
public class Department {
    private String name;
    private int lastIndex = -1;
    private Employee[] employees = new Employee[10];

    public Department(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "Department: " + this.getName();
    }
    
    public void teste(Employee e) {
        this.employees[10] = e;
    }
    
    public void addEmployee(Employee e) {
        if(lastIndex < this.employees.length) {
            
            lastIndex++;
            this.employees[lastIndex] = e;
            
        } else {
            
            System.out.println("The department is full!");
            
        }
    }
    
    public Employee[] getEmployees() {
        Employee[] newEmployees = new Employee[getNumberOfEmployees()];
        
        System.arraycopy(this.employees, 0, newEmployees, 0, newEmployees.length);
        
        return newEmployees;
    }
    
    public Employee getEmployee(int id){
        for(var e : getEmployees()){
            if(e == null) {
                break;
            }
            if(e.getIdNumber() == id) {
                return e;
            }
        }
        return null;
    }
       
    public int getNumberOfEmployees() {
        return lastIndex + 1;
    }
    
    public double getTotalSalary() {
        double total = 0.0;
        
        for(int i = 0; i < getNumberOfEmployees(); i++){
            total += employees[i].getSalary();
        }
        
        return total;
    }
    
    public double getAverageSalary() {
        if(lastIndex > -1){
            return getTotalSalary()/getNumberOfEmployees();
        }
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
