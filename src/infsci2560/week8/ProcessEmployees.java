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
public class ProcessEmployees {
    public static void main(String [] args) {
        Employee jd = new Employee("John Doe", 60000);
        System.out.println(jd.name + " makes $" + jd.salary + "/yr");
        jd.raiseSalary(10000);
        System.out.println(jd.name + " makes $" + jd.salary + "/yr");
    }
    
}
