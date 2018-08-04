package action;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import com.sun.mail.smtp.SMTPSSLTransport;
//import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeBodyPart;
//import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeMultipart;

public class EmailSender {
	
	String host = "smtp.gmail.com";
	 static String userid ="amanthory53@gmail.com";
    static String password ="9467306961";
    
	public boolean send(String to,String cc, String subject, String message)
	{   boolean status = false;
		
		try
		{	
			Properties props = System.getProperties();
			//props.put("mail.smtp.cc",cc);
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.setProperty("mail.transport.protocol", "smtps");
			props.put("mail.smtp.user", userid);
			props.put("mail.smtp.password", password);
			props.put("mail.smtp.port", "465");
			props.put("mail.smtps.auth", "true");
				
			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message1 = new MimeMessage(session);
			InternetAddress fromAddress = null;
			InternetAddress toAddress = null;
			//InternetAddress ccAddress = null;
		try 
		{
			fromAddress = new InternetAddress(userid);
			toAddress = new InternetAddress(to);
			//ccAddress = new InternetAddress(cc);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		message1.setFrom(fromAddress);
		message1.setRecipient(RecipientType.TO, toAddress);
		//message1.setRecipient(RecipientType.CC , ccAddress);
		
		message1.setSubject(subject);
		message1.setText(message,"UTF-8","html");	
		//message1.setContent(mmp);
		
		
		Transport transport = session.getTransport("smtps");
		transport.connect(host, userid, password);
	
		transport.sendMessage(message1, message1.getAllRecipients());
		transport.close();
		status = true;
		}
		catch (MessagingException e) 
		{
			e.printStackTrace();			
		}
		return status;
	}
}