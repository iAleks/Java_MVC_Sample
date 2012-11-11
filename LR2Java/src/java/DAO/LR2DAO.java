/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Ischenko Aleks
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import SourceConnection.LR2ConnectionFactory;


public class LR2DAO 
{
    Connection connection;
    Statement stmt;
 
 
    private static Connection getConnection()
            throws SQLException,
                ClassNotFoundException
    {
        Connection con = LR2ConnectionFactory.
                getInstance().getConnection();
        return con;
    }
 
    public List<LR2ClothesBean> getAllClothes()
    {
        String query = "select * from IALEKS.CLOTHES ";
         
        List<LR2ClothesBean> list = new ArrayList<LR2ClothesBean>();
        LR2ClothesBean clothes = null;
        try {
            connection = getConnection();
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                clothes = new LR2ClothesBean();
                clothes.setID(rs.getInt("ID"));
                clothes.setMerchantID(rs.getInt("MERCHANTID"));
                clothes.setSize(rs.getInt("SIZE"));
                clothes.setPrice(rs.getDouble("PRICE"));
                clothes.setName(rs.getString("NAME"));
                list.add(clothes);
            }
            rs.close();
 
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
    public void insertNewClothesBean(LR2ClothesBean newObject) throws SQLException, ClassNotFoundException
    {
        connection              = getConnection();
        Statement insertStmt    = connection.createStatement();
        String insertParameters = "insert into IALEKS.CLOTHES (ID,MERCHANTID,SIZE,PRICE,NAME) values ";
        String insertValues     = String.format("(%s,%s,%s,%s,'%s')",
                                  newObject.getID().toString(),
                                  newObject.getMerchantID().toString(),
                                  newObject.getSize().toString(),
                                  newObject.getPrice().toString(),
                                  newObject.getName().toString());
        String insertCommand    = insertParameters + insertValues;
        
        insertStmt.executeUpdate(insertCommand);
        insertStmt.close();
    }
    
    public LR2UserBean getUserWithLoginPassword(String login,String password)
    {
        String query = String.format("select * from IALEKS.USERS where login='%s' and password='%s'",
                                      login,
                                      password);
         
        LR2UserBean user = null;
        
        try {
            connection   = getConnection();
            stmt         = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                user = new LR2UserBean();
                user.setFirstName(rs.getString("FIRSTNAME"));
                user.setLastName(rs.getString("LASTNAME"));
                user.setLogin(rs.getString("LOGIN"));
                user.setPassword(rs.getString("PASSWORD"));
                }
            rs.close();
 
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
       
    }
    
    public void insertNewUserBean(LR2UserBean newUser) throws SQLException, ClassNotFoundException
    {
        connection              = getConnection();
        Statement insertStmt    = connection.createStatement();
        String insertParameters = "insert into IALEKS.USERS (FIRSTNAME,LASTNAME,LOGIN,PASSWORD) values ";
        String insertValues     = String.format("('%s','%s','%s','%s')",
                                  newUser.getFirstName(),
                                  newUser.getLastName(),
                                  newUser.getLogin(),
                                  newUser.getPassword());
        String insertCommand    = insertParameters + insertValues;
        
        insertStmt.executeUpdate(insertCommand);
        insertStmt.close();
    }
    



}
