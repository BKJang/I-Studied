# Dijkstra's Algorithm

- 하나의 시작점(source)에서 하나의 도착점(destination)을 가는 최단경로를 찾는 알고리즘

- 간선이 음의 값을 가져서는 안된다.(non-negative edges)

- 간선이 음의 값을 가지는 경우에는 벨만-포드 알고리즘 이용

- 최단 경로 문제를 해결하는 다익스트라 정점을 하나씩 추가하면서 완화(relax)를 통해 새로운 경로에서 경로 값을 계산하여 새로운 경로를 추가하여 최단 경로를 찾는 알고리즘

## 시작점과 도착점의 수에 따른 구분(계산의 양의 차이)

- Single-source & Single-destination : 시작점과 도착점이 정해진 경우

- Single-source : 출발점이 하나고 도착점이 여러개인 경우

- Single-destination : 출발점은 여러개이고 도착점은 하나인 경우

- All-pairs : 출발점과 도착점이 여러개인 경우


## 수행 과정

![Markdown Here logo](http://cfile24.uf.tistory.com/image/2157D43658E0C87717FE7F)

- 먼저 가장 작은 값을 찾는다.


![Markdown Here logo](http://cfile10.uf.tistory.com/image/260D873658E0C8771D18A3)

- 더 작은 값을 가지는 경우를 선택


![Markdown Here logo](http://cfile27.uf.tistory.com/image/2753573658E0C878016C54)

- 더 작은 값을 가지는 경우를 선택


![Markdown Here logo](http://cfile6.uf.tistory.com/image/2419A93658E0C879119E77)

- 더 작은 값을 가지는 경우를 선택


![Markdown Here logo](http://cfile8.uf.tistory.com/image/244DC73658E0C8792E8A4E)

- x에서 t를 가는 경우가 없으므로 t를 다시 기준으로 선택


![Markdown Here logo](http://cfile5.uf.tistory.com/image/2755443658E0C87A2D966F)

![Markdown Here logo](http://cfile7.uf.tistory.com/image/2707013658E0C87B12E707)



## 수행 시간 분석

- 배열로 구현 : O(V^2) => 각 Vertex에서 각 Vertex까지의 경로 값이므로 V*V

- 힙 구조로 구현 : O(VlgV + ElgV)

- 피보나치 힙으로 구현 : O(VlgV + E)
