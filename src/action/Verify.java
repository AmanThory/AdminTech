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
	
		RequestDispatcher rd;
		boolean b;
/*		subject = (String)session.getAttribute("subject");*/
		/*System.out.println(subject);*/
	/*	email = (String) session.getAttribute("email");
		User user = (User) session.getAttribute("user");*/
		
		/*msg = (String)session.getAttribute("msg");*/
		String email = request.getParameter("email");
		
		DAOFactory dao = DAOFactory.getDao();
		otp = request.getParameter("otp");
		
		if(otp.trim().length() == 0) {
	
			request.setAttribute("error", "Enter proper OTP");
			rd = request.getRequestDispatcher("enterotp.jsp");
			rd.forward(request, response);
					
		}else {
			        User user = new User();
			        user.setEmail(email);
			        user.setOtp(otp);
					b=dao.checkOtp(otp,email);
					if(b == true) {
						b = dao.updateRegister(user);
						if(b == true) {
						    dao.deleteOtp(email);
							System.out.println("success");
						}
					}
					request.setAttribute("success", "You have successfully registered");
					rd = request.getRequestDispatcher("login.jsp");
					rd.forward(request, response);
				}
				
			}
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
