// Video 4/12-->>


package bank.management.system;
import java.sql.*;

public class Conn {
    
//    Steps to Connect with MySQL JDBC  -->>
//    1) Register the Driver .
//    2) Create Connection
//    3) Create Statement
//    4) Execute Query
//    5) Close Connection 
    
    Connection c; // step 2
    Statement s; //Step 3

//Step 1->
    
    public Conn(){
        // Use try-catch because mysql is external entity which can give error in run time 
        try{
            //Below line will give error, to resolve the below error you need to iomport .jar file.
            // To import goto Libraries -> Add Jar File -> connector.java.jar
            //After importing above jar file , now we can remove the below line ->
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 2->
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");
            //c = DriverManager.getConnection("jdbc:mysql://hostname:port/bankmanagementsystem", "root", "amanpassword");

            //Step-3->
            s= c.createStatement(); 
            
            
            
        }catch(Exception e){
            System.out.println(e) ;
            
        }
    }
    
            
    
}
