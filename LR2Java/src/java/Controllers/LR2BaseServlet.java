/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.LR2DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @Ischenko Aleks
 */
public class LR2BaseServlet extends HttpServlet {

        
    protected LR2DAO LR2Model = null;
    
    public LR2BaseServlet()
    {
        super();
        this.LR2Model = new LR2DAO();
        
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
       
    }

}
