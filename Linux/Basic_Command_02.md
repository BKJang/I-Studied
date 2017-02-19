# Basic Command_02

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
