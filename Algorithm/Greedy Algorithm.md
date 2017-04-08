# Greedy Algorithm

- 현재 상황에서 가장 좋아 보이는 답을 선택

- 각 부분에서 최적을 선택하면 전체에서도 최적이 될 것이라는 가정을 전제로

- 선택은 항상 하위 문제에 대한 해답이 나오기 전에 선택


## Greedy와 Dynamic 비교

- Greedy : 하위 문제를 풀기 전에 선택하고 항상 하나의 문제만을 고려

- Dynamic : 하위 문제를 풀고 나서 선택하고 동시에 여러 개의 하위 문제를 고려

[Example]

- 도둑이 상점에서 n개의 물건을 훔친다

- i번째 상품의 가치는 vi달러이고 무게는 wi파운드이다

- 도둑은 최대 W파운드를 가방에 넣을 수 있다

- n, vi, wi과 W이 정수일 때, 어떤 물건을 훔쳐야 할까?

![Markdown Here logo](http://cfile24.uf.tistory.com/image/2167BF4458E0E6BD30FE74)


## Prim's Algorithm(프림 알고리즘)

- 정점의 최선값을 선택하여 MST(Minimum Spannig Tree) 문제를 해결하는 알고리즘


![Markdown Here logo](http://cfile10.uf.tistory.com/image/2345AC4458E0E6BE143EA7)

- 집합 A에 속하는 간선은 항상 트리를 형성

- 트리는 임의의 root정점 r에서 시작하며 정점의 집합 V에 속하는 모든 정점을 포함할 때 까지 확장

- 각 단계에서 가벼운 간선(light edge)가 트리에 추가

- 따라서 알고리즘이 종료되면 최소 신장트리가 만들어진다.


![Markdown Here logo](http://cfile26.uf.tistory.com/image/2312054458E0E6BF0DE7FA)

- cut(S, V-S)는 무방향성 그래프에서 정점을 두 개로 나누 집합

- 간선 (u,v)의 끝점이 하나는 S에 있고 다른 하나가 V-S에 있는 경우를 간선(u,v)가 cut(S,V-S)를 가로지른다.

- 만약 A에 속한 어떤 간선도 cut을 가로지르지 않으면 cut이 A를 보장한다.

- 만약 어떤 간선의 값이 cut을 가로지르는 간선 중에 가장 작다면 그 간선을 가벼운 간선이라고 한다.


## Kruskal's Algorithm(쿠루스칼 알고리즘)

- 간선의 가중치 값을 정렬하여 MST(Minimum Spannig Tree)문제를 해결하는 알고리즘

- Edge를 다 찾아놓은 후 정렬하여 제일 작은 값부터 추가하면서 safe(cycle이 일어나지 않는)한지를 검증


![Markdown Here logo](http://cfile29.uf.tistory.com/image/25544B4658E0ECC80B9445)

- (b,h), (b,c), (i,h), (i,g), (d,f), (d,e)를 추가하면 cycle이 생기므로 추가하면 안된다.
