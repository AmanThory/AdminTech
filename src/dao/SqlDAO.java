package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Category;
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
	public User getEmail(User user) {
		
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="select * from user_info where user_email='"+user.getEmail()+"' and passwordhint='"+user.getPasshint()+"' ";
			rs = st.executeQuery(query);
			if(rs.next())
			 user = new User();
			 user.setEmail(rs.getString("user_email"));
			 user.setPass(rs.getString("password"));
			 user.setPasshint(rs.getString("passwordhint"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}    

	@Override
	public boolean insertOtp(User user) {
		
		try {
			con = DbConnection.getConnection();
			st = con.createStatement(); 
			query="insert into otp(email,otp) value('"+user.getEmail()+"','"+user.getOtp()+"')";
			int r = st.executeUpdate(query);
			if(r>0) 
				flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	@Override
	public boolean updateOtp(User user) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="update otp set otp='"+user.getOtp()+"' where email='"+user.getEmail()+"' ";
			int r = st.executeUpdate(query);
			if(r>0) {
				flag =true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean deleteOtp(String email) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="delete from otp where email='"+email+"' ";
			int r = st.executeUpdate(query);
			if(r>0) {
				flag =true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	@Override
	public boolean checkOtp(String otp,String email) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="select * from otp where email='"+email+"' and otp='"+otp+"'";
			System.out.println(query);
			rs = st.executeQuery(query);
			if(rs.next())
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public boolean register(User user) {
		
		try {        
			con = DbConnection.getConnection();
			st = con.createStatement(); 
			query="insert into user_info(user_name,user_email,password,passwordhint,status,phone_no) value('"+user.getName()+"','"+user.getEmail()+"','"+user.getPass()+"','"+user.getPasshint()+"','pending','"+user.getPhone()+"')";
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
	public boolean updateRegister(User user) {
		
		try {        
			con = DbConnection.getConnection();
			st = con.createStatement(); 
			query="update user_info set status='active' where user_email='"+user.getEmail()+"'";
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
				user.setStatus(rs.getString("status"));
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
			query="insert into product(product_name,category,price,stock,qty,image,image2,image3,offer) value('"+product.getProduct_name()+"','"+product.getCategory()+"','"+product.getPrice()+"','"+product.getStock()+"','"+product.getQty()+"','"+product.getImage()+"','"+product.getImage2()+"','"+product.getImage3()+"','"+product.getOffer()+"')";
            System.out.println(query);
			int res = st.executeUpdate(query);
			if(res>0)
				flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	@Override
	public boolean updateProduct(Product product) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="update product set product_name='"+product.getProduct_name()+"', category='"+product.getCategory()+"', price='"+product.getPrice()+"', stock='"+product.getStock()+"', qty='"+product.getQty()+"' , image='"+product.getImage()+"' , offer='"+product.getOffer()+"' where id="+product.getId();
			System.out.println(query);
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
				product.setImage(rs.getString("image"));
				product_list.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product_list;
	}

	@Override
	public boolean deleteProduct(String product_id) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="delete from product where id="+product_id;
			System.out.println(query);
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
			if(rs.next()) {
				product = new Product();
				product.setId(rs.getInt("id"));
				product.setProduct_name(rs.getString("product_name"));
				product.setCategory(rs.getString("category"));
				product.setPrice(rs.getString("price"));
				product.setQty(rs.getString("qty"));
				product.setStock(rs.getString("stock"));
				product.setOffer(rs.getString("offer"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}


	@Override
	public boolean addCategory(String category_name) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="insert into category(category_name) value('"+category_name+"')";

			int res = st.executeUpdate(query);
			if(res>0)
				flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	@Override
	public ArrayList<Category> getAllCategory() {
		ArrayList<Category> allcategory = new ArrayList<Category>();
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="select * from category order by category_id desc";
			rs = st.executeQuery(query);
			while(rs.next()) {
				Category category = new Category();
				category.setCategory(rs.getString("category_name"));
				allcategory.add(category);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allcategory;
	}
	
	@Override
	public boolean checkCategory(String category_name) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query="select * from category where category_name='"+category_name+"' ";
			rs = st.executeQuery(query);
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	
}







