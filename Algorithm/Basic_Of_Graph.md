# Basic of Graph

- Graph G는 (V,E)의 쌍이다.

- V는 정점(Vertex)의 집합이고 E는 간선(Edge)의 집합

- 정점은 독립된 개체로서 동그라미로 표현

- 간선은 두 정점을 잇는 개체로 선으로 표현


## 방향성 그래프(Directed graph)

- 간선이 방향성을 가지기 때문에 화살표가 있는 선으로 표현

- 각 간선은 한 정점을 떠나서 한 정점으로 들어간다.

- 일반적으로 각 정점은 숫자나 이름으로 구분(V={1, 2, 3, 4, 5, 6})

- 각 간선은 간선이 떠나고 도착하는 정점의 쌍을 순서대로 적은 것으로 구분(E={(1,2), (2,2), (2,4), (2,5), (4,1), (4,5), (5,4), (6,3)}

![Markdown Here logo](http://cfile6.uf.tistory.com/image/274C4A4A58D7C28223A68F)


## 무방향성 그래프(Undirected graph)

- 간선이 방향성이 없으므로 직선(line)을 이용

- 간선 (u, v)와 (v, u)는 같다

![Markdown Here logo](http://cfile21.uf.tistory.com/image/2145264A58D7C2822AD08C)


## 인접(Adjacency)

- (u, v)라는 간선이 있다면, 정점 v와 정점 u가 '인접하다'고 한다.

- 무방향성 그래프에서는 인접관계가 동일

- 방향성 그래프에서는 같지 않다.

![Markdown Here logo](http://cfile23.uf.tistory.com/image/245E6B4A58D7C28410F500)

정점 2는 정점 1에 인접하지만 정점 1은 정점 2에 인접하지 않는다.



## 차수(Degree)

- 정점의 진출차수(out-degree)는 정점을 나가는 간선의 수

- 정점의 진입차수(in-degree)는 정점을 들어오는 간선의 수

- 차수는 진입차수와 진출차수의 합

- 무방향성 그래프에서는 진입 차수와 진출 차수는 정의 할수 없고 차수만 정의 가능



## 경로(Path)

- 정점 u로부터 정점 v까지의 경로는 정점의 순서

- 경로의 길이(length)는 경로에 있는 간선의 수

- 단순 경로는 경로에 있는 모든 정점들이 서로 다른 경우

![Markdown Here logo](http://cfile6.uf.tistory.com/image/274C4A4A58D7C28223A68F)

경로 <1, 2, 4, 5>는 단순 경로

경로 <1, 2, 4, 1, 2>는 단순 경로가 아니다.


## 순환과 단일 순환(Cycle and Simple cycle)

- 비순환 그래프 : 순환이 없는 그래프

- 연결 그래프 : 정점의 모든 쌍이 경로를 가지는 무방향성 그래프

- 연결 요소 : 무방향성 그래프에서 정점들이 최대한 연결되어 있는 하위 그래프

![Markdown Here logo](http://cfile9.uf.tistory.com/image/25406B4A58D7C284304AA6)


## 강한 연결과 강한 연결 요소

- 강한 연결 : 방향성 그래프에서 정점의 각 쌍이 서로 도달 가능하다면 강하게 연결

- 강한 연결 요소 : 방향성 그래프에서 최대한 많은 정점을 강하게 연결한 하위 그래프


## 무방향성 그래프와 방향성 그래프의 변환

- 무방향성에서 방향성

![Markdown Here logo](http://cfile2.uf.tistory.com/image/2140A44A58D7C283308771)

- 방향성에서 무방향성

![Markdown Here logo](http://cfile4.uf.tistory.com/image/2440734A58D7C28330F109)


## 완전 그래프(Complete graph)

- 무방향성이 그래프에서 모든 정점의 쌍이 서로 인접하는 경우

- 포레스트(Forest) : 순환하지 않는 무방향성 그래프

- 트리(Tree) : 포레스트가 연결되어 있는 경우, 연결된 비순환 무방향성 그래프


## Dag(Directed acyclic graph)

- 비순환성 방향 그래프

![Markdown Here logo](http://cfile10.uf.tistory.com/image/273C754A58D7C28235A201)


## 트리(Tree)

- 연결된 비 순환 무방향성 그래프

- 두 정점은 단일 단순 경로로 연결

- 간선을 제거하면 그래프는 연결 안됨

- 간선을 하나 추가하면 그래프는 cycle(순환)을 포함
