# Graph Representation

## 인접리스트(Adjacency-list representation)

- 정점 하나당 리스트가 하나인 크기가 |V|인 배열

- 정점 하나에 인접한 모든 정점을 리스트에 저장

- 비방향성 그래프에서는 방향성 그래프로 변환해서 저장(공간을 많이 쓰게 된다.)


![Markdown Here logo](http://cfile4.uf.tistory.com/image/216B744F58D9081D2831AD)


## 인접 행렬(Adjacency-matrix representation)

- 크기가 |V| * |V|인 행렬

- 두 정점 i와 j를 잇는 간선이 있다면 행렬의 (i, j)는 1이나 0.

- 무방향성은 양방향으로 간선이 존재하므로 하위 삼각 행렬이 상위 삼각 행렬과 대칭(lower triangular matrix)

![Markdown Here logo](http://cfile7.uf.tistory.com/image/2477BB4F58D9081E1A42EB)


## 인접 리스트와 인접 행렬 비교


#### 저장 공간

- G가 촘촘하면 인접 행렬(왜냐하면 행렬은 1비트만 사용)

- G가 널널하면 인접 리스트(왜냐하면 |E| < |V|^2)


#### 간선을 찾는데 걸리는 시간

- 인접 행렬 : O(1)

- 인접 리스트 : O(V)


#### 모든 간선을 찾거난 방문하는데 걸리는 시간

- 인접 행렬 : O(V^2)

- 인접 리스트 : O(V+E)



## 가중 그래프(Weighted graph)

- 간선이 숫자로 표현되는 값을 가지는 그래프

- 인접 리스트에서는 정점 외에 간선의 값을 추가 저장

![Markdown Here logo](http://cfile4.uf.tistory.com/image/216B744F58D9081D2831AD)


- 인접 행렬에서는 1 대신 간선의 값을 저장

![Markdown Here logo](http://cfile7.uf.tistory.com/image/2477BB4F58D9081E1A42EB)