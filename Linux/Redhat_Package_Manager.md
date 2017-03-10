# Redhat_Package_Manager(rpm)

## rpm

#### Package 파일의 구성요소

- mysql-embedded-devel : 파일명

- 5 : major version(프로그램 자체의 변경이 일어났을 경우 바뀜)

- 1 : minor version(기능의 추가 발생시 증가)

- 73 : patch version(버그가 수정되었을 경우 증가 / 패치발생시)

- 7 : 파일이 변경된 횟수

- e16.x86 64 : 아키텍쳐(Architecture)


#### 아키텍쳐(Architecture)?

![Markdown Here logo](http://cfile2.uf.tistory.com/image/22395C4557978D49010D47)


#### rpm 패키지 파일 작업시 유의사항

- 모든 작업은 반드시 동일한 버전의 패키지 파일 이여야 한다

- 의존성 오류(Failed dependencies)를 절대 무시하지 말자

- 의존성을 제기한 패키지를 먼저 작업해야 한다

- 가급적 의존성 무시(--nodeps)를 사용하지 말자

- 의존성 오류 발생시 needed를 기준으로 왼쪽을 보고 설치, 오른쪽을 보고 삭제를 한다

- 'lib'으로 시작하고 중간에 'so'가 있는 경우는 무시해도 된다

- 디렉토리로 시작하는 것들(/usr/bin/)은 패키지가 아니므로 무시한다

- 대표 패키지부터 작업한다

- 나머지는 화면에 보이는 순서대로 작업한다


[Option]

1. -qa : 패키지 전체 목록을 조회

2. -e : 패키지를 설치

3. -ivh : 패키지를 설치 (i : 패키지 설치, v : 작업과정을 자세하게 보여줌, h : 작업과정을 hash mark로 표현)

4. --nodeps : 의존성 오류를 무시하고 작업을 실행(추가 옵션이기 때문에 다른 옵션과 같이 사용)


```sh

# -qa

rpm -qa | grep [패키지명]

# -e

rpm -e [패키지명]

# -ivh

rpm -ivh [패키지명.rpm]

# --nodeps

rpm -e --nodeps [패키지명]

```

[Example]

- -qa

![Markdown Here logo](http://cfile21.uf.tistory.com/image/222C0B3D57974148172C1E)

- -e

![Markdown Here logo](http://cfile21.uf.tistory.com/image/267B3D4457974A2633809F)

- -ivh

![Markdown Here logo](http://cfile6.uf.tistory.com/image/27623C4557974A3B1AF316)

- --nodeps

![Markdown Here logo](http://cfile21.uf.tistory.com/image/213B383957975AA61331A6) 
