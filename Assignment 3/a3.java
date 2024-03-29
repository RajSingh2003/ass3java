import java.sql.*;
import java.util.*;

public class a3 
{
       public static void main (String args [])throws SQLException
       {
             
             //Connection c=new Connection();
             
            // Statement st=c.createStatement();
             
             try
             {
                Connection c=DriverManager.getConnection("jdbc:postgresql://192.168.1.254:5432/ty55","ty55","ty55");
                 
                Statement st=c.createStatement();  
                ResultSet rs=st.executeQuery("Select * from project");
                
                ResultSetMetaData rsmd=rs.getMetaData();
                
                int cc=rsmd.getColumnCount();
                
                for (int i=1;i<=cc;i++)
                {
                   System.out.print(" \n Column no : "+i);
                   System.out.print(" \n Column name : "+rsmd.getColumnName(i));
                   System.out.print(" \n Column type : "+rsmd.getColumnType(i));
                   System.out.print(" \n Column display size : "+rsmd.getColumnDisplaySize(i));
                   System.out.print("\n");                                                
                
                }        
             
             }
             catch(Exception e)
             {
                System.out.print("\n Error : "+e );
             
             
             }              
       }
}
