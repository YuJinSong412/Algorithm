<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
The friends who share your hobby of <%= request.getParameter("hobby") %> are: <br>

<%
	ArrayList<String> result = (ArrayList)request.getAttribute("yujin");

	for(String country : result){
%>
<%= country %>
<br>
<%} %>
</body>
</html> 