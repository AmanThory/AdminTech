package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Product;
import bean.User;

public class SqlDAO extends DAOFactory {

	Connection con;
	Statement st;
	ResultSet rs;
	String query;
	boolean flag = false;
	
	@Override
	public boolean checkEmail(String email) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="select user_email from user_info where user_email='"+email+"' ";
			rs = st.executeQuery(query);
			if(rs.next())
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}    

	@Override
	public User getEmail(String email) {
		User user = null;
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="select * from user_info where user_email='"+email+"'";
			rs = st.executeQuery(query);
			if(rs.next())
				
			 user = new User();
			 user.setEmail(rs.getString("user_email"));
			 user.setPass(rs.getString("password"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}    

	/*@Override
	public boolean insertOTP(User user) {
		
		try {
			con = DbConnection.getConnection();
			st = con.createStatement(); 
			query="insert into user_info(id,otp) value('"+user.getPhone()+"')";
			System.out.println(query);
			int r = st.executeUpdate(query);
			if(r>0) {
				
				flag=true;
			} 
			else
				user =null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}*/
	
	@Override
	public boolean register(User user) {
		String name=null;
		try {
			con = DbConnection.getConnection();
			st = con.createStatement(); 
			query="insert into user_info(user_name,user_email,password,status,phone_no) value('"+user.getName()+"','"+user.getEmail()+"','"+user.getPass()+"','active','"+user.getPhone()+"')";
			System.out.println(query);
			int r = st.executeUpdate(query);
			if(r>0) {
				
				flag=true;
			} 
			else
				user =null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	
	@Override
	public User checkLogin(User user) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="select * from user_info where user_email='"+user.getEmail()+"' and password='"+user.getPass()+"'";
			rs = st.executeQuery(query);
			if(rs.next()) {
				user = new User();
				user.setName(rs.getString("user_name"));
				user.setEmail(rs.getString("user_email"));
				user.setPhone(rs.getString("phone_no"));
				user.setStatuc(rs.getString("status"));
			}
			else
				user =null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean addProduct(Product product) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="insert into product(product_name,category,price,stock,qty,image,offer) value('"+product.getProduct_name()+"','"+product.getCategory()+"','"+product.getPrice()+"','"+product.getStock()+"','"+product.getQty()+"','"+product.getImage()+"','"+product.getOffer()+"')";

			int res = st.executeUpdate(query);
			if(res>0)
				flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public ArrayList<Product> getAllProduct() {
		ArrayList<Product> product_list = new ArrayList<Product>();
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="select * from product order by id desc";
			rs = st.executeQuery(query);
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setProduct_name(rs.getString("product_name"));
				product.setCategory(rs.getString("category"));
				product.setPrice(rs.getString("price"));
				product.setQty(rs.getString("qty"));
				product.setStock(rs.getString("stock"));
				product.setOffer(rs.getString("offer"));
				product_list.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product_list;
	}

	@Override
	public boolean deleteProduct(String id) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="delete from product where id="+id;
			int res = st.executeUpdate(query);
			if(res>0)
				flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public Product getProduct(String id) {
		Product product=null;
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="select * from product where id="+id;

			rs = st.executeQuery(query);
			while(rs.next()) {
				product = new Product();
				product.setId(rs.getInt("id"));
				product.setProduct_name(rs.getString("product_name"));
				product.setCategory(rs.getString("category"));
				product.setPrice(rs.getString("price"));
				product.setQty(rs.getString("qty"));
				product.setStock(rs.getString("stock"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public boolean updateProduct(Product product) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			//query="insert into product(product_name,category,price,stock,qty)value('"+product.getProduct_name()+"','"+product.getCategory()+"','"+product.getPrice()+"','"+product.getStock()+"','"+product.getQty()+"')";
			query="update product set product_name='"+product.getProduct_name()+"', category='"+product.getCategory()+"', price='"+product.getPrice()+"', stock='"+product.getStock()+"', qty='"+product.getQty()+"' where id="+product.getId();
			int res = st.executeUpdate(query);
			if(res>0)
				flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
}







