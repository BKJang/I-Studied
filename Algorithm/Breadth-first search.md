# Breadth-first search

- 거리를 우선으로 탐색

- 거리(Distance) : 정점 u부터 v까지의 최단 경로(shortest path)에 있는 간선의 수

- 그래프 G = (V, E)와 시작점(s)가 주어졌을 때, s에서 도달 가능한 모든 간선을 탐색하여 찾는 과정

- 시작점으로부터 거리를 1씩 늘리면서 정점을 발견한다.

s로부터 1떨어진 노드들을 탐색

![Markdown Here logo](http://cfile21.uf.tistory.com/image/2210653B58DB435E232A66)


s로부터 2떨어진 노드들을 탐색

![Markdown Here logo](http://cfile30.uf.tistory.com/image/246DD43B58DB435F1905BF)


s로부터 3떨어진 노드들을 탐색

![Markdown Here logo](http://cfile9.uf.tistory.com/image/2728F33B58DB435D20CBFB)

- 시작점으로부터의 거리: u.d = 3

- 바로 직전 정점(predecessor vertex) : t


## 직전 정점 그래프

- 시작점으로부터 각 정점을 도달하기 직전에 들려야 하는 정점으로 만든 하위 그래프

![Markdown Here logo](http://cfile27.uf.tistory.com/image/26570C3B58DB4360281244)

- 넓이 우선 탐색 트리이다

- 모든 정점이 연결되어 있고 |E| = |V| -1

- 이때 E에 포함된 간선을 트리 간선(tree edges)라고 한다.


## 정점의 색 구분

![Markdown Here logo](http://cfile6.uf.tistory.com/image/275BC23B58DB436129EDF3)

- 초기화한 정점 : 흰색(not discovered)

- 발견된 정점 : 회색(discovered)

- 완료된 정점 : 검은색(finished)

- 완료의 의미는 모든 인접한 정점까지 조사한 경우


## 수행 과정

![Markdown Here logo](http://cfile10.uf.tistory.com/image/2443CF4358DB4AC517C5EC)

- 위와 같은 과정을 반복하고 최종적으로 모든 정점이 검은색이 될 때까지 과정을 진행

- 초기화 시간 : O(V)

- 그래프 탐색 시간 : O(V+E) (정점은 최대 한 번만 조사, 간선은 최대 두 번 조사)

- 따라서 전체 수행 시간: O(V+E)
