# Yellowdog_Update_Modified(yum)

## yum

- RedHat 리눅스에서는 제공되지 않았지만, Fedora Core Project로 넘어오면서 RedHat 리눅스에 Porting

- rpm이 일일히 파일 하나하나를 작업해야하는 단점으로 인해 불편한 점을 강력하게 보완한 명령어

- 대표파일 하나의 설치만으로 의존성 파일 모두를 알아서 같이 설치


#### yum 활용 시 유의사항

- 인터넷이 연결되어있는 환경에서만 사용이 가능

- yum 명령시 설치할 Package 파일의 이름과 비슷한 파일 및 디렉토리가 없는 곳에서 작업을 진행

- yum도 remove옵션을 사용하면 삭제가 가능하다. 그러나, 의존성 파일 모두를 삭제할 우려가 있기 때문에, 삭제시에는 rpm명령어 사용


[Option]

1. install : 의존성 파일까지 설치 작업을 수행

2. update : 업데이트해야하는 부분을 알아서 처리

3. remove : 의존성 파일까지 모두 알아서 삭제(이보다는 rpm을 사용하여 삭제하는 것을 지향)

4. -y: 작업을 진행하는데 있어 확인하는 과정을 생략

```sh

# install

yum install [패키지명]

# update

yum update [패키지명]

# remove

yum remove [패키지명]

# -y

yum -y install / update / remove [패키지명]

```

[Example]

##### yum -y install mysql*

![Markdown Here logo](http://cfile30.uf.tistory.com/image/232695465798E57F25B62A)

- mysql 패키지를 설치하는데 41개의 패키지를 설치

- rpm은 이를 하나하나 직접 설치해야하는 반면 yum은 알아서 설치

- 빨간색 네모칸을 쳐둔 부분을 보고 알 수 있는건 다운로드를 받는다는 것

- yum명령어를 사용하면 웹 상에서 다운을 받기 때문에 인터넷이 연결된 환경에서만 사용이 가능