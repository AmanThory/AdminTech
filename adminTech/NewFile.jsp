<%@ page language="java" contentType="text/html; charset=ISO-8859-1" session="false" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="bean.Product" %>
<%@page import="sqlDao.DAOFactory"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% int i=0;
while(i<10){%>
<h1>Aman Thory</h1>
<h1>vikram Thory</h1>
<%
i++;
}%> 
<%
 RequestDispatcher rq ;
 String product_id = request.getParameter("parameters");
 
 DAOFactory dao = DAOFactory.getDao();
 Product product = dao.getProduct(product_id);
 request.setAttribute("product2", product);
 
%>