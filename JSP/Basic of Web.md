# Basic of Web

## URL

[Example]http://www.11st.co.kr/html/category/1.html?xzone=ctgr1^html

- 프로토콜 : http

- 서버 명 : www.11st.co.kr

- 경로 : html/category/1.html

- 쿼리 문자열 : ?xzone=ctgr1^html

## 웹 브라우저와 웹 서버

- 웹 브라우저 =>(1.www.11st.co.kr 의 IP주소 요청) DNS =>(2.IP주소 응답) 웹브라우저 =>(3.http://www.11st.co.kr/html/category/1.html 요청) => 웹 서버 =>(4.HTML 응답) 웹 브라우저

## HTML과 HTTP

```sh
# HTML(HyperText Markup Language) 문서 예시

<html lang="en">
  <head>
    <meta charset="utf-8">

<meta when-cross-origin" name="referrer" />
<title>BKJang (PaulJ)</title>
<body>
</body>
</html>

# HTML표준에 따라 문서로부터 알맞은 화면을 생성하는 과정을 렌더링(rendering)이라고 한다.
```

- HTTP에서 요청 데이터와 응답 데이터는 크게 '요청/응답 줄'. '헤더', '몸체' 세 개의 영역으로 구성


#### HTTP의 요청/응답 데이터의 구성 요소 

- 요청/응답 줄 : 요청 방식와 자원의 경로 지정 / 요청에 대해 200이나 404같은 응답 코드 전송

- 헤더 : 서버가 응답을 생성하는 참조할 수 있는 정보 전송 / 응답에 대한 정보를 전송(어떤 데이터인지, 길이는 어떤지)

- 몸체 : 정보를 전송해야 할 때 사용 / 웹 브라우저가 요청한 자원의 내용을 담는다.


## 정적 자원과 동적 자원

- 정적 자원 : 웹 브라우저는 파일이 바뀌지 않았다면 늘 같은 응답 데이터를 받으므로 동일한 화면을 출력, 이들 URL에 해당하는 자원이 정적(static) 페이지 또는 자원

- 동적 자원 : 조건에 따라 다른 응답 데이터를 전송하는 경우, 시간이나 조건에 따라 응답 데이터가 달라지는 자원(JSP, PHP, ASP등이 동적 웹 페이지를 만드는 기술)


## 웹 프로그래밍과 JSP

- JSP를 이용해서 만든 프로그램을 실행하려면 Tomcat이나 Jetty같은 서버 프로그램이 필요(Web Application Server), WAS

- WAS는 웹 브라우저로 부터 HTTP요청이 오면 알맞은 프로그램(JSP)을 찾아 실행하고 결과를 응답으로 웹 브라우저에 전송 

## Refer

[JSP 2.3 웹프로그래밍 by 최범균]