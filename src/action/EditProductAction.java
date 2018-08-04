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

@WebServlet("/EditProductAction")
public class EditProductAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product_name,category,price,stock,qty,id;
		RequestDispatcher rd;
		product_name = request.getParameter("product_name");
		category 	 = request.getParameter("category");
		price 		 = request.getParameter("price");
		stock 		 = request.getParameter("stock");
		qty 		 = request.getParameter("qty");
		id 			 = request.getParameter("id");
		
		Product product = new Product();
		product.setId(Integer.parseInt(id));
		product.setCategory(category);
		product.setPrice(price);
		product.setProduct_name(product_name);
		product.setQty(qty);
		product.setStock(stock);
		
		DAOFactory dao  =DAOFactory.getDao();
		boolean status = dao.updateProduct(product);
		
		if(status) {
			request.setAttribute("msg", "Product Update Successfully");
			rd = request.getRequestDispatcher("product_list.jsp");
		}
		else {
			request.setAttribute("msg", "Try After sometime");
			rd = request.getRequestDispatcher("product_list.jsp");
		}
		rd.forward(request, response);
	}
}

