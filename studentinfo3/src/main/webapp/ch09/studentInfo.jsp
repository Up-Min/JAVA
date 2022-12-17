<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 학생 정보 </h2>
	
	<h2> 학생 추가 </h2>
	<hr>
	<!-- input창을 통해 넣어줄거기 떄문에 form -->
	<!-- 메소드를 post방식으로 줘도 쿼리스트링문을 집어넣을 수 있다. -->
	<form method="post" action="/studentinfo3/studentControl?action=insert"> 
		<label> 이름 </label> <input type="text" name = "username"/> <br/>
		<label> 대학 </label> <input type="text" name = "univ"/> <br/>
		<label> 생일 </label> <input type="text" name = "birth"/> <br/>
		<label> 이메일 </label> <input type="text" name = "email"/> <br/>
		<button type="submit"> 등록 </button>
	</form>
</body>
</html>