package dao;

import java.util.ArrayList;

import bean.Product;
import bean.User;

public abstract class DAOFactory {

	public static DAOFactory getDao() {
		DAOFactory dao = new SqlDAO();
		return dao;
	}
	//public abstract boolean checkEmail(String email);
	public abstract boolean register(User user);
	public abstract User checkLogin(User user);
	public abstract boolean addProduct(Product product);
	public abstract boolean updateProduct(Product product);
	public abstract ArrayList<Product> getAllProduct();
	public abstract Product getProduct(String id);
	public abstract boolean deleteProduct(String id);
	public abstract boolean checkEmail(String email);
	public abstract User getEmail(String email);
	/*public abstract boolean insertOTP(User user);*/
	
}
