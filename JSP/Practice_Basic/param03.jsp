<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>   
<%
	String[] ids = request.getParameterValues("id");
	int count = ids.length;
	Set<String> net = new TreeSet<String>();
	for(String  t  : ids){
		net.add(t);
	}
	int count2 = net.size();
	String nets = net.toString();
%>
<h2>param03.jsp</h2>
����� ��û������ ���� : <%=count%> <%=Arrays.toString(ids)%>
<hr/>
���� ó���� ���� : <%=count2%> <%=nets %>















