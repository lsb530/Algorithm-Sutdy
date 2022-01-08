## Tree (트리)

자료들 사이의 계층적 관계를 나타내는데 사용하는 자료구조로 부모-자식 관계로 표현된다.

- 비선형 자료구조
- 트리는 다음의 조건을 만족한다.
    - 루트 노드(root node)가 존재한다. _(→ 트리는 반드시 1개 이상의 노드를 가진다.)_
    - 트리의 부분 트리(sub tree) 또한 트리 구조를 따른다.

### Tree 용어

- **루트 노드 (Root Node)** : 트리의 최상위 노드. unique
- **부모 노드 (Parent Node)** : 부모-자식 관계에서 상위 계층의 노드
- **자식 노드 (Child Node)** : 부모-자식 관계에서 하위 계층의 노드
- **형제 노드** : 부모가 동일한 노드
- **조상 노드** : 해당 노드의 부모 노드 ~ 루트 노드까지 가는 경로에 존재하는 모든 노드들
- **후손 노드** : 해당 노드를 루트로 하는 부분 트리(sub tree)에 있는 모든 노드들
- **내부 노드 (internal/nonterminal node)** : 자식이 있는 노드
- **외부 노드 (단말 노드, 잎새 노드, leaf/external/terminal node)** : 자식이 없는 노드
- **깊이 (Depth)** : 루트 노드에서 해당 노드까지 도달하는데 사용하는 간선의 개수
    - 루트 노드의 깊이는 0
- **레벨 (Level)** : 노드의 깊이(depth) + 1
- **높이 (Height)** : 루트 노드에서 해당 노드까지 도달하는데 지나간 정점의 개수
    - 트리의 높이 : 해당 트리 내 모든 노드의 높이 중 최댓값
- **노드의 차수 (Degree)** : 노드의 자식 수
    - 트리의 차수 : 해당 트리 내 모든 노드의 차수 중 최댓값

### Tree 구현

- [List를 사용해 구현한 Tree (Typescript로 작성됨)](./code/Tree/Tree.ts)

### Tree 시간 복잡도 & 공간 복잡도

- 노드 삽입: O(1)
- 노드 삭제: O(1)
- 노드 검색: O(N)

> 노드 삭제의 경우, 언어와 구현에 따라 시간복잡도가 달라질 수 있음.
> 자바스크립트의 경우 가비지 콜렉션에 의해 참조를 삭제하는 방식으로 O(1)에 구현할 수 있음.

### Tree 활용

- HTML DOM 트리
- 파일 시스템
- DBMS
- 검색 엔진
- 트라이 알고리즘

---

## Binary Tree (이진 트리)

트리의 차수가 2 이하인 트리이다.

- 비선형 자료구조
- 자식이 최대 2개이기 때문에 자식을 왼쪽 자식과 오른쪽 자식으로 구분한다.
- 높이가 `N`인 이진 트리의 최대 노드 개수는 ![formula](https://render.githubusercontent.com/render/math?math=2^{N}-1)개 이다.

### Binary Tree의 종류

- **정 이진 트리 (Fully Binary Tree)** : 모든 노드의 차수가 0 또는 2인 이진트리
- **포화 이진 트리 (Perfect Binary Tree)** : 정 이진 트리에서 모든 외부 노드(leaf node)의 깊이가 같은 이진 트리
    - 높이가 `H`인 포화 이진 트리의 노드 개수는 ![formula](https://render.githubusercontent.com/render/math?math=2^{H}-1)개 이다.
    - 반대로 노드의 개수가 `N`개인 포화 이진 트리의 높이는 ![formula](<https://render.githubusercontent.com/render/math?math=\log_2(N%2B1)>)개 이다.
    - 깊이가 `D`인 포화 이진 트리의 외부 노드(leaf node) 개수는 ![formula](https://render.githubusercontent.com/render/math?math=2^{D})개 이다.
- **완전 이진 트리 (Complete Binary Tree)** : 마지막 레벨은 노드가 왼쪽에 몰려있고, 마지막 레벨을 제외하면 포화 이진 트리 구조를 띄고 있는 이진 트리
- **사향 이진 트리 (Skewed Binary Tree)** : linked list처럼 한 줄로 연결되어 있는 형태의 이진 트리

### Binary Tree 구현

### Binary Tree 시간 복잡도 & 공간 복잡도

### Binary Tree 활용