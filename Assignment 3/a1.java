import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


class a1 extends JFrame
{
        //JFrame f;
        JTable t;
        
        a1()
        {
               setTitle ("Project Details ");
               setSize(600,500);   
               setVisible(true); 
               
               t=new JTable();
        	
               //try
               
               try
               {
                  Connection con=DriverManager.getConnection("jdbc:postgresql://192.168.1.254:5432/ty55","ty55","ty55");
                  Statement st=con.createStatement();
                  ResultSet rs=st.executeQuery("SELECT * FROM project"); 
                  //DefaultTableModel model = new DefaultTableModel();
                  DefaultTableModel model = new DefaultTableModel();
                  //String sq="SELE";
                                
                  ResultSetMetaData rm=rs.getMetaData();                 
                  
                  int cc=rm.getColumnCount();
                 
                  String cn[]=new String[cc]; 
                  for (int i=1;i<=cc;i++)
                       cn[i]=rm.getColumnName(i);
                  
                  while (rs.next())
                  {
                       Object o[]=new Object[cc];
                       
                       for (int i=1;i<=cc;i++)
                       {
                           o[i]=rs.getObject(i);
                           
                       }
                       model.addRow(o); 
                  } 
                  t.setModel(model);
                    
                  
                  
                  // column count 
                  
                  
               }catch(SQLException e)
               {
                     System.out.print(""+e);
               
               }
        
        
        
        
        }
        
       
        
        public static void main(String args[])
        {
               a1 a=new a1();
        }
           
        
}
