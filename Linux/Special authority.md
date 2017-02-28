# Special authority

## SetUID, SetGID

- SetUID의 경우 사용자가 사용을 할 때만, 소유자의 권한으로 파일을 실행

- SetGID의 경우 사용자가 사용을 할 때만, 그룹의 권한으로 파일을 실행한다.

(활용법 : 기존의 허가권 앞에 4를[SetUID], 기존의 허가권 앞에 2를[SetGID]를 붙인다)
 

![Markdown Here logo](http://cfile6.uf.tistory.com/image/2648A5415791F4A71E52FB)

- 기존에 x가 없으면 S(대문자), 있으면 s(소문자)로 표시됨

- 명령어 passwd는 /usr/bin/passwd에 속해있는 실행파일이고 이것은 SetUID가 먹혀있다.(4755) 

- SetGID도 같은 방식으로 작업을 하면 된다. 단 , SetGID는 같은 방식이라면 허가권에 '2755'가 적용될 것이다.

- 특수 권한을 없앨 때는 그냥 단순한게 허가권을 chmod명령어를 이용해 numeric method를 쓰면 없어지지 않는다.

- 이 특수권한을 없애려면 symbolic method를 사용하여 없애야 한다.

### SetUID 권한의 중요성

- 관리자의 권한이 적용된다는 점을 노려 Attacker(해커)가 서버에 침입했을 때, 표적이 될 수 있는 모든 파일이 이 SetUID가 적용된 파일이기 때문

- 각각의 허가권을 실행파일에 적용했을 때, 허가권을 4750을 주면 필요한 권한을 가지되, 사용자 입장에서는 사용할 수 없게 된다. 

![Markdown Here logo](http://cfile22.uf.tistory.com/image/2152404C5793BF0B144D0A)