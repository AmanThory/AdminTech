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

/**
 * Servlet implementation class Verify
 */
@WebServlet("/Verify")
public class Verify extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	String subject,otp,msg,email;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession(true);
		RequestDispatcher rd;
		subject = (String)session.getAttribute("subject");
		msg = (String)session.getAttribute("msg");
		email = (String) session.getAttribute("email");
		User user = (User) session.getAttribute("user");
		
		DAOFactory dao = DAOFactory.getDao();
		
		otp = request.getParameter("otp");
		
		if(otp.trim().length() == 0) {
	
			rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
					
		}else {
        		
			if(otp.equals(msg)) {
				
				if(subject.equals("ForgetPassword")) {
				
					user.getPass();
					user.getEmail();
					
					
					
				}else {
					
					dao.register(user);
					
					request.setAttribute("success", "You have successfully registered");
					rd = request.getRequestDispatcher("login.jsp");
					rd.forward(request, response);
				}
				
			}else {
				
			}
		
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
