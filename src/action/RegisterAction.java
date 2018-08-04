package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.DAOFactory;

@WebServlet("/RegisterAction")
public class RegisterAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username,password,ph_number,email;
		RequestDispatcher rd;
		User user;
		boolean b;
		
		username = request.getParameter("name");
		email    = request.getParameter("email");
		password = request.getParameter("password");
		ph_number   = request.getParameter("number");
		
		if(username.trim().length()==0 || password.trim().length()==0 || username.trim().length()==0 || ph_number.trim().length()==0) {
			request.setAttribute("error", "Don't enter space");
			rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
		
		user = new User();
		user.setName(username);
		user.setEmail(email);
		user.setPass(password);
		user.setPhone(ph_number);
		
		DAOFactory dao = DAOFactory.getDao();
		b = dao.register(user);
		
		if(b) {
			rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
	
	}
}
