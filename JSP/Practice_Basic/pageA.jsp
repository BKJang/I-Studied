<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	String auth = request.getParameter("auth"); //필요에 의해서 중간페이지에 설정한 값
	String p = request.getParameter("p"); //클라이언트가 넘기는것
	
%>

<h1>페이지 에이</h1>
샬롸샬롸..<%=auth %> // 파라미터 p 값<%=p %>