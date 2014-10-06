/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infsci2560.week8.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bk
 */
public class CountServlet extends HttpServlet {
    static int NReq = 0;
    
    public void processRequest(HttpServletRequest req,
            HttpServletResponse rsp) throws ServletException, IOException {
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        NReq++;
        out.println("<html><head><title>");
        out.println("Counted Request</title></head>body>");
        out.println("<p>request " + NReq + " since start</p>");
        out.println("</body></html>");
        out.close();
    }
    
}
