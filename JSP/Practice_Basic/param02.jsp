<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	String n1 = request.getParameter("num1");
	//	String n2 = request.getParameter("num2");
	int nn2 = Integer.parseInt(request.getParameter("num2"));
	String op = request.getParameter("op");
	int nn1 = Integer.parseInt(n1);
	int rst = -1;
	switch (op) {
	case "add":
		rst = nn1 + nn2;
		break;
	case "sub":
		rst = nn1 - nn2;
		break;
	case "mul":
		rst = nn1 * nn2;
		break;
	case "div":
		rst = nn1 / nn2;
		break;
	}
%>
<h2>param02</h2>
당신의 요청값 [operater=<%=op %>, num1=<%=nn1 %> , num2=<%=nn2 %>]<hr/>
요청 처리 결과값 <b style="color: blue"><i ><%=rst %></i></b>



























