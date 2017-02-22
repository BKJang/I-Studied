# Basic Command_04

## cal

- cal : 달력을 출력

```shell

[문법]

cal [day] [month] [year]

```

![Markdown Here logo](http://cfile1.uf.tistory.com/image/230B5B3B5784C73816FC60)


## date, rdate

- date : 현재의 시간과 날짜를 확인

- rdate : 타임서버에서 시간 정보를 얻고, 그 정보를 가지고 시간정보를 변경

[rdate Option]

1. -p : 타임서버의 현재시간을 확인

2. -s : HOST 시간 타임서버와 동기화

```shell

date

# 출력 : 2017.02.20 (월) 00:00:00 KST


rdate -p time.bora.net

rdate -s time.bora.net


date

# 출력 : 서버시간과 동일한 날짜 및 시간

```
