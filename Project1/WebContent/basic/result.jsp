<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Beer Recommendations JSP</h1>
	<p>
	
	<% 
		List styles = (List)request.getAttribute("styles");
		Iterator it = styles.iterator();
		while(it.hasNext()){
		  out.print("<br>try: " + it.next());
		}
	%>
	</p>
</body>
</html>