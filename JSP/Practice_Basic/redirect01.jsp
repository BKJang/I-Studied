<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// �����̷�Ʈ������� ��ȯ
	// response ��ü�� �̿��ؾߵȴ�.
	
	if(Math.random()>0.5){
	response.sendRedirect("pageA.jsp"); //���������� ����� ����
	}else{
	response.sendRedirect("pageB.jsp");
	}

	System.out.println("redirect01.jsp");
%>