# Data Visualization

## Purpose & Function

- ������ �м� ������ ���� �������� Ž��(EDA)

- ������ �м� ��� ������ ���� ������ �ð�ȭ

- Communication : �޽����� ������ ���� ����

- Insight : �̹� �˰� �ִ� �Ϳ� ���� �������� ����

- Discovery : ���ο� ��ǰ��� �߰�, ���� ���� ������ ǥ��


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

## �������� ����

#### ���� ���� �Ϲ��� �з�

- �̻��� ���� : �̻��� ������, ������ ������(����, ������)

- ������ ���� : ������ ������, ������ ������ �̻���ȭ�� ����(��ġ��)


#### ���� ����� ���� �з�

- ��� ������ : ���� ���� ��� �� �� �ִ� ������(��, ��)

- ���� ������ : ������ ���� Ư���� ������(����, ���ҵ�, �߰��ҵ�, ��ҵ�)

- � ������ : ���� + ũ������ But ��ġ���� ������ �ǹ̰� ����(�µ� - 30���� 15�� ���� 2�� ���� �ʴ�)

- ���� ������ : ���� + ũ������ + ��ġ���� ���� ���� ����(ü��)


## �������� �ð�ȭ ���

#### �� ������ ���� �׸�

- ���� �׸� : �̻���, ������ ������ ������ ���� ���� �� ��

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTky/MDAxNDk1NTg2OTk1Njcw.rXo8D-KmSTpHXA18lwQ_UZd5AUe7map5K1owrOzAV8kg.3t51DQRzmU-JJIvCW862e-WZ7K8bM60FxzfFer40f4gg.PNG.jp302119/%EB%A7%89%EB%8C%80%EA%B7%B8%EB%A6%BC.png)

- �� �׸� : ���� ������ ����ϰ� �������� ������ �׸� �׸�

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMjEz/MDAxNDk1NTg2OTk3MTM4.tbXtaZnlHh8jPQtNJecRc2BaLVeNNDjhYHUwrZHW1ykg.7jRsA7vxeZFAFQc2tgJYO4hnwsLv5lqyH4fMN7IT9vAg.PNG.jp302119/%EC%9B%90%EA%B7%B8%EB%A6%BC.png)

- ������׷� : ������ ������ ���� ��� �������� ������ ��������ǥ �׸�

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMjEg/MDAxNDk1NTg2OTk3NDE3.25SX8hsiNe03e2qXpJxgwqqQ_wUCu7fN06WxbEFX-mkg.5g-M7rX8YGOKX2Z2pZv0Xw3i6uJ2SvBfK0TyWAFJjpsg.PNG.jp302119/%ED%9E%88%EC%8A%A4%ED%86%A0%EA%B7%B8%EB%9E%A8.png)


#### �� ������ ���� �׸�

- ���׸�, �ð迭 �׸� : x��, y�� ���� ������ ���� ���� ��ǥ�� �Ͽ� ���� �׸�

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTQ4/MDAxNDk1NTg2OTk2OTY2.x63Ioul0toLw4Ho6ta8OAkBRzEdB0zW9s5LAOYnH23wg.T5zrm6pIzXieettsFh7UFXIkn_cFtysQHjyebWPslEUg.PNG.jp302119/%EC%84%A0%EA%B7%B8%EB%A6%BC.png)

- ������ : x��, y�� ���� ������ ���� ���� ��ǥ�� �Ͽ� ���� �׸�

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfODcg/MDAxNDk1NTg2OTk2Njg1.PHyoQ-blOHQeh52OeI1v6HvJ2VEEqFzcgziDybrUoKcg.PK6zIESw55iqq5SpoSCh7ntuc3eddBgvJ8Kmn2_Ulcwg.PNG.jp302119/%EC%82%B0%EC%A0%90%EB%8F%84.png)


#### ���� ������ ���� �׸�

- ������ ��� : ���� ���� ���� �ֿ� ���� ������

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1Mj RfNDYg/MDAxNDk1NTg2OTk2NDU1.5kzx33dZRFqrWJIz9IQexbv5-swM697CGdEPxBQpj20g.tBLk9VmlTuxfA3HJTbQGW9Sdm0Ja-7X-QulL07Nj4j0g.PNG.jp302119/%EC%82%B0%EC%A0%90%EB%8F%84_%ED%96%89%EB%A0%AC.png)

- ������ũ �׸� : �̻��� �������� ������ ��������ǥ�� ���� ���� �� ����

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMjcg/MDAxNDk1NTg2OTk2MTAz.6deRYg6fr0dltauNEoYl1xDbixKFbCD17Fd8noEJQAMg.AwVbjWhoX4yaneWM4iXyEaL26f31M7WkRM_trr6t9jcg.PNG.jp302119/%EB%AA%A8%EC%9E%90%EC%9D%B4%ED%81%AC.png)

- ������ ��Ʈ, ������ǥ �׸�, ü������ ���� �׸�


## ����� �ð�ȭ �Լ�

- �׷��� ��ġ ���� ������Ʈ�� ���� �׷����� ���� ������ �ð�ȭ ǥ���� �ϴ� �Լ�

- ������ �׷����� �����ϰ� �����Ͽ� ����

## ������ �ð�ȭ �Լ�

- �׷��� ��ġ ���� ���� ��� ���� �׸��� �ٰ����� �׸��� ���� ����� �ϴ�

- ��, �ð�ȭ�� �����ϱ� ���� R���� �����ϴ� ���� �Լ�

![Markdown Here logo](http://postfiles9.naver.net/MjAxNzA1MjRfMTYy/MDAxNDk1NTg5MjU5MjY1.NcctaHAoo1pt9Rj8Q7OBOD6B5ElzOHUQ5mDPAq64X0kg.r8ohSUzE0FKZtIzbN3XRoMfDw4enIlB92peyaSSTXC0g.PNG.jp302119/plot.png?type=w2)

```sh

#����� �ð�ȭ �Լ�

> z<-lm(mpg~wt, data=mtcars)  # dist, speed 

> plot(mtcars$wt, mtcars$mpg) # ������ �ð�ȭ �Լ�   

## �߼���

> abline(h=20) # Y�� ����
> abline(h=30) # Y�� ����


> abline(v=3, col="blue") # x�� ����


> abline(z, lty=2, lwd=2, col="green") # lty = �� ���, lwd = �� ����, col = �� ��
> abline(z, lty=3, lwd=2, col="red")

```

#### ������ �ð�ȭ �Լ� Functions

grid(nx,ny) : ���� plot�� x��� y���� ������ ���ڸ� �׸�

axis(side n,) : plot�� �� ������ �� �߰���, 1�� �ϴ� x��, 2�� ���� y��, 3�� ��� x��, 4�� ���� y��

box(which=,) :���� plot�̳� figure �Ǵ� plot �ٱ��ʿ� �߰����� box�� �׸�. ���� graphic parameter �μ��� ���� ������. which�� ��plot��,��figure��,��inner��,��outer���� �μ��� �� �� ����

legend(x�� ��ġ, y�� ��ġ, ����,) : ���� plot�� ���ʸ� �߰�. (x,y)�� ��ġ�� ���ʸ� ����

arrow(x,y) : ȭ��ǥ�� �߰�.

lines(x,y)/points(x,y) : ��, ������ �߰�. points �������� type�� ��p��,��b��,��l�� ���� �� �� ����

abline(a,b) or abline(h= or v=) : ���� plot�� ���� �߰���. lines�� �ٸ����� �Ѱ��ִ� ���� a=y����, b=���� ��. h(horizontal) ���� �ָ� x��� �����ϴ� ����, v(vertical) ���� �ָ� y��� �����ϴ� ���� �׸�

segments(x0,y0,x1,x2) : (x0,y0)�� ���� (x1,y1)�� ���� �մ� ���� �׸�

polygon(x,y) : ���� x�� y�� ���ǵ� �������� �׸�

text(x,y,��note��) : x,y�� ��ġ�� ��note����� ���� ��


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

> legend(12, 5, c("h=8", "v=5", "segments", "arrows"), cex=0.9, col=c("red", "blue")) # ���� ����

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

> plot(x,y,xlab="X��",ylab="Y��",main="test Plot")

```

![Markdown Here logo](http://postfiles11.naver.net/MjAxNzA1MjRfMTAx/MDAxNDk1NTkwNzc3MTE5.ScLitdFyqApicDvRBTyLwrL2QVR_B-zcM-mss9W3rxog.WgCfevRTGCXoNXI_4gto-yFu2xDRij3vHkj92bwZK54g.PNG.jp302119/6.png?type=w2)

```sh
> v1 <- c(100,130,120,160,150)

# line chart �׸���
> plot(v1,type="o",col="red",ylim=c(0,200),axes=F,ann=F)

# x�� �׸���
> axis(1,at=1:5,lab=c("Mon","TUE","WED","WHU","FRI"))

# Y�� �׸���
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

#�׷��� ��ø ��ɾ�, default�� F
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

- ���� �׷���

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

#����
> legend(14,400,c("MON","TUE","WED","THU","FRI"),cex=0.8, fill=rainbow(nrow(qty)))

```

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA1MjRfMTQ4/MDAxNDk1NTkxNzQwMjI1.SsBychqEEtnmL0ghiS6r2W1v9awmgGwLYPRYNNNO5Gkg.4epahDmuaTSQOEMv5IIWgzqts9PKNHYzWx1ZkssF008g.PNG.jp302119/h.png)

```sh
> barplot(t(qty),main="Fruits Sales QTY",ylim=c(0,900),
	col=rainbow(length(qty)),space=0.1,cex.axis=0.8,las=1,
        names.arg=c("MON","TUE","WED","THU","FRI"),cex=0.8)

#����
> legend(0.2,800,names(qty),cex=0.7,fill=rainbow(length(qty)) )

```