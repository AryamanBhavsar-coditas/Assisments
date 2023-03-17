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
            System.out.println("------------------------------");
            System.out.println("Name:"+rs.getString(1));
            System.out.println("------------------------------");
        }
    }

    public void Q2() throws SQLException {
        st = con.createStatement();
        rs = st.executeQuery("Select name,experience,salary from teacher1 where experience>=5 AND salary>50000");

        //select student1.name,teacher1.name,teacher1.city from student1 inner join teacher1 on student1.id=teacher1.id where(select name from teacher1 where name like '%a');

        while (rs.next()){
            System.out.println("------------------------------");
            System.out.println("Name:"+rs.getString(1));
            System.out.println("Experience:"+rs.getInt(2));
            System.out.println("Salary:"+rs.getInt(3));
            System.out.println("------------------------------");
        }
    }

    public void Q3() throws SQLException {
        st = con.createStatement();
        rs = st.executeQuery("select student1.name as sname,teacher1.name,teacher1.city from student1 inner join teacher1 on student1.id=teacher1.id where teacher1.city IN('Pune','Mumbai') and teacher1.name like '%a'");

        while (rs.next()){
            System.out.println("------------------------------");
            System.out.println("Student Name:"+rs.getString(1));
            System.out.println("Teacher Name:"+rs.getString(2));
            System.out.println("Teacher City:"+rs.getString(3));
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) throws SQLException {
        SQLops sqLops = new SQLops();
//        //sqLops.Q1();
//        //sqLops.Q2();
//        sqLops.Q3();
    }

}
