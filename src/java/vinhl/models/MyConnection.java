/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.models;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Luu Thieu Gia
 */
public class MyConnection {   
    public static Connection getMyConnection() 
    {
        Connection conn = null;
        try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; databaseName = Presentation", "sa", "123456");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return conn;
        
    }
    
}
