import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        String email = req.getParameter("email");
        String pass = req.getParameter("pass");


            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            Customer customer = null;

            customer = (Customer) session.createQuery("From Customer C where C.email = :email")
                    .setParameter("email", email).uniqueResult();

            if (customer != null && customer.getPass().equals(pass)) {

                HttpSession session1 = req.getSession();
                session1.setAttribute("cid",customer.getId());
                resp.sendRedirect("customerlogin.html");

            } else {
                out.println("<div align='center'><h1 style='color:red;'>Invalid Credentials!!</h1></div>");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.html");
                requestDispatcher.include(req, resp);
            }

            session.close();

    }
}
