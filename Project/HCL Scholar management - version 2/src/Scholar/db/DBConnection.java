package Scholar.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	//global declaration of variable
    static Connection con;

    public static Connection createConnection(){

        try{
        	//used to get instance of the class with specified class name
            Class.forName("com.mysql.jdbc.Driver");
            //username of mysql
            String user="root";
            //password of mysql
            String pass="Sury@1234";
            //provides a way identifying a database so that the appropriate driver
            //recognizes it and connects to it
            String url = "jdbc:mysql://localhost:3306/Scholar?autoReconnect=true&useSSL=false";
            //Driver manager class attempts to establish a connection to the database
            con= DriverManager.getConnection(url,user,pass);

        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return con;
    }

}