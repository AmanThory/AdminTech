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


@WebServlet(description = "ResendOtp", urlPatterns = { "/ResendOtp" })
public class ResendOtp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String msg,subject,to;
	boolean b ;
	public void generatePin() {
		
		int randomNo = (int)(Math.random()* 9000) + 1000;
		msg = String.valueOf(randomNo);
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession(false);
		User user = (User)session.getAttribute("user");
		subject =(String)session.getAttribute("subject");
		DAOFactory dao = DAOFactory.getDao();
		
		to = user.getEmail();
		generatePin();
		Mailer.send(to, subject, msg);
		user.setOtp(msg);
		b=dao.updateOtp(user);
		
		if(b == true) {
			RequestDispatcher rq = request.getRequestDispatcher("enterotp.jsp");
			rq.forward(request,response);	
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
