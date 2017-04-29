<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//포워드 방식으로 페이지 전환..
	//리퀘스트 객체를 이용한 작업
	RequestDispatcher rd = request.getRequestDispatcher("pageA.jsp?auth=true");
	rd.forward(request, response);
	//redirect의 경우엔 주소가 바뀌지만
	//forward는 바뀌지 않는다.
	
	//두줄로 치는게 귀찮다면..
//	request.getRequestDispatcher("pageB.jsp").forward(request, response);
	System.out.println("forward.jsp"); //남아있던 작업은 한다.
	
%>
포워드와 리다이렉트의 차이..?
리다이렉트는 재요청을 발생시키면서 페이지가 이동, (거의 대부분이 리다이렉트 지정이 될꺼다.)
포워드는 하나의 요청을 그대로 유지하면 페이지 전환

포워드를 쓰는 상황..?
하나의 경로로 여러페이지를 제어하고 싶을때..(웹툰 참고)
외부에는 실제 작동되는 페이지를 숨기고 싶을 때
실제 보여줘야되는 페이지 전에 어떤 처리를 해서 넘겨주고 싶을 때 
데이터 처리하는 페이지와 화면을 꾸미는 페이지를 나눠서 처리하고 싶을 때(MVC)