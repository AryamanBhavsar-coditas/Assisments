import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {


    Configuration configuration = new Configuration().configure();
    SessionFactory sessionFactory = configuration.buildSessionFactory();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        HttpSession session1 = req.getSession(false);
        int cid = (int) session1.getAttribute("cid");

        Session session  = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Product product = session.get(Product.class,id);
        Customer customer = session.get(Customer.class,cid);

        int price = product.getPrice();
        int totalbill = price*quantity;

        product.setQuantity(quantity);
        product.setTotalbill(totalbill);
        product.setCustomer(customer);

        List<Product> list = new ArrayList<>();
        list.add(product);
        customer.setProducts(list);

        session.save(product);
        session.save(customer);

        transaction.commit();

        session.close();


        resp.sendRedirect("ShowProduct");

    }
}
