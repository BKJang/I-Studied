<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
	class Category{
		String name;
		String mode;
		
		Category(String n, String m){
			name = n;
			mode = m;
		}
	}

%>
<%
	Category[] ctg = {new Category("�ִϸ��̼�", "ani"), 
					  new Category("����", "history"),
					  new Category("������", "sports")};

	for(Category o : ctg){
%>


<a href = "param01.jsp?mode=<%=o.mode %>"><%=o.name %></a>

<%}
%>


