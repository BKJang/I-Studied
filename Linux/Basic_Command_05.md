# Basic Command_05

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
