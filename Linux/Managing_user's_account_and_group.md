# Managing user's account and group

## useradd

- useradd : 사용자계정 생성

[Option]

1. -u : 계정 생성시 UID정보를 임의로 지정

2. -g : 사용자의 기본 그룹을 지정

3. -s : 사용자 계정의 로그인 쉘(shell) 변경

4. -d : 사용자 계정의 홈 디렉토리를 변경

![Markdown Here logo](http://cfile27.uf.tistory.com/image/233A484958C6A10825220F)

5. -mk : 사용자 계정 생성시 사용자 지정 skel을 사용하여 생성

![Markdown Here logo](http://cfile30.uf.tistory.com/image/2226FA4E57A9B4471D9B25)


## userdel

- userdel : 사용자계정 삭제

[Option]

1. -r : 계정 생성시 만들어진 모든 정보 삭제

- 'userdel user*'이라고 입력하면 사용자 관련 정보(/etc/passwd, /etc/shadow, /etc/gshadow, /etc/group)만 삭제

- $HOME, /var/spool/mail/ 데이터는 유지된다. 따라서 사용자 계정을 삭제할 시에는 -r옵션을 사용하여 삭제


## groupadd

- groupadd : 그룹 생성

[Option]

1. -g : 그룹 생성시 GID 값 지정

- 원하는 GID 값을 지정할 수 있고 그 이후에 옵션을 쓰지 않고 그룹을 생성하면 GID는 제일 큰 값에서부터 1씩 증가해서 자동 지정

![Markdown Here logo](http://cfile27.uf.tistory.com/image/25642B3C578CB95207FB61)


## groupmod

- groupmod : 그룹 수정

1. -g : 그룹 계정의 GID값 수정

![Markdown Here logo](http://cfile26.uf.tistory.com/image/21213E37578CBFB41A4A14)

2. -G : 공유그룹 설정

![Markdown Here logo](http://cfile24.uf.tistory.com/image/2470E838578CC1BF3390F4)