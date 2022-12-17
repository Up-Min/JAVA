<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 단순 페이지만 넘겨 주는 것이 아니라 파라미터 까지 넘겨줄 수 있음.-->
		<!-- request.getparameter로 해서 여기서 넘겨준 것을 header.jsp에서 받음 -->
	<jsp:include page="header.jsp"> 
		<jsp:param name="title" value="My home" />
	</jsp:include>
	

</body>
</html>