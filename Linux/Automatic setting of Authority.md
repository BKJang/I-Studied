# Automatic setting of Authority

## UMASK

- umask : 권한을 설정할 때, 수동적으로 권한을 주지 않고 파일이나 디렉토리가 생성됨과 동시에 지정된 권한이 주어지도록 함

```sh
# [문법]

umask [변경하고자 하는 umask 값]

# [패턴]

if (permission>750){

umask = 022

  }else{

umask = 002

  }

# 이처럼 허가권이 몇이냐에 따라 umask의 값이 달라지도록 Linux상에서 제공이 되고 있는데, 
# 이는 반대로 생각하면 umask값에 따라 파일이나 디렉토리의 허가권이 달라지도록 제공되고 있다는 것을 의미하기도 한다.
```

![Markdown Here logo](http://cfile21.uf.tistory.com/image/27567B47579792B92C535D)

- 파일의 Permission(허가권)의 값은 최대 666이고, 디렉토리의 Permission의 값은 최대 777 

- 여기서 UMASK값을 뺀 값이 해당 파일의 허가권(Permission)

![Markdown Here logo](http://cfile22.uf.tistory.com/image/21464F4B579796D6356357)

- 위의 그림은 UMASK를 통해 파일과 디렉토리의 허가권을 설정하는 과정

- 밑의 그림은 디렉토리와 파일이 허가권(755, 664)를 갖기 위해 UMASK 값을 결정하는 과정
