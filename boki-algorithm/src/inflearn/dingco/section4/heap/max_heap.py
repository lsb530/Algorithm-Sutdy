class MaxHeap:
    def __init__(self):
        self.items = [None]

    # O(logN)
    def insert(self, value):
        # 1. 맨 마지막에 원소 추가 & 현재 인덱스 구하기
        # 2. 부모 노드와 비교해서 자리 변경 & 인덱스 변경
        self.items.append(value)
        cur_index = len(self.items) - 1

        while cur_index != 1:  # root node
            # heapify
            # 부모 노드와 비교해서 자신이 더 크면 위치 변경
            parent_index = cur_index // 2
            if self.items[cur_index] > self.items[parent_index]:
                self.items[cur_index], self.items[parent_index] = self.items[parent_index], self.items[cur_index]
                cur_index = parent_index
            else:
                break

    # O(logN)
    def delete(self):
        # 0. 항상 맨 위의 루트 노드가 삭제됨
        # 1. 루트 노드와 맨 끝에 있는 원소 교체
        # 2. 맨 뒤에 있는 원소(원래의 루트 노드) 삭제 -> 반환
        # 3. heapify
        # 4. root노드부터 부모와 왼쪽 자식, 부모와 오른쪽 자식을 비교 후 더 큰 값이 부모와 교체
        # 5. 하위도 반복
        self.items[1], self.items[-1] = self.items[-1], self.items[1]
        prev_max = self.items.pop()
        cur_index = 1

        while cur_index <= len(self.items) - 1:
            left_child_index = cur_index * 2
            right_child_index = cur_index * 2 + 1
            max_index = cur_index

            if left_child_index <= len(self.items) - 1 and self.items[left_child_index] > self.items[max_index]:
                max_index = left_child_index

            if right_child_index <= len(self.items) - 1 and self.items[right_child_index] > self.items[max_index]:
                max_index = right_child_index

            if max_index == cur_index:
                break

            self.items[cur_index], self.items[max_index] = self.items[max_index], self.items[cur_index]
            cur_index = max_index

        return prev_max


# [None, ...]
# 1. 맨 뒤에 원소 삽입
# 2. 부모와 비교해서 자신의 값이 더 크면 부모와 교체
# 3. 2의 과정을 부모가 더 크거나 루트 노드에 달했을 때까지 반복
max_heap = MaxHeap()
max_heap.insert(8)
max_heap.insert(6)
max_heap.insert(7)
max_heap.insert(2)
max_heap.insert(5)
max_heap.insert(4)
print(max_heap.items)  # [None, 8, 6, 7, 2, 5, 4]
print(max_heap.delete())  # 8 을 반환해야 합니다!
print(max_heap.items)  # [None, 7, 6, 4, 2, 5]
