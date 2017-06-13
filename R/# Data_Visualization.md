# Data Visualization

## Purpose & Function

- 데이터 분석 목적을 위한 데이터의 탐색(EDA)

- 데이터 분석 결과 공유를 위한 보고서의 시각화

- Communication : 메시지를 빠르고 쉽게 전달

- Insight : 이미 알고 있는 것에 대한 통찰력을 얻음

- Discovery : 새로운 사실관계 발견, 많은 양의 정보를 표현


[Example]

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfOSAg/MDAxNDk1NTg2MTgwNjg5.DEE1hAqAqV3jNcMQPl1WlLRo8gapvmBjLnFF1YDm8zYg.uw8SMfdkhA9WTFSYd5T8ZWq7ZMJ5LxavYKem842lkRUg.PNG.jp302119/tabplot.png)

```sh

> install.packages("tabplot")

> library(tabplot)

> load(url('http://biostat.mc.vanderbilt.edu/wiki/pub/Main/DataSets/titanic3.sav'))

> titanic <- titanic3[,c("pclass","survived","sex","age","sibsp","parch","fare","embarked")]

> titanic$survived <- factor(ifelse(titanic$survived,"YES","NO"))

> tableplot(titanic)

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMjE1/MDAxNDk1NTg2MTgwNTgx.I7JFj_lJ2-ZsKHxCsAPmW7fAxhhmB-QF2TxqVFBcJtsg.RWgcbAj-rjV11boG3HMlof2zz7KBuA9jb2iJH8_zvMwg.PNG.jp302119/corrplot.png)

```sh

> install.packages("corrplot")

> library(corrplot)

> cars <- cor(mtcars)

> corrplot(cars, order = "hclust", addrect = 3, mar = c(4, 0, 4, 1))

```

## 데이터의 종류

#### 측정 값의 일반적 분류

- 이산형 변수 : 이산형 데이터, 범주형 데이터(논리형, 정수형)

- 연속현 변수 : 연속형 데이터, 연속형 벼수도 이산형화가 가능(수치형)


#### 측정 방법에 따른 분류

- 명목 데이터 : 측정 값이 명명 될 수 있는 데이터(남, 녀)

- 서열 데이터 : 순서에 의해 특정된 데이터(석차, 저소득, 중간소득, 고소득)

- 등간 데이터 : 순서 + 크기정도 But 수치간의 비율은 의미가 없음(온도 - 30도가 15도 보다 2배 덥지 않다)

- 비율 데이터 : 순서 + 크기정도 + 수치간의 비율 관계 성립(체중)


## 데이터의 시각화 방법

#### 한 변수에 대한 그림

- 막대 그림 : 이산형, 범주형 변수의 데이터 값에 대한 빈도 수

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTky/MDAxNDk1NTg2OTk1Njcw.rXo8D-KmSTpHXA18lwQ_UZd5AUe7map5K1owrOzAV8kg.3t51DQRzmU-JJIvCW862e-WZ7K8bM60FxzfFer40f4gg.PNG.jp302119/%EB%A7%89%EB%8C%80%EA%B7%B8%EB%A6%BC.png)

- 원 그림 : 원을 도수의 비례하게 조각으로 나누어 그린 그림

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMjEz/MDAxNDk1NTg2OTk3MTM4.tbXtaZnlHh8jPQtNJecRc2BaLVeNNDjhYHUwrZHW1ykg.7jRsA7vxeZFAFQc2tgJYO4hnwsLv5lqyH4fMN7IT9vAg.PNG.jp302119/%EC%9B%90%EA%B7%B8%EB%A6%BC.png)

- 히스토그램 : 연속형 변수를 여러 계급 구간으로 나누어 도수분포표 그림

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMjEg/MDAxNDk1NTg2OTk3NDE3.25SX8hsiNe03e2qXpJxgwqqQ_wUCu7fN06WxbEFX-mkg.5g-M7rX8YGOKX2Z2pZv0Xw3i6uJ2SvBfK0TyWAFJjpsg.PNG.jp302119/%ED%9E%88%EC%8A%A4%ED%86%A0%EA%B7%B8%EB%9E%A8.png)


#### 두 변수에 대한 그림

- 선그림, 시계열 그림 : x축, y축 각각 변수의 관찰 값을 좌표로 하여 선을 그림

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTQ4/MDAxNDk1NTg2OTk2OTY2.x63Ioul0toLw4Ho6ta8OAkBRzEdB0zW9s5LAOYnH23wg.T5zrm6pIzXieettsFh7UFXIkn_cFtysQHjyebWPslEUg.PNG.jp302119/%EC%84%A0%EA%B7%B8%EB%A6%BC.png)

- 산점도 : x축, y축 각각 변수의 관찰 값을 좌표로 하여 점을 그림

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfODcg/MDAxNDk1NTg2OTk2Njg1.PHyoQ-blOHQeh52OeI1v6HvJ2VEEqFzcgziDybrUoKcg.PK6zIESw55iqq5SpoSCh7ntuc3eddBgvJ8Kmn2_Ulcwg.PNG.jp302119/%EC%82%B0%EC%A0%90%EB%8F%84.png)


#### 다중 변수에 대한 그림

- 산점도 행렬 : 여러 개의 변수 쌍에 대한 산점도

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfNDYg/MDAxNDk1NTg2OTk2NDU1.5kzx33dZRFqrWJIz9IQexbv5-swM697CGdEPxBQpj20g.tBLk9VmlTuxfA3HJTbQGW9Sdm0Ja-7X-QulL07Nj4j0g.PNG.jp302119/%EC%82%B0%EC%A0%90%EB%8F%84_%ED%96%89%EB%A0%AC.png)

- 모자이크 그림 : 이산형 데이터의 다차원 도수분포표를 변수 별로 비교 가능

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMjcg/MDAxNDk1NTg2OTk2MTAz.6deRYg6fr0dltauNEoYl1xDbixKFbCD17Fd8noEJQAMg.AwVbjWhoX4yaneWM4iXyEaL26f31M7WkRM_trr6t9jcg.PNG.jp302119/%EB%AA%A8%EC%9E%90%EC%9D%B4%ED%81%AC.png)

- 레이터 차트, 평행좌표 그림, 체르노프 안형 그림


## 고수준 시각화 함수

- 그래픽 장치 위에 파이차트나 막대 그래프와 같이 독립된 시각화 표현을 하는 함수

- 저수준 그래픽을 적절하게 조합하여 구현

## 저수준 시각화 함수

- 그래픽 장치 위에 점을 찍고 선을 그리고 다각형을 그리는 등의 기능을 하는

- 즉, 시각화를 구현하기 위해 R에서 제공하는 기초 함수

![Markdown Here logo](http://postfiles9.naver.net/MjAxNzA1MjRfMTYy/MDAxNDk1NTg5MjU5MjY1.NcctaHAoo1pt9Rj8Q7OBOD6B5ElzOHUQ5mDPAq64X0kg.r8ohSUzE0FKZtIzbN3XRoMfDw4enIlB92peyaSSTXC0g.PNG.jp302119/plot.png?type=w2)

```sh

#고수준 시각화 함수

> z<-lm(mpg~wt, data=mtcars)  # dist, speed 

> plot(mtcars$wt, mtcars$mpg) # 저수준 시각화 함수   

## 추세선

> abline(h=20) # Y축 접선
> abline(h=30) # Y축 접선


> abline(v=3, col="blue") # x축 접선


> abline(z, lty=2, lwd=2, col="green") # lty = 선 모양, lwd = 선 굵기, col = 선 색
> abline(z, lty=3, lwd=2, col="red")

```

#### 저수준 시각화 함수 Functions

grid(nx,ny) : 현재 plot에 x축과 y축을 나누는 격자를 그림

axis(side n,) : plot의 축 정보를 더 추가함, 1은 하단 x축, 2는 좌측 y측, 3은 상단 x축, 4는 우측 y축

box(which=,) :현재 plot이나 figure 또는 plot 바깥쪽에 추가적인 box를 그림. 여러 graphic parameter 인수를 적용 가능함. which는 “plot”,“figure”,“inner”,“outer”의 인수를 줄 수 있음

legend(x축 위치, y축 위치, 내용,) : 현재 plot에 범례를 추가. (x,y)의 위치에 범례를 생성

arrow(x,y) : 화살표를 추가.

lines(x,y)/points(x,y) : 선, 점들을 추가. points 한정으로 type을 “p”,“b”,“l” 등을 줄 수 있음

abline(a,b) or abline(h= or v=) : 현재 plot에 선을 추가함. lines와 다른점은 넘겨주는 값이 a=y절편, b=기울기 임. h(horizontal) 값을 주면 x축과 평행하는 선을, v(vertical) 값을 주면 y축과 평행하는 선을 그림

segments(x0,y0,x1,x2) : (x0,y0)인 점과 (x1,y1)인 점을 잇는 선을 그림

polygon(x,y) : 벡터 x와 y로 정의된 폴리곤을 그림

text(x,y,“note”) : x,y의 위치에 “note”라는 글을 씀


![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTgw/MDAxNDk1NTkwMDY1NDYw._XLtwXgm9f0Hu5wfBd6HqNR1k3nCzz216UgtXrBVL2Eg.Ogi6HryTeDHnXAtIG9_r9puw3yhFptUKNvxRUzgalsYg.PNG.jp302119/plot2.png)

```sh

> plot(1:15)

> grid(15,3)

> box("plot", col="red")

> abline(h=8, col="red")

> abline(v=5, col="blue")

> rect(1, 6, 3, 8)

> segments(1, 1, 5, 5, col="purple") # (1,1)~(5,5)

> text(8, 9, "Test", srt =45)

> legend(12, 5, c("h=8", "v=5", "segments", "arrows"), cex=0.9, col=c("red", "blue")) # 범례 생성

```

![Markdown Here logo](http://postfiles12.naver.net/MjAxNzA1MjRfODgg/MDAxNDk1NTkwNzc1NzAx.lNECjzu-BgpHaW_JPGTgPb2c3u0rMOvTCKZJPLNTZzYg.D-zp8c1EwVWw67UvTctQxyfSZHteSf0U2Wzwu-O4qDQg.PNG.jp302119/1.png?type=w2)

```sh
> var1<- 1:5

> plot(var1)

```

![Markdown Here logo](http://postfiles2.naver.net/MjAxNzA1MjRfMjU2/MDAxNDk1NTkwNzc1OTc4.ZN_Mui4ymC7ICYmyGHlCGL68ZEar8VsZibOI-Z6UJfcg.l0QlecSyLzG3HrJtJhsCTZJRq1NibF3WB6YkUOvsVx0g.PNG.jp302119/2.png?type=w2)

```sh
> var2<-rep(2,5)

> plot(var2)

```

![Markdown Here logo](http://postfiles6.naver.net/MjAxNzA1MjRfMTU4/MDAxNDk1NTkwNzc2MjI0.21dl-9QmyabPhVC-uBxjlEpLljMDnI-vl-p5K8UzM3cg.goVchK5NRV_N7-cGSCAN_uuZYPx7544_P8i9PgXapB4g.PNG.jp302119/3.png?type=w2)

```sh
> x<-1:5

> y<-5:1

> plot(x,y)

```

![Markdown Here logo](http://postfiles11.naver.net/MjAxNzA1MjRfMzAw/MDAxNDk1NTkwNzc2NTUx.GiBTQvAMFipTevLaGR3WIq2PMdCpI6Hdw3hKRS2NksUg.CDtuZUnZpuK2qQNxVCpiPfS9X9VagMNo84wqcMl00f4g.PNG.jp302119/4.png?type=w2)

```sh
> x<-1:5

> y<-5:1

> plot(x,y,xlim=c(1,10),ylim=c(1,5))

```

![Markdown Here logo](http://postfiles12.naver.net/MjAxNzA1MjRfMTk3/MDAxNDk1NTkwNzc2ODUy.0r6PBMBu6gWL5VmqKLhcWzplpeP5DfZih1Idu1mUVYIg.mkspt9zRASr2vGHDylQSkhplKdcM3u9YAN25XnA60cIg.PNG.jp302119/5.png?type=w2)

```sh
> x<-1:5

> y<-5:1

> plot(x,y,xlab="X축",ylab="Y축",main="test Plot")

```

![Markdown Here logo](http://postfiles11.naver.net/MjAxNzA1MjRfMTAx/MDAxNDk1NTkwNzc3MTE5.ScLitdFyqApicDvRBTyLwrL2QVR_B-zcM-mss9W3rxog.WgCfevRTGCXoNXI_4gto-yFu2xDRij3vHkj92bwZK54g.PNG.jp302119/6.png?type=w2)

```sh
> v1 <- c(100,130,120,160,150)

# line chart 그리기
> plot(v1,type="o",col="red",ylim=c(0,200),axes=F,ann=F)

# x축 그리기
> axis(1,at=1:5,lab=c("Mon","TUE","WED","WHU","FRI"))

# Y축 그리기
> axis(2,ylim=c(0,200))

# title
> title(main="FRUIT",col.main="red",font.main=4)
> title(xlab="DAY",col.lab="blue")
> title(ylab="PRICE",col.lab="green")

```

![Markdown Here logo](http://postfiles11.naver.net/MjAxNzA1MjRfMjU4/MDAxNDk1NTkwNzc3NDI3.1f-OUYKtw3AfdV9WapwcTSkX2eCjy6VILroW_j2cndkg.H_zdvi6mgxypKDvGn5qM4uF0SyWA8l4H7UKixzVgbicg.PNG.jp302119/7.png?type=w2)

```sh

> par(mfrow=c(1,3))

> plot(v1,type="o")

> plot(v1,type="s")

> plot(v1,type="l")
```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfNzIg/MDAxNDk1NTkxMzAzMzg4.8CvNo4huM2GTI8V88UBPdYyayX7nVMJGIb5UxC0KqkIg.LAzI5W4kMXueROVuDedIFBiAtLBQ4takpSD3IXJ4EzYg.PNG.jp302119/11.png)

```sh
> par(mfrow=c(1,1))

> plot(v1,type="o")

> plot(v1,type="s")

> plot(v1,type="l")

```

![Markdown Here logo](http://postfiles15.naver.net/MjAxNzA1MjRfMjkw/MDAxNDk1NTkwNzc3ODQw.37PhgvkjEbvsCQa74T1ZXK2iA9DZ3aRvYMBtlH_ZOWwg.n-AqTe0TsqYr7To9Z2JwdNWhq_07m_rm4VBTTfWD0Egg.PNG.jp302119/8.png?type=w2)

```sh
> v1<-1:5

> v2<-5:1

> v3<-3:7

> plot(v1,type="o",col="red")

#그래프 중첩 명령어, default는 F
> par(new=T)

> plot(v2,type="l",col="blue")

> par(new=T) 

> plot(v3,type="s",col="yellow")

```

![Markdown Here logo](http://postfiles16.naver.net/MjAxNzA1MjRfMTU1/MDAxNDk1NTkwNzc4MTg5.kcg83SREK-uL6vwF0O3zk5YJmTYR34FndslagvtJvf4g.butsfiDqm-j73CXGNRQ1LGBCT8fkarPFzlEk0sqDi3Eg.PNG.jp302119/9.png?type=w2)

```sh
> plot(v1,type="o",col="red",ylim=c(0,10))

> lines(v2,type="l",col="blue")

> lines(v3,type="s",col="yellow")

```

![Markdown Here logo](http://postfiles7.naver.net/MjAxNzA1MjRfMTc0/MDAxNDk1NTkwNzc4NDg1.JjhGoC8qqs4FvBvFzy5AvujVN_aFu15pYBrLNT2417kg.oWsHzdzUWJk3vItdxq4j1zR24a3AcrO_dBPzNwkBwH8g.PNG.jp302119/10.png?type=w2)

```sh
> plot(v1,type="o",col="red",ylim=c(0,10))

> lines(v2,type="l",col="blue")

> lines(v3,type="s",col="yellow")

> legend(4.5,10,c("V1","V2","V3"),cex=0.9,col=c("red","blue","yellow"),lty=1

```

#### barplot

- 막대 그래프

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTMz/MDAxNDk1NTkxNzM4Njky.crxR6i3UHd_FbzXhIea9aYG_X0DNYYeg9Z-ThYAqvVog.c7dVdVisluBkE0lA4_d2L4-wDp6n8baYkTak3Koo01gg.PNG.jp302119/a.png)

```sh
> x<-1:5

> barplot(x)

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTk1/MDAxNDk1NTkxNzM4OTA2.9kXxgJL3xrTufcZkVm0uSqCZ5g2P1tG60ujs-m6S4AAg.foXNtTQ_zN40QBXDBxZe3_KqWiqS9ubAgeHBAjQ7l08g.PNG.jp302119/b.png)

```sh
> barplot(x,horiz=T)

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTU3/MDAxNDk1NTkxNzM5MDY4.j0cWhqjo-TBJc1_55gmLBEkvYYbtCSMUC75BVyD3UL4g.VMLNAN9NCxh5U_bZBAJ5p6rSNquSSKYVB3Xrzor1H_Eg.PNG.jp302119/c.png)

```sh
> x<- matrix(5:2,2,2)

> x

#      [,1] [,2]
# [1,]    5    3
# [2,]    4    2

> barplot(x,beside=T,names=c(5,3),col=c("green","blue"))

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTU3/MDAxNDk1NTkxNzM5MDY4.j0cWhqjo-TBJc1_55gmLBEkvYYbtCSMUC75BVyD3UL4g.VMLNAN9NCxh5U_bZBAJ5p6rSNquSSKYVB3Xrzor1H_Eg.PNG.jp302119/c.png)

```sh
> barplot(x,names=c(5,3),col=c("green","blue"),ylim=c(0,12))

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTkw/MDAxNDk1NTkxNzM5NDgz.ew9HF6m1_aYc1LJ7Ar9HMY-BtmIb7nnDcIUYgd54W6Ag.Y6wKdPth6iCWfEUfjA0BbaPigIvMu7iEvU_bFSjBnQYg.PNG.jp302119/e.png)

```sh
> x <- matrix(c(5,4,3,2),2,2)

> barplot(x,names=c(5,3),beside=T,col=c("green","yellow"),horiz=T)

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfNTQg/MDAxNDk1NTkxNzM5NjY5.RXaPTfW_p0JZTVFiK3SJqQNPi6joQQyreg817KSTqNUg.lNdZBbGVl60tfCiKsUr7lwBqITvaf-UkkFMV4PBkU9gg.PNG.jp302119/f.png)

```sh
> x <- matrix(c(5,4,3,2),2,2)

> barplot(x,horiz=T, names=c(5,3),col=c("green","yellow"), xlim=c(0,12))

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMjkw/MDAxNDk1NTkxNzM5OTU1.4SOsKhXuy2xG6M5sY-iSM-bA6orYn8krQzgr1Ko0DUcg.zSBiEKqBWgJ-pfWlsTMpavVssOuFzWSx60l9hyl945Ig.PNG.jp302119/g.png)

```sh
> v1 <- c(100,120,140,160,180)

> v2 <- c(120,130,150,140,170)

> v3 <- c(140,170,120,110,160)

> qty <- data.frame(BANANA=v1,CHERRY=v2,ORANGE=v3)

> qty

#   BANANA CHERRY ORANGE
# 1    100    120    140
# 2    120    130    170
# 3    140    150    120
# 4    160    140    110
# 5    180    170    160

> barplot(as.matrix(qty),main="Fruit's Sales QTY", beside=T,col=rainbow(nrow(qty)),ylim=c(0,400))

#범례
> legend(14,400,c("MON","TUE","WED","THU","FRI"),cex=0.8, fill=rainbow(nrow(qty)))

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTQ4/MDAxNDk1NTkxNzQwMjI1.SsBychqEEtnmL0ghiS6r2W1v9awmgGwLYPRYNNNO5Gkg.4epahDmuaTSQOEMv5IIWgzqts9PKNHYzWx1ZkssF008g.PNG.jp302119/h.png)

```sh
> barplot(t(qty),main="Fruits Sales QTY",ylim=c(0,900),
	col=rainbow(length(qty)),space=0.1,cex.axis=0.8,las=1,
        names.arg=c("MON","TUE","WED","THU","FRI"),cex=0.8)

#범례
> legend(0.2,800,names(qty),cex=0.7,fill=rainbow(length(qty)) )

```

#### boxplot

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMyAg/MDAxNDk2MTg5NzkyMDU5.JmQuc9IOQb4e1-P_DWv_Njmg0aQnpeK_YtkSEN47HJwg.aYdqa2otWHg71WlTVQTkqQZsCsNHYIOHFbJwocFjtJYg.JPEG.jp302119/11.jpg)

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMjc3/MDAxNDk2MTg5NjIyMDc2.UW_1rsZxFr2dh0YwZhLR8dTPe1Ns3cUojdRjdE923D0g.im_mgEV0jHetCjYsHgz1nwmCPcn3776Pd8gy-QBOX2wg.PNG.jp302119/1.png)

```sh

> v1 <- c(sample(1:10, 200, replace=T), 20)

boxplot(v1)

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMjY5/MDAxNDk2MTg5NjIyNDE0.cPuWjZHvlTgUoSNAUEJUnQK5hZbCb5qkOcaZn7Dh2Kgg.bQTv3xEoHn0gttPCgv61BkTc8RKV8YNowDCfjw3bDu0g.PNG.jp302119/2.png)

```sh

> v1 <- c(sample(1:10, 200, replace=T), 20)

> v2 <- sample(1:20, 200, replace=T)

> boxplot(v1, v2)

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMTQ5/MDAxNDk2MTg5NjIyNTky.UZE7MHWx5l1mUbCPCZmSGfoEd1S4a7Tz0T5ZErKLw8Ug.7YMxR7Cod05vdQLgUAT3O3oqisgur0b5OqBCRZJI8Y0g.PNG.jp302119/3.png)

```sh

> v1 <- c(sample(1:10, 200, replace=T), 20)

> v2 <- sample(1:20, 200, replace=T)

> v3 <- c(sample(10:20, 200, replace=T),-10)

> lst <- list(v1, v2, v3)

> boxplot(lst)

```

- 다변량, 식 사용

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMjUg/MDAxNDk2MTg5NjIyNzg2.x0ouo_Z-jmCPp937ZTGpoK0WXMrJSh9jQxIMjqR_3tIg.dt6FwoQSu8wDCHi-UsKwwDDGje2BskHudcTUNIc8iD8g.PNG.jp302119/4.png)

```sh

> head(ToothGrowth)

#    len supp dose
# 1  4.2   VC  0.5
# 2 11.5   VC  0.5
# 3  7.3   VC  0.5
# 4  5.8   VC  0.5
# 5  6.4   VC  0.5
# 6 10.0   VC  0.5

> boxplot(len~dose, data=ToothGrowth)

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMjYw/MDAxNDk2MTg5NjIzMDEx.Rk8ARw889XRSxS9BE6428TNg4lTUCIBbdH9Vdu6xKMQg.Sf25fsCIwiMQVfH2nFLxrS5e-7b0G6MzWrRqz2C87-og.PNG.jp302119/5.png)

```sh

> head(ToothGrowth)

#    len supp dose
# 1  4.2   VC  0.5
# 2 11.5   VC  0.5
# 3  7.3   VC  0.5
# 4  5.8   VC  0.5
# 5  6.4   VC  0.5
# 6 10.0   VC  0.5

> boxplot(len~dose+supp, data=ToothGrowth)

```

- subset 사용

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMTg5/MDAxNDk2MTg5NjIzMjk2.EvNQt5SVnJgIUTZMMTr3UHfTX5hOHCGGpsC3H4tp3Ig.0R9bKOmE7AeijvHg_2E3XLcGXJ50CWRt1peptmTGGc4g.PNG.jp302119/6.png)

```sh

> head(ToothGrowth)

#    len supp dose
# 1  4.2   VC  0.5
# 2 11.5   VC  0.5
# 3  7.3   VC  0.5
# 4  5.8   VC  0.5
# 5  6.4   VC  0.5
# 6 10.0   VC  0.5

> boxplot(len~supp=="VC", data=ToothGrowth) # supp이 VC==T와 VC==F 

둘로 나눈다.

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMjM3/MDAxNDk2MTg5NjIzNTM1.zB-oixf9DXM5RVyfYTZqt5mLbpwlnnDRYqWfU-3SppIg.UNSJ0Z8TWLvYGbTZhKtEn8QA46nraWJoek9a51WDuRUg.PNG.jp302119/7.png)

```sh

> head(ToothGrowth)

#    len supp dose
# 1  4.2   VC  0.5
# 2 11.5   VC  0.5
# 3  7.3   VC  0.5
# 4  5.8   VC  0.5
# 5  6.4   VC  0.5
# 6 10.0   VC  0.5

> boxplot(len~dose, data=ToothGrowth, subset=supp=="VC") # subset

을 하면 supp==VC인 애들만 대상이 된다.

```

- border, col 사용

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMjI4/MDAxNDk2MTkwNDY5Mjg0.QnBqBU8cEjtqKxT5NK1CvJDCVR48wH1fdkr4sDVlpDAg.XQDdhxxm4QIcR7wih8wKYYHpP-Y5FWmoFsx89ywLSkEg.PNG.jp302119/15.png)

```sh

> x <- 1:5

> boxplot(x, border="magenta", col=c("lightblue"))

```

#### Histogram

- 히스토그램이란 특정 데이터의 빈도수를 막대 모양으로 표현한 것(도수분

포표)

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMjY1/MDAxNDk2MTkxMDM4Mzk2.uL43j26oaHwaU4WJApX5IkN2_zm-xIAq073pioVQw9wg.IcoV_EaulxMFXlw_dPXX7QQaFM0UuPxCmw7c0zWrhDQg.PNG.jp302119/44.png)

```sh

> height <- c(182,175,167,172,163,178,181,166,159,155)

> hist(height,ylim=c(0,5),labels = T,main="histogram of height") 

# labels = T : 범주의 갯수를 넣는다.
# ylim = C(0,5) : Frequency를 0부터 5까지로 설정

```

#### Pie Chart

- 파이 차트는 각 범주가 데이터에서 차지하는 비율을 나타내는 데 사용할 

수 있는 그래프

- 파이는 조각으로 나뉘고, 각 조각은 데이터의 범주를 나타낸다

- 조각의 크기를 비교 및 대조하여 각 범주의 상대적인 크기를 평가

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMTA4/MDAxNDk2MTkxMTk5MjEz.ma5q-IVkkDo8F3dZ7Xa5_4LKOAp3vmitKqCeC0nRLsgg.Bm2dwfbUasSi5aiugF_RsS3DOLTjh2Lo330tU6JwYPkg.PNG.jp302119/16.png)

```sh

> p1 <- c(10,20,30,40)

> pie(p1,radius=1)

```

- 시작 각도를 90도로 지정

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMTE2/MDAxNDk2MTkxMTk5Mzg0.0dTL27D0A4ws9oN7nsXVAZDD2GAD3JXlN2Ucm007uwIg.ra30TFUXs-_6VoUzIePHYmnWqL_4dKHCpuJ3jBTUcUcg.PNG.jp302119/17.png)

```sh

> pie(p1,radius=1,init.angle=90)

```

- 색깔과 label명을 지정

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfNDgg/MDAxNDk2MTkxMTk5NTYz.-I2R5M3Loi2B2Nwb26JPERvKkrsUZ1GX_sxHi_es44Mg.GU0wGLbH-IU64jehTC6Z1HVvzLjK_d8M6JeMu19AfOog.PNG.jp302119/18.png)

```sh

> pie(p1,radius=1,init.angle=90,col=rainbow(length(p1)), label=c

("Week 1" ,"Week 2" , "Week 3" ,"Week 4"))

```

- 수치 값을 함께 출력

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMjkg/MDAxNDk2MTkxMTk5NzM4.KPkwMc8AHiAlP9Om1KKdmZNs19q7RNHcrqUMg3Qp-Hcg.WMaytZ2YDs1ylz_kaYak_OqF45UZAJerplkR_jSHiB8g.PNG.jp302119/19.png)

```sh

> pct <- round(p1/sum(p1) * 100,1)

> lab <- paste(pct," %")

> pie(p1,radius=1,init.angle=90,col=rainbow(length(p1)), 

label=lab)

> legend(1,1.1,c("Week 1","Week 2","Week 3","Week 4"), 

cex=0.5,fill=rainbow(length(p1)))

```

- 범례를 생략하고 그래프에 바로 출력

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfMTg3/MDAxNDk2MTkxMTk5OTQx.Bwec8UNrw7v15SG2_G663W7M1-sAVebxOqxSyYMimSkg.tWalnyR0UnMq7Pw6ZiEqktmuYszVAuiBAU3s29xWv30g.PNG.jp302119/20.png)

```sh

> pct <- round(p1/sum(p1) * 100,1)

> lab1 <- c("Week 1","Week 2","Week 3","Week 4")

> lab2 <- paste(lab1,"\n",pct," %")

> pie(p1,radius=1,init.angle=90,col=rainbow(length

(p1)),label=lab2)

```

#### pairs 산점도 행렬

- 각 변수별로 산점도를 그려보는 시각화 방법

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MzFfODAg/MDAxNDk2MTkyMTMwMDQ2.8QzvYKnWLJ6VXacGEmI-MQ2aoAjTkebhssGjVB6TKGog.DHaG_mTCnP8hZjjqUyYeRx6-CcwHShrpo9I2Fmnt2lgg.PNG.jp302119/22.png)

```sh

> head(iris)

#   Sepal.Length Sepal.Width
# 1          5.1         3.5
# 2          4.9         3.0
# 3          4.7         3.2
# 4          4.6         3.1
# 5          5.0         3.6
# 6          5.4         3.9
#   Petal.Length Petal.Width Species
# 1          1.4         0.2  setosa
# 2          1.4         0.2  setosa
# 3          1.3         0.2  setosa
# 4          1.5         0.2  setosa
# 5          1.4         0.2  setosa
# 6          1.7         0.4  setosa

> unclass(iris$Species) # Species의 값을 숫자로 표현

#   [1] 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
#  [17] 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
#  [33] 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
#  [49] 1 1 2 2 2 2 2 2 2 2 2 2 2 2 2 2
#  [65] 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2
#  [81] 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2
#  [97] 2 2 2 2 3 3 3 3 3 3 3 3 3 3 3 3
# [113] 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3
# [129] 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3
# [145] 3 3 3 3 3 3
# attr(,"levels")
# [1] "setosa"     "versicolor"
# [3] "virginica" 

> pairs(iris[1:4], main = "Iris", pch=21, bg=c("red", "green", 

"blue")[unclass(iris$Species)]) # Species가 1(setosa)이면 red, 2

(versicolor)면 green, 3(virginica)이면 blue

```

## 탐색적 데이터 분석(EDA)

### 왜 필요한가?

- 데이터를 다양한 각도에서 관찰하고 이해하기 위한 과정

- 데이터 분석을 위한 전처리 과정에서 놓쳤던 문제들을 발견할 수 있음

- 미처 몰랐었던 다양한 패턴을 발견을 가설을 세움

- 특정 결론을 도출하기 위해서가 아니라 데이터로부터 최대한 많은 이야기 거리를 뽑아내는 것이 주목적