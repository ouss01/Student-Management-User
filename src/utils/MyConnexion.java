
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Oussema
 */
public class MyConnexion {
    String url = "jdbc:mysql://localhost:3306/studentmanager";
    final static String USERNAME="root";
    final static String PWD="";
    //att
    private Connection cnx;
    //singleton#1
    static MyConnexion instance= null;
    
    public MyConnexion(){
        try { 
            cnx = DriverManager.getConnection(url,USERNAME,PWD);
            System.out.println("Connexion etablie !! ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public static MyConnexion getInstance(){
        if (instance==null)
            instance = new MyConnexion ();
        return instance;
    }
    public Connection getConnection(){
        return cnx;
    
    }
}
