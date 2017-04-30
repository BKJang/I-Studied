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
	Category[] ctg = {new Category("애니메이션", "ani"), 
					  new Category("역사", "history"),
					  new Category("스포츠", "sports")};

	for(Category o : ctg){
%>


<a href = "param01.jsp?mode=<%=o.mode %>"><%=o.name %></a>

<%}
%>


