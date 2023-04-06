import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/UserProfile")
public class UserProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","12345678");

            PreparedStatement ps = con.prepareStatement("select * from users where id=?");

            String id = req.getParameter("id");

            ps.setString(1,id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                out.println("<h1>NAME:"+rs.getString(2)+"</h1>");
                out.println("<h1>EMAIL:"+rs.getString(3)+"</h1>");
                out.println("<img src='images/"+rs.getString(5)+"' width='100' height='100' >");
            }

            out.println("<a href='user-list.jsp'>back</a>");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
