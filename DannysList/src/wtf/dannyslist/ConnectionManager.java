package wtf.dannyslist;

import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class ConnectionManager {

   static Connection con;
   static String url;
         
   public static Connection getConnection()
   {
     
      try
      {
         String url = "jdbc:mysql:" + "//localhost:3306/dannyslist"; 
         // assuming "DataSource" is your DataSource name

         
         Class driver_class = Class.forName("com.mysql.jdbc.Driver");
         Driver driver = (Driver) driver_class.newInstance();
         DriverManager.registerDriver(driver);
         
         
         try
         {            	
            con = DriverManager.getConnection(url,"admin","password"); 
             								
         // assuming your SQL Server's	username is "username"               
         // and password is "password"
              
         }
         
         catch (SQLException ex)
         {
            ex.printStackTrace();
         }
      }

      catch(ClassNotFoundException e)
      {
         System.out.println(e);
      } catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

   return con;
}
}