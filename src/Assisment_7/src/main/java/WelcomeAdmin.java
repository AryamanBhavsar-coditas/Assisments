import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/WelcomeAdmin")
public class WelcomeAdmin extends HttpServlet {

    Connection con = Connectivity.Create();
    ResultSet rs;
    PreparedStatement ps,ps1;
    Statement st;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        out.println("<h1>Welcome Admin</h1><br>");

        try {
            st = con.createStatement();
            rs = st.executeQuery("select * from assisment7");

            out.println("<table border='solid'>" +
                    "<th>ID</th>" +
                    "<th>NAME</th>" +
                    "<th>EMAIL</th>" +
                    "<th>CITY</th>" +
                    "<th>PHONE</th>");

            while (rs.next()){
              out.println("<tr><td>"+rs.getString(1)+"</td>");
              out.println("<td>"+rs.getString(2)+"</td>");
              out.println("<td>"+rs.getString(3)+"</td>");
              out.println("<td>"+rs.getString(5)+"</td>");
              out.println("<td>"+rs.getString(6)+"</td></tr>");
            }

            out.println("</table>");
            out.println("<h1><a href='login.html'><button>Logout</button></a></h1><br>");
            out.println("<a href='Edit.html'><button>Edit</button></a>");
            out.println("<a href='Delete.html'><button>Delete</button></a>");
            out.println("<a href='index.html'><button>Add</button></a>");
            out.println("<a href='ShowDeletedServlet'><button>Show Deleted Records</button></a>");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
