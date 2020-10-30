import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", urlPatterns = "/calculate")
public class CalculateDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String desc = request.getParameter("desc");
        float price = Float.parseFloat(request.getParameter("price"));
        float discountPercent = Float.parseFloat(request.getParameter("percent"));

        float discountAmount = (float) (price * discountPercent * 0.01);
        float discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> - Description: " + desc + "</h1>");
        writer.println("<h2> - Discount Amount: " + discountAmount + "</h1>");
        writer.println("<h2> - Before Price: " + price + "</h1>");
        writer.println("<h2> - Discount Price: " + discountPrice + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
