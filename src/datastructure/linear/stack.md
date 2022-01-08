## Stack (스택)

- 선형 자료구조
- 삽입, 삭제 연산이 한 방향에서 이루어진다.
- **LIFO(Last In First Out)** : 나중에 들어간 원소가 먼저 나오는 구조이다.

### Stack 용어

- `Top` : 스택에 데이터가 삽입될 위치

### Stack 주요 연산

- `push` : 스택의 top에 원소 삽입
- `pop` : 스택의 top에 있는 원소 삭제 및 반환
- `peek` : 스택의 top에 있는 원소 반환

### Stack 구현

- [Array를 통해 구현한 Stack](./code/Stack/ArrayStack.java)
- [Singly Linked List를 통해 구현한 Stack](./code/Stack/LinkedStack.java)
- 위 코드 실행 : [StackExample.java](./code/Stack/StackExample.java)

### Stack 시간 복잡도 & 공간 복잡도

- 데이터 삽입/삭제 : O(1)
- top 데이터 조회 : O(1)
- 특정 데이터 조회 : O(n)

### Stack 활용

- 시스템 스택(System Stack) / 실행시간 스택(Runtime stack) : 프로그램의 함수 호출과 복귀에 따른 실행 순서 관리
- 인터럽트 루틴 처리
- 웹 브라우저 방문 기록 관리 (뒤로가기)
- 실행 취소 (undo)
- 수식의 후위 표기법(Postfix Notation)
- 수식의 괄호식 검사
- 계산기 검사
- 깊이 우선 탐색(DFS, Depth-First Search)

> **프로그램의 함수 호출과 복귀에 따른 실행 순서 관리는 다음과 같은 과정을 가진다.**
>
> 1. 함수 호출이 발생하면 스택 프레임(stack frame)에 지역변수, 매개변수, 수행 후 복귀할 주소 등의 정보를 저장하여 시스템 스택에 삽입한다.
> 2. 함수의 실행이 끝나면 시스템 스택의 top에 있는 stack frame 원소를 pop하고, frame에 저장되어 있던 복귀 주소를 확인하고 복귀한다.
> 3. 함수 호출 - 복귀에 따라 이 과정을 반복하고, 전체 프로그램 수행이 종료되면 시스템 스택은 공백 스택이 된다.
>
> 함수 호출은 가장 마지막에 호출된 함수가 가장 먼저 실행을 완료하고 복귀하는 후입선출 구조이기 때문에, 스택을 이용해 관리한다.