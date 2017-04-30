<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<h2>건강도 체크</h2>
<form action="quizproc.jsp">
	남자 <input type="radio" name="gender" value="m"/>
	여자 <input type="radio" name="gender" value="f"/>
	<br/>
	신장 <input type="text" name="num1" size="12" placeholder="신장 입력(cm)"/>  
	체중 <input type="text" name="num2" size="12" placeholder="체중 입력(kg)"/>
	나이 <input type="text" name="num3" size="12" placeholder="나이 입력(만)"/>
	<input type="submit" value="계산"/>
	<hr/>
	<i>남녀 연령 구분에 따른 신체질량 지수 BMI(Body Mass Index)와 비만도를 측정해보세요.</i>
</form>