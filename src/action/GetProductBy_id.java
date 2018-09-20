package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.DAOFactory;


@WebServlet(description = "GetProductBy_id", urlPatterns = { "/GetProductBy_id" })
public class GetProductBy_id extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Product product;
		RequestDispatcher rq;
		String product_id = request.getParameter("product_id");
		
		DAOFactory dao = DAOFactory.getDao();
		product = dao.getProduct(product_id);
		
		if(product != null) {
			request.setAttribute("product", product);
			rq = request.getRequestDispatcher("product_list.jsp");
			rq.forward(request, response);
		}else {
			rq = request.getRequestDispatcher("product_list.jsp");
			rq.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
