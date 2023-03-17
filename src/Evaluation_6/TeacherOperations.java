package Evaluation_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class TeacherOperations {
    Connection con = Connectivity.Create();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    PreparedStatement ps;
    ResultSet rs;
    Statement st;

    public void Retrieve() throws SQLException {
        st = con.createStatement();
        rs = st.executeQuery("Select * from teacher1");

        while (rs.next()){
            System.out.println("----------------------------------------------- ");
            System.out.println("|  ROLL NO   |    NAME    |    SUBJECT    |");
            System.out.println("------------------------------------------------");
            System.out.println("|    "+rs.getInt(1)+"       |   "+rs.getString(2)+"  |     "+rs.getString(4)+"       |");
            System.out.println("------------------------------------------------");
        }

    }

    public void Update() throws SQLException, IOException {
        System.out.println("Enter ID number:");
        int rollNo= Integer.parseInt(bf.readLine());
        ps = con.prepareStatement("select * from teacher1 where id=?");
        ps.setInt(1,rollNo);
        rs = ps.executeQuery();

        if(rs.next()){
            System.out.println("Enter Salary:");
            int salary = Integer.parseInt(bf.readLine());
            ps = con.prepareStatement("update teacher1 set salary=? where id=?");
            ps.setInt(1,salary);
            ps.setInt(2,rollNo);
            ps.executeUpdate();

        }
        else {
            System.out.println("No such Teacher found!!");
        }
    }


    public void Delete() throws IOException, SQLException {
        System.out.println("Enter ID Number:");
        int rollNo = Integer.parseInt(bf.readLine());

        ps = con.prepareStatement("select * from teacher1 where id=?");
        ps.setInt(1,rollNo);
        rs = ps.executeQuery();

        if(rs.next()){
            ps = con.prepareStatement("delete from teacher1 where id=?");
            ps.setInt(1,rollNo);
            ps.executeUpdate();
            System.out.println("Teacher Deleted sucessfully!!");

        }
        else {
            System.out.println("No such teacher found!!");
        }

    }


    public void Insert() throws IOException, SQLException {
        System.out.println("Enter ID Number:");
        int rollNo = Integer.parseInt(bf.readLine());

        ps = con.prepareStatement("select * from teacher1 where id=?");
        ps.setInt(1,rollNo);
        rs = ps.executeQuery();

        if(rs.next()){
            System.out.println("ID number already exist!!");
        }
        else {
            System.out.println("Enter Name:");
            String name = bf.readLine();
            System.out.println("Enter Student ID:");
            int sid = Integer.parseInt(bf.readLine());
            System.out.println("Enter Subject:");
            String subject = bf.readLine();
            System.out.println("Enter City:");
            String city = bf.readLine();
            System.out.println("Enter Salary:");
            int salary = Integer.parseInt(bf.readLine());
            System.out.println("Enter Experience(in years):");
            int experience = Integer.parseInt(bf.readLine());

            ps = con.prepareStatement("insert into teacher1 values(?,?,?,?,?,?,?)");
            ps.setInt(1,rollNo);
            ps.setString(2,name);
            ps.setInt(3,sid);
            ps.setString(4,subject);
            ps.setString(5,city);
            ps.setInt(6,salary);
            ps.setInt(7,experience);
            ps.executeUpdate();
            System.out.println("Teacher added sucessfully!!");
        }
    }
}
