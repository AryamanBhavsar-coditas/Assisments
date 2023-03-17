package Evaluation_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class StudentOperations {
    Connection con = Connectivity.Create();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    PreparedStatement ps;
    ResultSet rs;
    Statement st;

    public void Retrieve() throws SQLException {
        st = con.createStatement();
        rs = st.executeQuery("Select * from student1");

        while (rs.next()){
            System.out.println("----------------------------------------------- ");
            System.out.println("|  ROLL NO   |    NAME    |    SUBJECT    |");
            System.out.println("------------------------------------------------");
            System.out.println("|    "+rs.getInt(1)+"       |   "+rs.getString(2)+"  |     "+rs.getString(3)+"       |");
            System.out.println("------------------------------------------------");
        }

    }

    public void Update() throws SQLException, IOException {
        System.out.println("Enter Roll number:");
        int rollNo= Integer.parseInt(bf.readLine());
        ps = con.prepareStatement("select * from student1 where id=?");
        ps.setInt(1,rollNo);
        rs = ps.executeQuery();

        if(rs.next()){
            System.out.println("Enter marks:");
            int marks = Integer.parseInt(bf.readLine());
            ps = con.prepareStatement("update student1 set marks=? where id=?");
            ps.setInt(1,marks);
            ps.setInt(2,rollNo);
            ps.executeUpdate();

        }
        else {
            System.out.println("No such student found!!");
        }
    }

    public void Delete() throws IOException, SQLException {
        System.out.println("Enter Roll Number:");
        int rollNo = Integer.parseInt(bf.readLine());

        ps = con.prepareStatement("select * from student1 where id=?");
        ps.setInt(1,rollNo);
        rs = ps.executeQuery();

        if(rs.next()){
            ps = con.prepareStatement("delete from student1 where id=?");
            ps.setInt(1,rollNo);
            ps.executeUpdate();
            System.out.println("Student Deleted sucessfully!!");

        }
        else {
            System.out.println("No such student found!!");
        }

    }


    public void Insert() throws IOException, SQLException {
        System.out.println("Enter Roll Number:");
        int rollNo = Integer.parseInt(bf.readLine());

        ps = con.prepareStatement("select * from student1 where id=?");
        ps.setInt(1,rollNo);
        rs = ps.executeQuery();

        if(rs.next()){
            System.out.println("Roll number already exist!!");
        }
        else {
            System.out.println("Enter Name:");
            String name = bf.readLine();
            System.out.println("Enter Subject:");
            String subject = bf.readLine();
            System.out.println("Enter City:");
            String city = bf.readLine();
            System.out.println("Enter Marks:");
            int marks = Integer.parseInt(bf.readLine());

            ps = con.prepareStatement("insert into student1 values(?,?,?,?,?)");
            ps.setInt(1,rollNo);
            ps.setString(2,name);
            ps.setString(3,subject);
            ps.setString(4,city);
            ps.setInt(5,marks);
            ps.executeUpdate();
            System.out.println("Student added sucessfully!!");
        }
    }


    public static void main(String[] args) throws SQLException, IOException {
        StudentOperations studentOperations = new StudentOperations();
        //studentOperations.Retrieve();
       // studentOperations.Update();
        studentOperations.Insert();
    }
}
