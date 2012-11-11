/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.LR2UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ischenko Aleks
 */
@WebServlet(name = "LR2LoginServlet", urlPatterns = {"/LR2LoginServlet"})
public class LR2LoginServlet extends LR2BaseServlet {

    public LR2LoginServlet()
    {
        super();
    }
      
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher view = null;
        
       if(request.getParameter("postAction").equalsIgnoreCase("Log In"))
       {
           LR2UserBean currentUsr = this.LR2Model.getUserWithLoginPassword(
                                    request.getParameter("login"),
                                    request.getParameter("password"));
           
           if(currentUsr != null)
           {
               HttpSession curSession = request.getSession(true);
               curSession.setAttribute("UserBean", currentUsr);
               
               view = request.getRequestDispatcher("index.jsp");
           }
           else
           {
               view = request.getRequestDispatcher("Error.jsp");
           }
       }
       else
           if(request.getParameter("postAction").equalsIgnoreCase("Register"))
           {
               view = request.getRequestDispatcher("Register.jsp");   
           }
           
        view.forward(request, response);
    }
}
