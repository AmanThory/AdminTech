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
import dao.DAOFactory;

/**
 * Servlet implementation class SendMail
 */
@WebServlet(description = "SendMail", urlPatterns = { "/SendMail" })
public class SendMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	String msg,subject;
	boolean b ;
	EmailSender eobj = new EmailSender();
	
	public void generatePin()
	{
		int randomNo = (int)(Math.random()* 9000) + 1000;
		
		msg = String.valueOf(randomNo);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession(false);
		subject = (String) session.getAttribute("subject");
		RequestDispatcher rd;

        String username,password,email,ph_number;
		
		username = request.getParameter("username");
		password = request.getParameter("password");
		email    = request.getParameter("email");
		ph_number= request.getParameter("ph_number");
		
		if(username.trim().length()==0 || password.trim().length()==0 || username.trim().length()==0 || ph_number.trim().length()==0) {
			request.setAttribute("error", "Don't enter space");
			rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}
		
		DAOFactory dao = DAOFactory.getDao();
		
		if(subject.equals("ForgetPassword")){
			
			b=dao.checkEmail(email);
			
			if(b != true) {
				
				generatePin();
				
				User user = dao.getEmail(email);
				
				
				session.setAttribute("subject", "ForgetPassword");
				session.setAttribute("email", "email");
				session.setAttribute("user", user.getPass());
				session.setAttribute("Otp", "msg");
				
				 
				eobj.send(email,email, subject, msg);
				request.setAttribute("Mail", "Please check OtP on your email");
				rd=request.getRequestDispatcher("enterotp.jsp");
				rd.forward(request, response);
			
			}else {
			   request.setAttribute("error", "your email is not exist");
			   rd = request.getRequestDispatcher("login.jsp");
			   rd.forward(request, response);
			}
			
		}else {
		
		User user = new User();
		user.setName(username);
		user.setEmail(email);
		user.setPass(password);
		user.setPhone(ph_number);
		
	    b = dao.checkEmail(email);
		System.out.println(subject);
		
		if(b != true) {
			
			generatePin();
			session.setAttribute("subject", "Registration");
			session.setAttribute("email", email);
			session.setAttribute("Otp", msg);
			session.setAttribute("user", user);
		    	
			boolean status = eobj.send(email,email, subject, msg);
			if(status == true) {
			request.setAttribute("Mail", "Please check OtP on your email");
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
