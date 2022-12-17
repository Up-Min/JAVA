<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<!-- View 제작 2. -->
		<h2>상품정보 조회</h2>
		<hr>
		<ul>
		<li>상품코드 : ${p.id}</li>
		<li>상품명 : ${p.name}</li>
		<li>제조사 : ${p.maker}</li>
		<li>가격 : ${p.price}</li>
		<li>등록일 : ${p.date}</li>
		</ul>
		<!-- p? 아까 만들었던 객체 안에 들어가있는 자료임. -->
		<!-- 엥 근데 어떻게 list에 있는게 info로 넘어옴? -->
		<!-- 상세페이지는 하나만 보여주면 되니까 모두 전부를 보여줄 필요는 없다.
		모델에게 id를 주면서 id에 해당하는 자료를 달라고 controller 가 model에 요청한다 
		그리고 받은 데이터를 productinfo가 여기로 보내서 넣어준다.-->
</body>
</html>