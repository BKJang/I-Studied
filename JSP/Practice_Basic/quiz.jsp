<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<h2>�ǰ��� üũ</h2>
<form action="quizproc.jsp">
	���� <input type="radio" name="gender" value="m"/>
	���� <input type="radio" name="gender" value="f"/>
	<br/>
	���� <input type="text" name="num1" size="12" placeholder="���� �Է�(cm)"/>  
	ü�� <input type="text" name="num2" size="12" placeholder="ü�� �Է�(kg)"/>
	���� <input type="text" name="num3" size="12" placeholder="���� �Է�(��)"/>
	<input type="submit" value="���"/>
	<hr/>
	<i>���� ���� ���п� ���� ��ü���� ���� BMI(Body Mass Index)�� �񸸵��� �����غ�����.</i>
</form>