<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 리다이렉트방식으로 전환
	// response 객체를 이용해야된다.
	
	if(Math.random()>0.5){
	response.sendRedirect("pageA.jsp"); //브라우저에게 명령을 내림
	}else{
	response.sendRedirect("pageB.jsp");
	}

	System.out.println("redirect01.jsp");
%>