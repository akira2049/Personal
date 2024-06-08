class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

  
class LinkedList:
    def __init__(self):
        self.root = None

    def append(self, value):
        new_node = Node(value)
        if self.root == None:
            self.root = new_node
            return self.root
        current_node = self.root

        while current_node.next != None:
            current_node = current_node.next
        current_node.next = new_node

    def insert(self, index, value):
        new_node = Noda(value)
        if index == 0:
            new_node.next = self.head
            self.head = new_node

        current_node = self.head
        for index in range(index - 1):
            current_node = current_node.next

        current_node.next = new_node
        new_node.next = current_node.next

    def pop(self):
        current_node = self.head

        while current_node.next.next != None:
            current_node = current_node.next

        current_node.next = current_node.next.next

    def remove(self, value):
        current_node = self.head

        while current_node.next.data != value:
            current_node = current_node.next

        current_node.next = current_node.next.next
        
      
        