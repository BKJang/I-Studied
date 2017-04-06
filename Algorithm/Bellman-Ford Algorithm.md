# Bellman-Ford Algorithm

- 정점 u에서 정점 v까지의 경로 중에 경로의 값이 가장 작은 경로

- 정점 u를 시작점이라고 하고 정점 v는 도착점

- 간선이 음의 값을 가지는 경우에는 벨만-포드 알고리즘 이용


## 시작점(source)와 도착점(destination)의 수에 따른 구분

- Single-source & Single-destination : 시작점과 도착점이 정해진 경우

- Single-source : 출발점이 하나고 도착점이 여러개인 경우

- Single-destination : 출발점은 여러개이고 도착점은 하나인 경우

- All-pairs : 출발점과 도착점이 여러개인 경우


## 음수 간선 값(Negative-weight edges)

![Markdown Here logo](http://cfile26.uf.tistory.com/image/22540F4758E0CE8C07F0A2)

- 음수 간선 자체는 문제가 되지 않는다

- 음수 순환이 문제가 된다.

- 단, 음수 순환의 과정에서 반복할수록 음의 값이 늘어나는 경우 문제(e,f)

- 즉, 최단 경로는 순환을 포함해서는 안 된다.

- 최단 경로의 길이는 최대 |V|-1


## 완화(Relaxation)

![Markdown Here logo](http://cfile10.uf.tistory.com/image/217E634758E0CE8D1C4ABC)

- 현재 경로 값보다 더 적은 경로가 존재한다면 값을 변경


## 수행 과정

#### Relaxation Order

- (t,x), (t,y), (t,z), (x,t), (y,x), (y,z), (z,x), (z,s), (s,t), (s,y)


![Markdown Here logo](http://cfile3.uf.tistory.com/image/271ECF4758E0CE8D0E001F)

![Markdown Here logo](http://cfile1.uf.tistory.com/image/254AD24758E0CE8E37E3BE)

![Markdown Here logo](http://cfile10.uf.tistory.com/image/221C9F4758E0CE8E0D69E8)

![Markdown Here logo](http://cfile27.uf.tistory.com/image/2465F34758E0CE8F1E944C)

![Markdown Here logo](http://cfile3.uf.tistory.com/image/2355E44758E0CE8F082566)


## 수행 시간 분석

- O(VE)
