<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//리다이렉트 방식으로 전환유도.
	//자바스크립트라는걸 이용할 수도 있다.
	//소스가 작동하다보니 페이지가 바뀌는 거임
%>
<script>
	alert("처리됨!");
	location.href="pageB.jsp"; //문서가 해석하다보니까 이동이 처리.
</script>
<%
	//response.sendRedirect("pageA.jsp"); //이건 브라우저가 받아서 처리.
	//결과값은 pageA를 불러온다.
%>