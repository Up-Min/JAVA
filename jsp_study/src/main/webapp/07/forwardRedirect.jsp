<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	 <!-- 두개의 다른 폼태그를 선언 -->

	<form method="post" action="forward_action.jsp">
		forward action : <input type = "text" name ="username" />
		 <input type = "submit" value ="확인" />
	</form>
	
	<form method="post" action="response_sendRedirect.jsp">
		sendRedirect action : <input type = "text" name ="username" />
		 <input type = "submit" value ="확인" />
	</form>

<!-- 포워드의 특징 : 그 이전 페이지에서 받은 자료는 페이지 이동이 아닌 페이지 내부에서 이동한다.
포매그 그 안에 있던 데이터를 물고 오기 떄문에 데이터가 깨질 때가 있다. -->

</body>
</html>