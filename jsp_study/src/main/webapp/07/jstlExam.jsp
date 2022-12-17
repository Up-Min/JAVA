<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>종합예제</h2>
	<hr>
	<h3>set, out</h3>
<!-- c:set 모두 pagescope에 저장이 된다. 지역변수와 동일한 느낌.-->
	<!-- 원하는 값 입력 -->
	<c:set var = "product1" value = "<b> 애플 아이폰 </b>" />
	<c:set var = "product2" value = "삼성 갤럭시 노트" />
	
	<!-- EL형식으로 배열 지정, 에러는 무시 가능. -->
	<c:set var = "intArray" value = "${[1,2,3,4,5]}" /> 
	
	<!-- 출력하기, EL태그 사용하여 출력한다. 각 c:out에는 디폴트 값을 지정할 수 있다. escapeXml="true"인경우 일반 문자열로, 아니면 태그형태로 출력함. -->
	<p>
	product1(jstl) : <c:out value="${product1}" default = "not registered" escapeXml="true"></c:out>
	</p>
	<!-- 이렇게만 해도 된다 즉, c:out은 default 값이 필요하거나 escape가 필요할 때 사용한다.-->
	<p> product1(EL) : ${product1} </p>
	<p> product2(EL) : ${product2} </p>
	<p> intArray[0] : ${intArray[0]}</p>

	<h3>foreach 배열 출력</h3>
	<ul>
		<!-- 출력하고 싶은 배열 items에 붙이기, EL형태! -->
		<!-- for (int num : intArray) 와 동일함. -->
		<!-- varStatus : 상태정보 변수, 인덱스랑 횟수가 몇번 반복됐는지 보여주는 var의 현상태 -->
		<c:forEach var = "num" varStatus="i" items = "${intArray}">
			<li> ${i.index} : ${num} </li>
		</c:forEach>	
	</ul>
	<hr>
	<h3> if </h3>
	<!-- 오직 if만 쓸 수 있다는 점 유의. else if 안됨.-->
	<c:set var = "checkout" value="true"></c:set> <!-- 체크라는 변수에 true가 있다. -->
	<!-- if(checkout == true) 과 동일함. -->
	<c:if test="${checkout}">
		<p>주문제품 : ${product2}</p>
	</c:if>
	<!-- if(checkout !== true) 과 동일함. -->
	<c:if test="${!checkout}">
		<p>주문제품 아님</p>
	</c:if>

	<!-- empty? empty 뒤에 오는 값이 비어있는지 아닌지 체크를 함.  -->
	<c:if test="${!empty product2}">
		<b> ${product2} 가 이미 있음 !</b>
	</c:if>
	<hr>
	<h3> choose, when, otherwise</h3>
	<!-- if, elseif, switch와 비슷한거 -->
	<!-- when은 여러번 사용할 수 있다. switch문과 비슷하다! -->
	<c:choose>
		<c:when test="${checkout}">
		 	<p>주문제품 : ${product2}</p>
		</c:when>
		<c:otherwise>
			<p>주문제품 아님</p>
		</c:otherwise>
	</c:choose>

	<hr>
	<h3>forTokens</h3> <!-- 특정 문자열을 구분하고, 나눠주는! -->
	<!-- 나눈 데이터 값을 하나하나 받아주는 city, items : 데이터 입력, 
	delims : 나눌 구분선, varStatus 사용해서 인덱싱화 가능  -->
	<c:forTokens var="city" items="seoul|tokyo|new york|Toronto" delims="|" varStatus="i">
		<!-- 인덱스가 첫번쨰인 경우 true 반환. -->
		<!-- if(i.first == true) -->
		<c:if test="${i.first}"> 도시목록  </c:if>
		${city}
		<!-- 인덱스가 마지막이 아닐 경우 true 반환. -->
		<!-- if(i.last !== true) -->
		<c:if test="${!i.last}">,</c:if> 
	</c:forTokens>




</body>
</html>