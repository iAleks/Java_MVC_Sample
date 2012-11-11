/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.LR2ClothesBean;
import DAO.LR2DAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Ischenko Aleks
 */
@WebServlet(name = "ClothesServlet", urlPatterns = {"/ClothesServlet"})
public class LR2ClothesServlet extends LR2BaseServlet {

    public LR2ClothesServlet()
    {
        super();
    }
         
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        List<LR2ClothesBean> listOfColthes = LR2Model.getAllClothes();
        
        request.setAttribute("allClothes", listOfColthes);
        RequestDispatcher view = request.getRequestDispatcher("ViewAllClothes.jsp");
        view.forward(request, response);
       
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
            throws ServletException, IOException 
    {
       String cID    = request.getParameter("clothesID");
       String cMID   = request.getParameter("clothesMerchantID");
       String cName  = request.getParameter("clothesName");
       String cPrice = request.getParameter("clothesPrice");
       String cSize  = request.getParameter("clothesSize");
       
       LR2ClothesBean newBean = new LR2ClothesBean();
       newBean.setName(cName);
       newBean.setID(Integer.parseInt(cID));
       newBean.setMerchantID(Integer.parseInt(cMID));
       newBean.setPrice(Double.parseDouble(cPrice));
       newBean.setSize(Integer.parseInt(cSize));
        
       try {
            LR2Model.insertNewClothesBean(newBean);
        } catch (SQLException ex) {
            Logger.getLogger(LR2ClothesServlet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Aleks==> "+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LR2ClothesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       doGet(request, response);
    }
    
    
}
