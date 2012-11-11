/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Filters;

import DAO.LR2UserBean;
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*; 


/**
 *
 * @author Ischenko Aleks
 */
@WebFilter(filterName   = "LR2LoginFilter",
           urlPatterns  = {"/AddNewClothes.jsp"},
           servletNames = {"ClothesServlet"})

public class LR2LoginFilter implements Filter 
{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        System.out.println("iAleks==> Init Filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("iAleks==> doFilter");
        
        HttpServletRequest  req  = (HttpServletRequest)request;
        HttpServletResponse res  = (HttpServletResponse)response;
        
        HttpSession curSession =  req.getSession(true);
        LR2UserBean user = (LR2UserBean) curSession.getAttribute("UserBean");
        
        if(user == null)
        {
            RequestDispatcher view = req.getRequestDispatcher("Login.jsp");
            view.forward(request, response);
        }
        else 
        {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        System.out.println("iAleks==> destroyFilter");
    }
    
}
