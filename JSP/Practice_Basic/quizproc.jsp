<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.text.*" %>
<%
	String g = request.getParameter("gender");
	int n1 =Integer.parseInt(request.getParameter("num1"));	// ����
	int n2 =Integer.parseInt(request.getParameter("num2"));	// ü��
	
	int n3 =Integer.parseInt(request.getParameter("num3"));	// ����
	
	double dn1 = n1/100.0;
	
	double rst = n2/(dn1*dn1);
	DecimalFormat df = new DecimalFormat(".00");
	String srst = df.format(rst);
		
	String ment;
	if(rst <=18.5)
		ment ="��ü��";
	else if(rst <=23.0)
		ment ="����ü��";
	else if(rst <=25.0)
		ment ="��ü��";
	else
		ment ="��";
	
	String gstr = g.equals("m") ? "����" : "����";
	
%>

<h2>�ǰ��� üũ ���</h2>
����� <%=n3 %>�� <%=gstr %> .. ���� <%=n1 %>cm , ü��<%=n2 %>kg ..<br/>
<b>�м����</b>
��ü���������� <%=srst %>(<%=rst %>) �� <%=ment %> �Դϴ�.!
		


















