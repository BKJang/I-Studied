<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//������ ������� ������ ��ȯ..
	//������Ʈ ��ü�� �̿��� �۾�
	RequestDispatcher rd = request.getRequestDispatcher("pageA.jsp?auth=true");
	rd.forward(request, response);
	//redirect�� ��쿣 �ּҰ� �ٲ�����
	//forward�� �ٲ��� �ʴ´�.
	
	//���ٷ� ġ�°� �����ٸ�..
//	request.getRequestDispatcher("pageB.jsp").forward(request, response);
	System.out.println("forward.jsp"); //�����ִ� �۾��� �Ѵ�.
	
%>
������� �����̷�Ʈ�� ����..?
�����̷�Ʈ�� ���û�� �߻���Ű�鼭 �������� �̵�, (���� ��κ��� �����̷�Ʈ ������ �ɲ���.)
������� �ϳ��� ��û�� �״�� �����ϸ� ������ ��ȯ

�����带 ���� ��Ȳ..?
�ϳ��� ��η� ������������ �����ϰ� ������..(���� ����)
�ܺο��� ���� �۵��Ǵ� �������� ����� ���� ��
���� ������ߵǴ� ������ ���� � ó���� �ؼ� �Ѱ��ְ� ���� �� 
������ ó���ϴ� �������� ȭ���� �ٹ̴� �������� ������ ó���ϰ� ���� ��(MVC)