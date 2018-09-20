package dao;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class DbConnection {

/*	public static Session getSession()
	{
		Session sess = null;
		try {
			
			Configuration cfg = new Configuration();
			cfg.configure("Hibernate.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
		    sess = sf.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return sess;
	}*/
	public static Connection getConnection(){
		
		Connection con = null;
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/last","root","123");
		
		}catch(Exception e) {
		
			e.printStackTrace();
		}
		return con;
	}
}
