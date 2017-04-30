<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
<h2>계산기</h2>
<form action="param02.jsp">
수치1<input type = "text" size ="10" placeholder="정수입력" name = "num1" /> 
수치2<input type ="text" size ="10" placeholder="정수입력" name = "num2" /> <br/>
<input type = "radio" name = "op" value="add"/>덧셈 
<input type = "radio" name = "op" value="sub"/>뺄셈
<input type = "radio" name = "op" value="mul"/>곱셈
<input type = "radio" name = "op" value="div"/>나눗셈<br/>
<input type = "submit"/>
</form>