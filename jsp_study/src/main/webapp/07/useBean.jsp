<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="GuGu" class="ch07.com.dao.GuGuDan"> </jsp:useBean>
    <jsp:setProperty property="*" name="GuGu"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h4>구구단 출력하기</h4>
	
	<%= GuGu.process(5) %>
	
</body>
</html>