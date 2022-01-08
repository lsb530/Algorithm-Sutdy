## Queue (큐)

- 선형 자료구조
- 한 방향에서는 삽입 연산이, 반대 방향에서는 삭제 연산이 이루어진다.
- **FIFO(First In First Out)** : 먼저 들어간 원소가 먼저 나오는 구조이다.

### Queue 용어

- `Front` / `Head` : 큐에서 데이터가 삭제될 위치
- `Rear` / `Tail` : 큐에서 마지막 데이터가 삽입된 위치

### Queue 주요 연산

- `enQueue` : 큐의 rear에 원소 삽입
- `deQueue` : 큐의 front에 있는 원소 삭제 및 반환

### Queue 구현

- [Array를 통해 구현한 Queue](./code/Queue/ArrayQueue.java)
- [Singly Linked List를 통해 구현한 Queue](./code/Queue/LinkedQueue.java)
- 위 코드 실행 : [QueueExample.java](./code/Queue/QueueExample.java)

> Java에서 API로 Queue를 사용할 때, java.util.Queue는 인터페이스이며, 그 구현체로 java.util.LinkedList를 사용한다.
> 따라서 `Queue<String> queue = new LinkedList<String>()`로 선언해야 한다.

### Queue 시간 복잡도 & 공간 복잡도

- 데이터 삽입/삭제 : O(1)
- front 데이터 조회 : O(1)
- 특정 데이터 조회 : O(n)

### Queue 활용

- 프로세스 레디 큐
- 스케쥴링
- 캐시(Cache) 구현
- 네트워크 패킷 전송시 필요한 버퍼 대기 큐
- javascript의 Event Loop 관리 (비동기 처리)
- 키보드 버퍼
- 프린터의 출력 처리
- 너비 우선 탐색(BFS, Breadth-First Search)