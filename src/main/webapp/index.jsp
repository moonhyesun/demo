<!--
1. index.jsp 메인페이지를 localhost:8080 / 접속해서  페이지를 연결
2. servlet 통해서 index.jsp파일을 응답하는 프로그램
-->

<!-- text 파일로 html 형식으로 구성, 문자셋은 UTF-8, 페이지번역 UTF-8 -->
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html> <!-- 문서의 형식 html -->

<!-- html 장점 : 오류가 없음 -->
<html> <!-- 문서의 시작 태그 <> </> -->
<head> <!-- 머리글, 제목, css(모양), javascript(기능-유효성검사), meta로 구성 -->
    <title>JSP - Hello World</title> <!-- 웹페이지 제목 -->
</head>
<body> <!-- 본문 내용 -->
<h1> <!-- 헤드라인 제목태그 -->
    <%= "Hello World!" %> <!-- EL(HTML에서 변수를 사용할 수있게 도와주는 기능) -->
</h1>
<br/> <!-- 끊기(줄바꿈) -->
<a href="hello-servlet">Hello Servlet</a> <!-- 참조 링크 href="연결주소" -->
</body>
</html> <!-- 문서의 끝 -->