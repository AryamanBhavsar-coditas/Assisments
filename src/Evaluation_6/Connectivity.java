package Evaluation_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
    static Connection con;

    public static Connection Create(){
        try {

            String url = "jdbc:mysql://localhost:3306/assisment";
            String uname = "root";
            String pass = "12345678";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,uname,pass);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
