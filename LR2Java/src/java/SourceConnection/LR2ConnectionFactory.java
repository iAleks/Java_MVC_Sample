/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceConnection;

/**
 *
 * @author iAleks
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LR2ConnectionFactory 
{
    private static LR2ConnectionFactory sharedInstance = new
                                                         LR2ConnectionFactory();
    
    private String url         = "jdbc:derby://localhost:1527/LR2DataBase";
    private String user        = "iAleks";
    private String password    = "1";
    private String driverClass = "org.apache.derby.jdbc.ClientDriver";

  
   
    private LR2ConnectionFactory() 
    {
        try {
            Class.forName(driverClass);
        }
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
 
    public static LR2ConnectionFactory getInstance()   {
        return sharedInstance;
    }
 
    public Connection getConnection() throws SQLException,ClassNotFoundException 
    {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

}
