<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%


%>
<script>
	alert("처리됨");//response때문에 실행이 안됨.
	history.back();//처리되고 나서 페이지 이동이 안일어나고 그 전페이지로 넘어간다.
	//※뒤로가기
</script>
<%
	//response.sendRedirect("index.jsp");
	//이 두개를 동시에 응용은 안됨.
%>