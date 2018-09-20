package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;


@WebServlet(description = "CategoryAction", urlPatterns = { "/CategoryAction" })
public class CategoryAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
  		String category_name;
  		RequestDispatcher rq;
  		boolean b;
  		
  		category_name =request.getParameter("category_name");
  		
  		DAOFactory dao = DAOFactory.getDao();
  		b = dao.checkCategory(category_name);
  		if(b == false) {
  			b = dao.addCategory(category_name);
  	  		if(b == true) {
  	  			request.setAttribute("success", "Category is successfully added");
  	  			rq = request.getRequestDispatcher("allcategory.jsp");
  	  			rq.forward(request, response);
  	  		}else {
  	  		    request.setAttribute("error", "Category is not added");
	  			rq = request.getRequestDispatcher("allcategory.jsp");
	  			rq.forward(request, response);
  	  		}
  		}else {
  			request.setAttribute("error", "This Category is already added");
  			rq = request.getRequestDispatcher("allcategory.jsp");
  			rq.forward(request, response);
  		}
	}

  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
