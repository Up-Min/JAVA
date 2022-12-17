<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="mem" class="ch07.com.dao.Member"> </jsp:useBean>
    <jsp:setProperty property="*" name="mem"/>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2> 검사 결과 </h2>
	
	<% 
	
	String a = request.getParameter("email");
	String b = request.getParameter("phone");
	out.println(a);
	out.println(b);
	%>
	<hr>
	<%= 
	mem.result(a, b)
	%>

</body>
</html>