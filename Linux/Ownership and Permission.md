# Ownership and Permission

## Permission(허가권)

'-rw-r--r--' : 파일(앞이 -라면 파일)

'drwxr-xr-x' : 디렉토리(앞이 d라면 디렉토리)

![Markdown Here logo](http://cfile9.uf.tistory.com/image/227F1C4B578E60EC24B704)

- r : read(읽기)

- w : write(쓰기)

- x : execute(실행, 접근)

#### r의 의미

- 파일에서의 'r'의 의미 : 파일의 내용을 읽어들이는 명령어들과 관련이 있다.

- 디렉토리에서의 'r'의 의미 : 디렉토리 내용을 읽어들이는 것과 관련있다.(ls)

#### w의 의미

- 파일에서의 'w의 의미 : 내용을 수정, 변경하는 명령어들과 관련이 있다.

- 디렉토리에서의 'w'의 의미 : 디렉토리 및 그 내부의 생성 및 삭제와 관려이 있다.
 
#### x의 의미
 
- 파일에서 'x'의 의미 : x가 있으면 실행파일, 없으면 문서파일, 접근 권한을 포함한다.

- 디렉토리에서 'x'의 의미 : 접근 권한의 여부



![Markdown Here logo](http://cfile1.uf.tistory.com/image/2650A546578E5F05098FC8)

접근을 할 수 있어야 파일 및 디렉토리를 읽을 수 있고 읽을 수 있어야 수정하거나, 삭제할 수 있다. 즉, 접근 권한이 보장이 되어야 한다.


### chmod

- chmod : 허가권 설정(사용자 권한 : w / 그룹의 권한 : r / 그외 사용자 : o)  
 
```sh

# numeric method
 
chmod 461 file/directory (4 : r / 6 : r+w / 1 : x)

# 사용자에게 읽기 권한 부여 / 그룹에 읽고 쓰기 권한 부여 / 그 외 사용자에게 접근권한 부여


# symbolic method
 
chmod g+r file/directory (g : group / r : read) 

# 그룹에 읽기 권한 부여

```

## Ownership(소유권)

![Markdown Here logo](http://cfile8.uf.tistory.com/image/2154FA44578E58BD08D923)

- 앞 부분의 root가 소유자, 뒤의 root가 소유그룹

### chown

- chown : 소유자 및 소유그룹 설정

```sh

# 소유자만 변경하고 싶을 때 (소유자 root를 tcpdump로 변경)

chown tcpdump /a/testing

# 소유자와 소유그룹 모두 변경하고 싶을 때 (소유자를 root로 소유그룹을 test로 변경)

chown root:test /a/testing

# 소유그룹만 변경하고 싶을 때 (소유그룹 test를 root로 변경)

chown .root /a/testing

```
 