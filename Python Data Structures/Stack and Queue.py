# Define a custom Stack class
class myStack:
    # Initialize an empty list to store stack elements
    def __init__(self):
        self.elements = []

    # Define a method to pop the top element of the stack
    def pop(self):
        return self.elements.pop()

    # Define a method to push an element onto the stack
    def push(self, v):
        self.elements.append(v)

    # Define a method to check if the stack is empty
    def isEmpty(self):
        return len(self.elements) == 0

# Define a custom Queue class
class myQueue:
    # Initialize an empty list to store queue elements
    def __init__(self):
        self.elements = []

    # Define a method to dequeue the first element of the queue
    def dequeue(self):
        return self.elements.pop(0)

    # Define a method to enqueue an element to the end of the queue
    def enqueue(self, v):
        self.elements.append(v)

    # Define a method to check if the queue is empty
    def isEmpty(self):
        return len(self.elements) == 0

def main():
  # Create a stack object
  s = myStack()
  s.push(10)
  s.push(11)
  s.push(12)
  s.push(13)

  # Create a queue object
  q = myQueue()
  q.enqueue(10)
  q.enqueue(11)
  q.enqueue(12)
  q.enqueue(13)

  # Pop and print all elements from the stack
  while not (s.isEmpty()):
      print(s.pop(), end=" ")

  print(" ")

  # Dequeue and print all elements from the queue
  while not (q.isEmpty()):
      print(q.dequeue(), end=" ")

main()