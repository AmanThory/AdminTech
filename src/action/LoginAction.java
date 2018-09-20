package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.DAOFactory;
 
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username,password;
		RequestDispatcher rd;
		User user;
		
		username = request.getParameter("username");
		password = request.getParameter("password");
		
		if(username.trim().length()==0 || password.trim().length()==0) {
			request.setAttribute("error", "Don't enter space");
			rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		else {
			user = new User();
			user.setEmail(username);
			user.setPass(password);
			
			DAOFactory dao = DAOFactory.getDao();
			user = dao.checkLogin(user);
			
			if(user!=null) { 
				
				if(user.getStatus().equals("pending")) {
					rd = request.getRequestDispatcher("enterotp.jsp?email="+username);
					rd.forward(request, response);	
				}else {
					HttpSession session = request.getSession(true);
					session.setAttribute("user", user);
					rd = request.getRequestDispatcher("index.jsp");
					rd.forward(request, response);
				}
			}else {
				request.setAttribute("error", "Please enter valid credential");
				rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response); 
			}
		}
	}
}