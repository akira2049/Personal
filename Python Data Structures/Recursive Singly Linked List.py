# Define a class "node" to represent a node in a linked list
class node:
    # Initialize the node with data and a "next" pointer set to None
    def __init__(self, data):
        self.data = data
        self.next = None

# Define a class "LinkedList" to represent a singly linked list
class LinkedList:
    # Initialize the linked list with a "head" pointer set to None
    def __init__(self):
        self.head = None

    # A recursive helper function to add a new node with a given value
    # to the linked list after the last node
    def addNodeR(self, current, value):
        # If the current node's "next" pointer is None,
        # create a new node with the given value, and
        # set the current node's "next" pointer to the new node
        if current.next == None:
            newNode = node(value)
            current.next = newNode
        else:
            # If the current node's "next" pointer is not None,
            # move to the next node and call the helper function recursively
            current = current.next
            self.addNodeR(current, value)

    # Add a new node with a given value to the linked list
    def addNode(self, value):
        # If the linked list is empty, create a new node with the given value
        # and set the "head" pointer to the new node
        if self.head == None:
            self.head = node(value)
        else:
            # If the linked list is not empty, call the recursive helper function
            # to add the new node with the given value
            current = self.head
            self.addNodeR(current, value)

    # A recursive helper function to print the data of each node in the linked list
    def printListR(self, n):
        # If the current node is None, return
        if n == None:
            return
        else:
            # If the current node is not None, print its data, move to the next node,
            # and call the helper function recursively
            print(n.data, end=" ")
            n = n.next
            self.printListR(n)

    # Print the data of each node in the linked list
    def printList(self):
        n = self.head
        self.printListR(n)

# The main function to test the LinkedList class
def main():
    # Create a new linked list
    b = LinkedList()
    # Add nodes with values 6, 8, and 81 to the linked list
    b.addNode(6)
    b.addNode(8)
    b.addNode(81)
    # Print the data of each node in the linked list
    b.printList()

# Call the main function
main()