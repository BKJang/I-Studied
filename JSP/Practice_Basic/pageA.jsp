<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	String auth = request.getParameter("auth"); //�ʿ信 ���ؼ� �߰��������� ������ ��
	String p = request.getParameter("p"); //Ŭ���̾�Ʈ�� �ѱ�°�
	
%>

<h1>������ ����</h1>
���ּ���..<%=auth %> // �Ķ���� p ��<%=p %>