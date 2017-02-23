# Basic Command_01

## Linux

- GUI(Graphic User Interface) : xWindow와 같은 그래픽 환경

- TUI(Text User Interface) : 관리자가 주로 접하게 되는 환경이자 텍스트 기반의 환경

## pwd, cd

- pwd : 현재 나(관리자)가 작업 중인 directory의 절대 경로를 표시

- cd : 이동하고자하는 directory로 이동

```shell

pwd

# [출력] /root

cd /home/

# [출력] /home

```
## ls 

- ls : Directory의 목록을 확인

[Option]

1. -a : 경로의 모든 file과 directory를 출력

2. -l : 지정한 directory의 내용을 자세하게 출력

3. -d : 지정한 directory의 정보를 출력

4. -n : File 및 directory 정보 출력 시 소유자(UID)와 소유 그룹(GID)에 대해 출력

5. -F : File 형식을 알리는 문자를 각 파일 뒤에 출력(Directory뒤에는 /'/표시가 붙게 된다)

6. -R : 하위 경로와 그 안에 있는 모든 File들도 같이 출력

```shell

# [문법]

ls [옵션] [경로]

# Example

ls -a /home/directory/

# ls -al == ll

```

## cp, mv

- cp : File과 Directory를 복사

- mv : File이나 Directory를 이동할 때 사용, 파일의 이름 변경 가능

```shell

# [문법]

cp [기존 경로] [복사할 경로]

mv [기존 경로] [이동할 경로]

# Example

cp /home/a/poketmongo /home/a/b/

mv /home/a/test /home/a/b/

```

## mkdir, rmdir

- mkdir : Directory를 생성(make directory)

- rmdir : Directory를 삭제(remove directory)

단, 빈 Directory만 삭제, 삭제하고자 하는 Directory의 하위에 Directory가 존재할 때는 삭제 불가

[Option]

1. -p : 상위 경로까지 생성, 삭제


```shell

#[문법]

mkdir(rmdir) [옵션] [생성(삭제)할 Directory의 경로]

# Example

# 1. /ittest/a/b/c/라는 Directory를 한 번에 만든다.(한 줄의 명령어로)

mkdir -p /ittest/a/b/c/

# 2. /ittest/a/b/c/ Directroy를 삭제한다.(c만 삭제)

# method1

rmdir /ittest/a/b/c/

# method2

cd /ittest/a/b/

rmdir ./c/

# 3. 삭제 후, /ittest/a/b/의 상위 Directory까지 모두 삭제한다.

rmdir -p /ittest/a/b/

```

## rm 

- rm : File 및 Directory를 삭제

[Option]

1. -f : 확인 작업을 거치지 않고 삭제

2. -r : rm을 쓰면 기본적으로 Directory는 삭제 불가. 옵션을 쓰게 되면 Directory와 그를 포함한 하위경로까지 모두 삭제

```shell

# [문법]

rm [옵션] [삭제할 Directory와 File의 경로]

# Example

ls -a /home/directory/

# ls -al == ll- /home/a/b/c/에서 /home/을 제외한 모든 Directory를 삭제하고 File이 있다면 그 파일까지 모두 삭제

rm -rf /home/a/b/c/

rm -rf /home/a/b/

rm -rf /home/a/

```

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

## find

- find : 파일 및 디렉토리를 검색(Windows에서 ctrl+f키를 누르면 뜨는 찾아보기의 기능과 같다.)

[Option]

1. -name : find <경로> -name <파일명> → 파일명에 해당하는 파일을 찾아준다.

2. -type <d or f> :find <경로>  -d-directory , f-file → -d를 입력하면 디렉토리를, f를 입력하면 파일을 출력해준다.

3. -newer : find <경로> -newer <파일명> → 해당 파일을 이후에 작성된 파일을 찾아준다.

4. -exec : find -name <파일명> -exec 실행 명령 → 실행명령에 따라서 찾은 파일을 처리한다.


```shell

[문법]

# -name

find <경로명> -name <파일명>

# -type

find <경로명> -name <파일명> -type <d or f> 

# -newer

find <경로> -newer <파일명>

# -exec

find -name <파일명> -exec <실행명령>

```

## shutdown

- shutdown : 옵션에 따라 종료 및 재부팅을 명령

[Option]

1. -h : 시스템 종료를 명령하는 옵션

2. -r : 시스템 재부팅을 명령하는 옵션

3. ctrl + c : 시스템 종료나 재부팅 명령을 취소


```shell

# 10분 후 종료

shutdown -h +10

# 이 상태에서 'ctrl + c' 를 누르면 취소

# 이 메시지가 이 서버를 사용하고 있는 모든 사용자에게 전송이 된다.

```

[shutdown 명령 이후 서버의 사용자 화면]

![Markdown Here logo](http://cfile26.uf.tistory.com/image/267C4F465790F6CB06DC3C)

