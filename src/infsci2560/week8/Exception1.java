/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infsci2560.week8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author bk
 */
public class Exception1 {
    
    public String fileExecpTest(String fn) {
        StringBuilder sb = new StringBuilder();
        String tmpstr;
        File testfile = null;
        FileReader tfr = null;
        BufferedReader tbr = null;
        
        testfile = new File(fn);
        try {
            tfr = new FileReader(testfile);
        }
        catch ( FileNotFoundException fne) {
            // if this occurs we can read a default file, but again need try-catch
            try {
                testfile = new File("default.dat");
                tfr = new FileReader(testfile); 
            }
            catch (FileNotFoundException dfne) {
                // if default is not there, no choice but to return a result that indicates error
                return "File " + testfile.toString() + " not found";
            }
        }
        
        try {
            tbr = new BufferedReader(tfr);
            int i = 0;
            while((tmpstr = tbr.readLine()) != null ) {
                sb.append((tmpstr + "\n"));
            }
        }
        catch (IOException ioe) {
            return "IO exception (" + ioe.getMessage() + ") occured with " + testfile.toString();
        }
        return sb.toString();
    }
}

