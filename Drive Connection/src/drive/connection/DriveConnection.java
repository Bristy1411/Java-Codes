
package drive.connection;

import java.sql.*;

public class DriveConnection {

  
    public static void main(String[] args) throws SQLException{
        //Defining the Connection class object
        Connection con = null;
        //Defining the Statement class object
        Statement stmt = null;
        
        try{
            //
            Class.forName("com.mysql.jdbc.Driver");
            
            //
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/information?zeroDateTimeBehavior=convertToNull [root on Default schema]","root","");
            
            //
            stmt=con.createStatement();
            int count=0;
            
            //
            count=stmt.executeUpdate("insert into student(Name, ID, Batch & Dept) values ('Nusrat',171442046,"44th-CSE")");
        
            if(count>0){
                System.out.println("Inserted");
            }
            else{
                System.out.println("Failed");
            }
        }
        catch(Exception e){
            e.printStackTrace(); 
        }
        
        finally{
            
            //
            con.close();
            
            //
            stmt.close();
        }
    }
}
