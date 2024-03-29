import java.sql.*;
import java.util.*;



public class a22
{

     public static void main(String args[])
     {
     
        Connection con;
        
        DatabaseMetaData dm;
        ResultSet rs;
        
       try
       { 
        
        con=DriverManager.getConnection("jdbc:postgresql://192.168.1.254:5432/ty55","ty55","ty55");
        
        if (con==null)
        {
           System.out.print("\n Connection failed ");
        }
        else 
        {
            dm=con.getMetaData();
            //rs=con.createStatement();
            
            rs=dm.getTables(null,null,null,new String []{"TABLE"});
            while (rs.next())
                  System.out.print("\n  "+rs.getString("TABLE_NAME"));
            
            System.out.print("\n Connection Successful \n ");     
            System.out.print("\n Driver name :  "+dm.getDriverName());     
            System.out.print("\n  Driver version :  "+dm.getDriverVersion());     
            System.out.print("\n User name :  "+dm.getUserName());     
            System.out.print("\n ");     
            System.out.print("\n Connection Successful \n ");     
              
            
         }
      }
      catch (Exception e)
      {
             System.out.print("Error caught "+e);
      }
      
      
     
     
     
     
     }
}
