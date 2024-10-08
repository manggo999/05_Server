package snippet;

public class Snippet {
	<!DOCTYPE html>
	<html lang="en">
	<head>
	  <meta charset="UTF-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1.0">
	  <title>Servlet 프로젝트</title>
	</head>
	<body>
	  <h1>조미현</h1>
	  <h2>index 또는 default라는 이름의 html, jsp, htm 파일은 메인페이지 역할을 한다!</h2>
	  <h3>web.xml 파일을 확인해라~</h3>
	
	  <hr>
	
	  <h1>서버 제출 테스트1</h1>
	  <pre>
	    이름과 나이를 입력받아서 서버(Java 코드)로 제출
	
	    * 준비물 * 
	    
	    1) form 태그 : 내부에 작성된 input 값을 지정된 경로로 제출
	    - action : 제출할 경로
	    - method : 제출 방법(GET/POST) 기본값: GET
	
	    제출 == 클라이언트가 서버로 요청
	
	    2) input 태그 : 값을 입력하는 양식 제공
	    - name (*중요*) : 서버로 제출 시 key 역할
	    - value or 입력된값 : 서버로 제출 시 value 역할
	
	    <!--<input name="inputName" value="홍길동">-->
	
	    ?inputName=홍길동
	
	    ** GET : Get을 통한 요청은 URL 주소 끝에 파라미터로 포함되어 전송되며,
	    이부분을 query String 이라고 부른다.
	    방식은 URL 끝에 "?" 를 붙이고 그다음 변수명1=값1&변수명2=값2.....
	    ex) www.example.com/?name1=value1&name2=value2...
	    -> 서버에서는 name1과 name2라는 파라미터 명으로 각각 value1과 value2 파라미터 값을 전달받을 수 있다.
	
	    [장점]
	    - 단순함
	    - 캐싱 가능(주소 저장 == 북마크, 즐겨찾기, 주소 공유)
	
	    [단점]
	    - 요청데이터의 길이 제한이 있다.
	    - 보안에 취약하다(요청 데이터가 주소에 그대로 노출됨)
	
	  </pre>
	
	  <form action="/example1" method="get">
	    이름 : <input name="inputName">
	    <br>
	    나이 : <input type="number" name="inputAge">
	    <br>
	    <button type="submit">서버로 제출하기(==요청하기)</button>
	  </form>
	
	
	
	</body>
	</html>
}

