package action;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import constant.Constant;
import dao.DAOFactory;

@WebServlet(description = "Registration", urlPatterns = { "/Registration" })
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	String msg,subject,hint;
	boolean b ;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
        String username,password,passwordhint,email,ph_number;
		
		username 	 = request.getParameter("username");
		password 	 = request.getParameter("password");
		email    	 = request.getParameter("email");
		ph_number    = request.getParameter("ph_number");
		passwordhint = request.getParameter("passwordhint");
		
		if(username.trim().length()==0 || password.trim().length()==0 || email.trim().length()==0 || ph_number.trim().length()==0 || passwordhint.trim().length()==0) {
			request.setAttribute("error", "Don't enter space");
			rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
		
		DAOFactory dao = DAOFactory.getDao();
		User user = new User();
		/*if(subject.equals("ForgetPassword")){
			
			b=dao.checkEmail(email);
			if(b != true) {
				user.setEmail(email);
				user.setPasshint(passwordhint);
				
				user = dao.getEmail(user);
				if(user != null) {
					
					session.setAttribute("subject", "ForgetPassword");
					session.setAttribute("email", email);
					session.setAttribute("Otp", msg);
					session.setAttribute("user", user);
					
					hint = user.getPass();
					Mailer.send(email,subject,hint);
					rd=request.getRequestDispatcher("login.jsp");
					rd.forward(request, response);
				}
				
							
			}else {
				
			   request.setAttribute("error", "your email is not exist");
			   rd = request.getRequestDispatcher("login.jsp");
			   rd.forward(request, response);
			}
			
		}else*/ {
	    b = dao.checkEmail(email);
		
		if(b != true) {
			msg = GeneratePin.generatePin();
			user.setName(username);
			user.setEmail(email);
			user.setPass(password);
			user.setPhone(ph_number);
			user.setPasshint(passwordhint);
			
			user.setOtp(msg);
			if(dao.register(user)) {
			   if(dao.insertOtp(user)) {
				   Mailer.send(email, subject, "<!DOCTYPE html><html><body> "+msg+"<br/><a href="+Constant.OTP_PATH+"?email="+email+">Click Here to enter OTP</a></body></html>");
			   }
			   request.setAttribute("user", user);
			   rd=request.getRequestDispatcher("enterotp.jsp");
			   rd.forward(request, response);
			}
		}else {
			request.setAttribute("error", "This is email is already Registered");
			rd=request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
		
	  }		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
