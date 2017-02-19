# Basic Command_03

## head, tail

- head : File의 내용을 위에서부터 10줄을 출력(default 값이 10줄)

- tail : File의 내용을 아래에서부터 10줄을 출력(default 값이 10줄)

```shell

[문법]

head [파일 경로]

tail [파일 경로]


head /a/testing

# 위에서 3줄 출력

head -3 /a/testing


tail /a/testing

# 아래에서 4줄 출력

tail -4 /a/testing

```
## more

- more 

1. 내용이 많은 File을 화면 단위로 끊어 출력

2. 화면에서 보여주고 있는 만큼의 내용을 %로 표현하여 출력

3. more는 재검색이 불가능하다는 단점이 있어서 내려가면 그 이후로는 위의 내용을 볼 수 없다는 단점

## nl

- nl : File의 내용을 출력했을 때 몇번 째 줄인지 각각의 줄마다 표시(number line)

```shell

# [문법]

nl [파일 경로]


nl /a/testing

```

```shell

# Example : testing file을 라인 넘버를 붙여 위에서부터 5줄 출력

head -5 /a/testing | nl

```
