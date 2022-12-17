<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 고객 목록 </h2>
	<hr>
	<table border="1">
	<tr>
		<th> 아이디 </th>
		<th> 이름 </th>
		<th> 전화번호 </th>
	</tr>
		<c:forEach var = "List" varStatus="i" items = "${List}">
		<tr>
			<td> ${i.count} </td>
			<td> <a href="/jsp_study/RControl?action=info&id=${List.id}">${List.name} </a></td>
			<td> ${List.phone} </td>
		</tr>		
		</c:forEach>
	</table>
	<a href=/jsp_study/RControl?action=confirm> 등급확인 </a>
</body>
</html>