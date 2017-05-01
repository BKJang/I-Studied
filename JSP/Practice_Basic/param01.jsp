<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<h2>param01.jsp</h2>
<%
	String[] ar = {"루피","손오공", "강백호" };
	String[] br = {"이성계", "도쿠가와", "콜롬버스" };
	String[] cr = {"마이클조던", "타이거우즈", "박찬호" };
	
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
<b>요청값 : <%=m %></b>
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









