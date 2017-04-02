# Depth-first search

- 가까운 노드들을 모두 확인하지 않고 한 방향으로 깊이 탐색(주변에 있는 노드를 먼저 탐색하는 BFS와는 대비된다)

- 시간을 우선으로 하는 그래프 탐색

## Time stamp

- 각 정점은 v.d와 v.f를 가지고 있다.

- v.d : 발견 시간(discovery time, 회색)

- v.f : 완료 시간(finishing time, 검은색)


## 정점의 색 구분

- 초기화한 정점 : 흰색(not discovered)

- 발견된 정점 : 회색(discovered)

- 완료된 정점 : 검은색(finished)

- 완료의 의미는 모든 인접한 정점까지 조사한 경우


## 탐색 순서

![Markdown Here logo](http://cfile21.uf.tistory.com/image/21493C3658DCB8B13CD977)

- u(gray) -> v(gray) -> y(gray) -> x(gray) -> x(black) -> y(black) -> v(black) -> u(black) -> w(gray) -> z(gray) -> z(black) -> w(black)


## 깊이 우선 탐색 숲

- 직전 정점 그래프는 깊이 우선 탐색 숲

![Markdown Here logo](http://cfile5.uf.tistory.com/image/23158B3658DCB8AF1D9B8F)


## Parenthesis theorem(for gray interval)

- 같은 깊이 탐색이라면 상위 정점들이 하위 정점들을 모두 포함

- 단, 따로 떨어진 경우는 별개

![Markdown Here logo](http://cfile5.uf.tistory.com/image/2605AE3658DCB8B02BEFBE)


## 간선의 분류

![Markdown Here logo](http://cfile1.uf.tistory.com/image/2335433658DCB8B00A2573)

- 트리 간선(Tree edges) : 스패닝 트리에 포함된 모든 간선

- 가로 간선(Cross edges) : 선조와 자손 관계가 아닌 정점으로 연결된 간선

- 후향 간선(Back edges) : 트리 간선이 아닌 자손에서 선조로 연결된 간선

- 전향 간선(Forward edges) : 트리 간선이 아니고 선조에서 자손으로 연결된 간선


- 무방향성 그래프의 Depth-first search에서 그래프의 각 간선은 트리 간선이거나 후향 간선

- 무방향성 그래프에선 전향 간선과 후향 간선의 구분이 없고 모든 간선이 양방향으로 통행하기 때문에 교차 간선 또한 있을 수 없다. 


## 수행시간 

- 수행 시간 : O(V+E)