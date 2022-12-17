<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	int n = Integer.parseInt(request.getParameter("num5")); 
	for (int i=1; i<10; i++){
		out.println(+n+"*"+i+"="+n*i+"<br>");	
	}
	%>
	
	
</body>
</html>