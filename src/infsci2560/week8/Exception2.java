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
public class Exception2 {
    
    public static void main(String [] args) {
        int i = 0, j = 0;
        try {
            int p = i/j;
        }
        catch (ArithmeticException e) {
            System.out.println("Effort to divide by zero");
        }
        System.out.println("Normal Termination");
    }
    
}
