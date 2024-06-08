# Define a node class for the doubly linked list
class node:
    # Initialize a node with a value and pointers to the next and previous nodes
    def __init__(self, value):
        self.data = value
        self.next = None
        self.prev = None

# Define a doubly linked list class
class dll:
    # Initialize an empty doubly linked list with head and tail pointers
    def __init__(self):
        self.head = None
        self.tail = None

    # Insert a node with the given value at the specified index
    def addInd(self, ind, val):
        if ind == 0:
            newNode = node(val)
            newNode.next = self.head

            # Update the previous pointer of the head, if the list is not empty
            if self.head:
                self.head.prev = newNode

            self.head = newNode
            self.tail = self.head
        else:
            current = self.head

            newNode = node(val)

            # Iterate through the list to find the insertion point
            for i in range(ind - 1):
                current = current.next
                if current.next == None:
                    self.tail = newNode

            # Update the previous pointer of the next node, if it exists
            if current.next:
                current.next.prev = newNode
            
            newNode.next = current.next

            # Update the previous pointer of the new node
            newNode.prev = current
            
            current.next = newNode

    # Remove the node at the specified index
    def removeInd(self, ind):
        if ind == 0:
            self.head = self.head.next
            # Update the previous pointer of the new head, if it exists
            self.head.prev = None

            if self.head and self.head.next == None:
                self.tail = self.head

        else:
            current = self.head
            for i in range(ind - 1):
                current = current.next
            
            current.next = current.next.next

            # Update the tail pointer, if the removed node was the last node
            if current.next == None:
                self.tail = current

            # Update the previous pointer of the new next node, if it exists
            if current.next:
                current.next.prev = current

    # Remove the first occurrence of a node with the given value
    def removeNode(self, value):
        if self.head.data == value:
            self.head = self.head.next

            # Update the previous pointer of the new head, if it exists
            if self.head:
                self.head.prev = None
        
            if self.head and self.head.next == None:
                self.tail = self.head
        else:
            current = self.head

            self.removeNodeR(current, value)

    # Recursive helper function to remove a node with the given value
    def removeNodeR(self, current, value):
        if current.next == None:
            self.tail = current
        else:
            if current.next.data == value:
                current.next = current.next.next

                if current.next:
                    current.next.prev = current
            else:
                current = current.next
            self.removeNodeR(current, value)

    # Add a node with the given value at the end of the list
    def addNode(self, value):
        if self.head == None:
            self.head = node(value)
            self.tail = self.head
        else:
            current = self.head
            self.addNodeR(current, value)

    # Recursive helper function to add a node at the end of the list
    def addNodeR(self, current, value):
        if current.next == None:
            newNode = node(value)
            current.next = newNode
            newNode.prev = current
            self.tail = newNode

        else:
          current = current.next
          self.addNodeR(current, value)

    # Print the elements of the list from head to tail and then from tail to head
    def printList(self):
        h = self.head
        while h.next != None:
            print(h.data, end=" ")
            h = h.next

        print(h.data)
        print(" ")

        t = self.tail
        while t.prev != None:
            print(t.data, end=" ")
            t = t.prev

        print(t.data)

        print(" ")

    # Remove the last element of the list
    def removeBack(self):
        self.tail = self.tail.prev
        self.tail.next = None

def main():
  a = dll()
  a.addNode(3) # 0
  a.addNode(13) # 1
  a.addNode(32) # 2
  a.addNode(331) # 3
  a.printList()
  a.removeNode(32)
  a.printList()

main()