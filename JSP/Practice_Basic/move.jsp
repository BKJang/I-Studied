<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%

String p = request.getParameter("mode");
if(p.equals("a")){
	RequestDispatcher rd = request.getRequestDispatcher("src01.jsp");
	rd.forward(request, response);
}else if(p.equals("b")){
	RequestDispatcher rd = request.getRequestDispatcher("src02.jsp");
	rd.forward(request, response);
}else if(p.equals("c")){
	RequestDispatcher rd = request.getRequestDispatcher("src03.jsp");
	rd.forward(request, response);
}else if(p.equals("d")){
	RequestDispatcher rd = request.getRequestDispatcher("quiz.jsp");
	rd.forward(request, response);
}else{%>
	<script>
	alert("�߸��� �ּ��Դϴ�.");//response������ ������ �ȵ�.
	history.back();
	</script>
<% }%>



