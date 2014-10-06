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
public class Exception3 {
    
    public int myfunc(int x) throws MyException {
        if (x< 0)
            throw new MyException("INFSCI2560 -- x was " + x + "; can't be less than 0");
        
        if ( x==0 )
            throw new MyException();
        
        return x*2;
            
    }
    
    public int defExcepTest(int j) {
        int i;
        try {
            i = myfunc(j);
            return i;
        }
        catch (MyException e) {
            System.out.println(e.getError());
        }
        return -1;
    }
    public static void main(String [] args) {
        
       
    }
    
}
