<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String[] ids = {"luffy", "zoro", "nami", "usop", "sanji"};
	
	
	for(int i=0; i<20; i++) {
		int n = (int)(Math.random()*5);	
		%>
		<input type="checkbox" /><%=ids[n] %><br/>
		<%
	}
%>

