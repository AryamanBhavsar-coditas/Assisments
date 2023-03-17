package Evaluation_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class SQLops {
    Connection con = Connectivity.Create();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    public void Q1() throws SQLException {
        st = con.createStatement();
        rs = st.executeQuery("Select name from student1 where name like 'z%'");

        while (rs.next()){
            System.out.println("Name:"+rs.getString(2));
        }
    }

    public void Q2() throws SQLException {
        st = con.createStatement();
        rs = st.executeQuery("Select name,experience,salary from teacher1 where experience>=5 OR salary>50000");

        while (rs.next()){
            System.out.println("Name:"+rs.getString(2));
            System.out.println("Experience:"+rs.getInt(7));
            System.out.println("Salary:"+rs.getInt(6));
        }
    }


}
