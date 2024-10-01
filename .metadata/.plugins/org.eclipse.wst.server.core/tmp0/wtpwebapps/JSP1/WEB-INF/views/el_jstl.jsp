<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL / JSTL 사용법</title>
</head>
<body>
	<h1>a태그 Get요청으로 응답받은 페이지</h1>
	
	<h1> EL (Expression Language) : 표현 언어</h1>
	
	<pre>
		<%-- 
			<%= %>
		
		--%>
		- JSP에서 표현식을 
		  간단하고 효율적으로 
		  작성할 수 있도록 고안된 언어
		  (JSP 내부에 기본 내장되어 있음!)
		  
		- Java 값을 HTML 형태로 쉽게 출력할 수 있다!
		
		- 기본 작성법 : \${key} (백슬래시는 제거하고 사용)
		
	</pre>
	
	<h3> 전달 받은 파라미터를 출력하는 방법 </h3>
	
	<p style="color: red;">
		주소 뒤에 쿼리스트링(?name=홍길동&age=20)
		직접 작성해보면서 테스트
	</p>
	
	<h4>1. Jsp 표현식</h4>
	<div>
		name : <%= request.getParameter("name") %>
		<br>
		age : <%= request.getParameter("age") %>
	</div>
	
	
	<h4>2. EL</h4>
	<%-- EL 특징 : null,NullPointException을 빈칸으로 처리 
				  get이라는 단어 사용하지 않는다.
	--%>
	<div>
		<%-- EL에서 파라미터 얻어오는 방법 : ${param.key} --%>
		name : ${param.name}
		<br>
		age : ${param.age} 
	</div>
	
	
	
	
	
	

</body>
</html>