/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infsci2560.week8.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bk
 */
public class SimpServlet extends HttpServlet {
    
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
    }
    
    public void processRequest(HttpServletRequest req,
            HttpServletResponse rsp) throws ServletException, IOException {
        String ms [] = { "one", "two", "three", "four", "five" };
        rsp.setContentType("text/html");
        
        PrintWriter out = rsp.getWriter();
        out.println("<html><head><title>Simple</title></head><body>");
        for ( int i = 1; i<=5; i++) {
            out.println("<p>" + i + ". This is line " + ms[i-1]);
        }
        out.close();
    }
    
}
