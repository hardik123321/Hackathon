package traffic;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class connectionclass {
    public static Connection Makeconnection()
    {
Connection conn=null; 
   try
   {
   Class.forName("com.mysql.jdbc.Driver") ;
   conn=DriverManager.getConnection("jdbc:mysql:///traffic","root","") ;
   
   }  // end of try block
   catch(Exception ee)
   {
   JOptionPane.showMessageDialog(null,ee);
   }
   return conn ;
}
}
