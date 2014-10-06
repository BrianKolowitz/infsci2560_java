/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infsci2560.week8;

/**
 *
 * @author bk
 */
public class Employee {

    String name;
    int salary;
    
    public Employee() {
        this(null, 0);
    }
    
    public Employee(String n) {
        name = n;
    }
    
    public Employee(String n, int sal) {
        name = n;
        salary = sal;
    }
    
    public void raiseSalary(int amount) {
        salary = salary + amount;
    }
    
    public static void main(String [] args) {
        Employee e;
        e = new Employee();
    }
}
