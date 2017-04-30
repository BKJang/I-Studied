<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.text.*" %>
<%
	String g = request.getParameter("gender");
	int n1 =Integer.parseInt(request.getParameter("num1"));	// 신장
	int n2 =Integer.parseInt(request.getParameter("num2"));	// 체중
	
	int n3 =Integer.parseInt(request.getParameter("num3"));	// 나이
	
	double dn1 = n1/100.0;
	
	double rst = n2/(dn1*dn1);
	DecimalFormat df = new DecimalFormat(".00");
	String srst = df.format(rst);
		
	String ment;
	if(rst <=18.5)
		ment ="저체중";
	else if(rst <=23.0)
		ment ="정상체중";
	else if(rst <=25.0)
		ment ="과체중";
	else
		ment ="비만";
	
	String gstr = g.equals("m") ? "남성" : "여성";
	
%>

<h2>건강도 체크 결과</h2>
당신은 <%=n3 %>세 <%=gstr %> .. 신장 <%=n1 %>cm , 체중<%=n2 %>kg ..<br/>
<b>분석결과</b>
신체질량지수는 <%=srst %>(<%=rst %>) 로 <%=ment %> 입니다.!
		


















