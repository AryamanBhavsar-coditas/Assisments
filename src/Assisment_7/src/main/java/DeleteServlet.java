import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    Connection con = Connectivity.Create();
    ResultSet rs;
    PreparedStatement ps,ps1;
    Statement st;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String id = req.getParameter("id");

        try {
            ps = con.prepareStatement("delete from assisment7 where id=?");
            ps.setString(1, id);
            ps.execute();

            out.println("<h1>Deleted Sucessfully!");
            out.println("<h1><a href='WelcomeAdmin'>Back</a></h1>");
            RequestDispatcher rd = req.getRequestDispatcher("Delete.html");
            rd.include(req,resp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
