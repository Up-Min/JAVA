<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jstl을 이용할 거기 때문에 태그 해줘야함. -->
    <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- View 제작 1. -->
		<!-- table태그를 이용해서 표를 만들어줄거임. -->
		
		<h2> 상품목록 </h2>
		<table border="1" >
		<tr>
			<th> 번호 </th>
			<th> 상품명 </th>
			<th> 가격 </th>
		</tr>	
		<!-- 표 안에 각 값을 넣어주기 위해 forEach를 사용함. 컨트롤러에서 보내줄 'products'를 받아서 'p'에서 꺼내줄거임 -->
		<!-- for (Product p : products) -->
		<c:forEach var="p" varStatus="i" items="${products}"> 
			<tr>
				<td>${i.count} </td> <!-- 1,2,3 이렇게 찍힘. -->
				<%-- 컨트롤러에 요청을 하기 위해 url을 넣어줘야함. 이름을 눌렀을 때 상세페이지로 들어가도록! --%>
				<!-- 쿼리스트링문, get방식을 이용해서 id값을 보내준다. pcontrol이 받는 값이 info&id인데, 그 값이 p.id임. -->
				<!-- action이라는 애가 받는 값은 info, id라는 애가 받는 값은 p.id임. -->
				<td><a href="/jsp_study/pcontrol?action=info&id=${p.id}"> ${p.name} </a></td> 
				<td>${p.price} </td>				
			</tr>
		</c:forEach>		
		</table>

</body>
</html>