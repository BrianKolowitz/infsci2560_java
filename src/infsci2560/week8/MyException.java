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
public class MyException extends Exception {
    String excpt;
    
    // default exception constructor
    public MyException() {
        super(); // call superclass constructor
        excpt = "INFSCI2560 -- x = 0; can't be zero"; 
    }
    
    // constructor with specific error message
    public MyException(String err) {
        super(err);
        excpt = err; }
    
    // public method, callable by exception catcher
    public String getError() {
        return excpt;
    }
    
}
