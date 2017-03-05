# Heap Sort

## 힙의 형태(The shape of Heap)

- 완전 이진 트리(Complete binary tree)에 가까운 형태

- 이진 트리 : 각 노드의 자식 수가 2이하인 경우

- 완전 이진 트리: Root노드부터 Leaf노드까지 빠짐없이 채워진 트리


## 힙 특성

#### 최대힙 특성(Max-Heap Property)

- 부모 노드의 값은 항상 자식 노드의 값보다 크다.

- 전체 트리의 Root 노드 값이 가장 큰 값

- 각 하위 트리 구조의 Root 노드가 가장 큰 값

![Markdown Here logo](http://cfile2.uf.tistory.com/image/217FDF3C58BAC0E820424B)


#### 최소힙 특성(Min-Heap Property)

- 자식 노드의 값은 항상 부모 노드의 값보다 크다.

- 전체 트리의 Root 노드 값이 가장 작은 값

- 각 하위 트리 구조의 Root노드가 가장 작은 값


## 힙의 배열 저장 방식

- Root 노드는 배열 첫번 째에 저장

- 각각의 노드들은 레벨별로 저장

![Markdown Here logo](http://cfile25.uf.tistory.com/image/27739D3458BAC1C80EF277)


## 노드의 높이 : Simple path


## 힙의 높이(h)

- Root 노드로 부터 트리의 높이(Root 노드가 가질 수 있는 하위 노드의 값들)
 
- n(노드의 개수) = 2^h => h(힙의 높이) = O(logn) 


## 힙 특성 관리

- 주어진 노드의 값들을 최대힙 특성으로 관리한다고 했을 때, 노드의 값을 흘려 내려 하위 트리가 최대 힙 특성을 가질 수 있도록 한다.

[Example]

- Max Heapify

![Markdown Here logo](http://cfile7.uf.tistory.com/image/2355893558BAC2851CD66B)


## 힙 구조 만들기(Building a heap)

- Build Max Heap

[Example]

- [4, 1, 3, 2, 16, 9, 10, 14, 8, 7]이 주어졌을 때,

- 자식 노드를 가지는 마지막 노드부터 시작하여 Root 노드 방향으로 거슬러 올라가면서 진행

- Process

![Markdown Here logo](http://cfile8.uf.tistory.com/image/213C324258BBF771363DF7)

- Result

![Markdown Here logo](http://cfile28.uf.tistory.com/image/2170F14258BBF77232E975)


## 최대 값 추출(Extract Max)

- Heap에서 가장 큰 값을 제거하고 구조를 복원

- 마지막의 값을 Root노드와 교환

- 값을 흘러내려 Max heap 구조를 복원

[Example]

- Process

![Markdown Here logo](http://cfile3.uf.tistory.com/image/23047C4058BC14A719A6ED)

- Result

![Markdown Here logo](http://cfile24.uf.tistory.com/image/226B8C4E58BC166F28B589)

- 수행 시간 : O(logn)


## 힙 정렬(Heap Sort)

- Extract Max(최대 값을 제거하고 Max-Heapify를 수행)을 n번 반복

[Example]


```sh

# [16, 14, 10, 8, 7, 9, 3, 2, 4, 1] 의 배열이 주어졌을 때,

# Extract Max

[14, 10, 8, 7, 9, 3, 2, 4, 1] [16]

[10, 8, 9, 4, 7, 1, 3, 2] [14,16]

[9, 8, 3, 4, 7, 1, 2] [10, 14, 16]

[2, 1] [3, 4, 7, 8, 9, 10, 14, 16]

# 이진 트리로 표현하면 이해가 쉽다.

# Result

[1, 2, 3, 4, 7, 8, 9, 10, 14, 16]

```

- 시간 복잡도 : logn(Extract Max의 수행시간)을 n번 반복 = O(nlogn)