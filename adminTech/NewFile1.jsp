<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="ajax-js.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function getData()
{
	 var url = "NewFile.jsp";
	 var parameters ="";
	 
	 var xmlhttp;
	 if (window.XMLHttpRequest){// code for IE7+, Firefox, Chrome, Opera, Safari
	  xmlhttp=new XMLHttpRequest();
	 }
	 else{// code for IE6, IE5
	  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	 }
	 xmlhttp.onreadystatechange=function()
	 {
	  if (xmlhttp.readyState==4)
	   {
		  document.getElementById('ajax').innerHTML=xmlhttp.responseText;
	   }
	 }
	 xmlhttp.open("POST",url+"?"+parameters,true);
	 xmlhttp.send(); 
}
</script>
<title>Insert title here</title>
</head>
<body>
<a onclick="getData()">Click Here</a>
<div id="ajax"></div>
fjjdfkdk
</body>
</html>