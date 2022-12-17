<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8");%>
	
	<%-- 페이지를 이동시키는 forward, redirect에서 받은 데이터를 바로 page_control_end.jsp 로 보내줌 
	이전페이지에 있던 데이터를 그대로 가져올 수 있는 forward. 그래서 이전에서 forward action 으로 받았던 것들을 그래도 넘길 수 있음.	--%>
		<%-- 페이지가 이동을 하는데 12번 줄의 데이터를 같이 들고 넘어간다. page_control_end.jsp는 얘를 처리해야함. --%>
	<jsp:forward page="page_control_end.jsp">
		<jsp:param value="000-3333-3333" name="tel"  />
	</jsp:forward>
</body>
</html>