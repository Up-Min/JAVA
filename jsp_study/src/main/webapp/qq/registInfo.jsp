<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 고객정보 조회 </h2>
	<hr>
	<ul>
	
		<li> 고객아이디 : ${Info.id} </li>
		<li> 고객명 : ${Info.name} </li>
		<li> 주소 : ${Info.address} </li>
		<li> 등급 : ${Info.grade} </li>
		<li> 전화번호 : ${Info.phone} </li>
	
	</ul>
</body>
</html>