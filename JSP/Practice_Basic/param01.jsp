<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<h2>param01.jsp</h2>
<%
	String[] ar = {"����","�տ���", "����ȣ" };
	String[] br = {"�̼���", "������", "�ݷҹ���" };
	String[] cr = {"����Ŭ����", "Ÿ�̰ſ���", "����ȣ" };
	
	String[] pick = null;
	String output = "";
	String m = request.getParameter("mode");
	if(m.equals("ani")) {
		pick = ar;
	}else if(m.equals("history")) {
		pick = br;
	}else if(m.equals("sports")) {
		pick = cr;
		for(String tt : cr) {
			output += tt+" ";
		}
	}
%>
<b>��û�� : <%=m %></b>
<hr/>
<ul>
	<%for(String t :  pick) { %>
		<li><%=t %> !</li>
	<%} %>
</ul>
<ol>
	<%for(int i=0; i<pick.length; i++) { %>
		<li><%=pick[i] %> !</li>
	<%} %>
</ol>

<%=output %>









