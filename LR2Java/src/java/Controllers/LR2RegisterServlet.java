/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.LR2UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "LR2RegisterServlet", urlPatterns = {"/LR2RegisterServlet"})
public class LR2RegisterServlet extends LR2BaseServlet {

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
        
        LR2UserBean newUser = new  LR2UserBean();
        
        newUser.setFirstName(request.getParameter("firstname"));
        newUser.setLastName(request.getParameter("lastname"));
        newUser.setLogin(request.getParameter("login"));
        newUser.setPassword(request.getParameter("password"));
        
        try {
            this.LR2Model.insertNewUserBean(newUser);
            
        } catch (SQLException ex) {
            Logger.getLogger(LR2RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LR2RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        HttpSession curSession = request.getSession(true);
        curSession.setAttribute("UserBean", newUser);
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }

}
