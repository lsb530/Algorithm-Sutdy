class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, value):
        new_head = Node(value)
        new_head.next = self.head
        self.head = new_head

    def pop(self):
        if self.is_empty():
            return "stack is Empty"
        deleted_head = self.head
        self.head = self.head.next
        return deleted_head

    def peek(self):
        if self.is_empty():
            return "stack is Empty"
        return self.head.data

    def is_empty(self):
        return self.head is None

stack = Stack()
stack.push(4)
print(stack.peek()) # stack.head.data

stack.push(3)
print(stack.peek())

stack.push(5)
print(stack.peek())

print()

stack.pop()
print(stack.peek())

stack.pop()
print(stack.peek())

stack.pop()
print(stack.peek())
