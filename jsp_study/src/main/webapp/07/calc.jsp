<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="calc" class="ch07.Calculator" />
<!--  ch07에 만들어져 있는 .java파일을 가져올건데, id가 calc
 Calculator cal = new Calculator; 와 동일함
-->

<jsp:setProperty name="calc" property="*" />
<!-- 쟤를 쓰는 순간 input에서 준 값들을 setter을 이용해서 calc객체에 넣어준다.
cal.setN1(request.getParameter("n1"));
cal.setN2(request.getParameter("n2"));
cal.setOp(request.getParameter("op")); 와 동일해진다.
* -> 모든 변수에 저거를 해주겠다는 의미.

입력받은 연산자가 calc로 넘어오면, 객체 생성, 셋팅을 다 해놓고 
마지막에 calc. usebean이용해서 Calulator 안에 calc가 작동하게 한다.
 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결과: <%=calc.calc() %>
</body>
</html>