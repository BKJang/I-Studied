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
