<%@ page language="java" contentType="text/html; charset=ISO-8859-1" session="false" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@page import="sqlDao.DAOFactory"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    boolean f = false;
    
	String product_id=request.getParameter("product_id"); 	
	DAOFactory dao = DAOFactory.getDao();
	System.out.println(product_id);
	  
	if(product_id.contains(",")){
		String ids[] = product_id.split(",");
		for(String i : ids)
			f = dao.deleteProduct(i);	
	}else{
		f = dao.deleteProduct(product_id);
	}
	
	if(f == true)
		response.sendRedirect("product_list.jsp");
	else
		out.print("Not Delete"); 
%>