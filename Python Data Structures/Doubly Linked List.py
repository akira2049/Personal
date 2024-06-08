# Define the Node class, which represents the individual elements in a doubly linked list
class Node:
    def __init__(self, value):
        self.data = value  # Store the value of the node
        self.next = None  # Pointer to the next node in the list, initially set to None
        self.prev = None  # Pointer to the previous node in the list, initially set to None

# Define the DoublyLinkedList class
class DoublyLinkedList:
    def __init__(self):
        self.head = None  # Pointer to the first node in the list, initially set to None
        self.tail = None  # Pointer to the last node in the list, initially set to None

    # Add a new node at a specific index in the list
    def add_node_at_index(self, index, value):
        # If the index is 0, we are adding a new head node
        if index == 0:
            new_node = Node(value)
            new_node.next = self.head

            # Update the previous pointer of the old head, if it exists
            if self.head:
                self.head.prev = new_node

            self.head = new_node
            self.tail = self.head
        else:
            current = self.head

            new_node = Node(value)

            # Traverse the list to find the node just before the insertion point
            # This loop will run until we reach the node before the desired index
            for i in range(index - 1):
                current = current.next
                # If the next node is None, we've reached the end of the list
                if current.next is None:
                    self.tail = new_node

            # Update the previous pointer of the node after the new node, if it exists
            if current.next:
                current.next.prev = new_node

            new_node.next = current.next
            new_node.prev = current
            current.next = new_node

    # Remove a node at a specific index in the list
    def remove_node_at_index(self, index):
        # If the index is 0, we are removing the head node
        if index == 0:
            self.head = self.head.next
            self.head.prev = None

            # If there's only one element left in the list, update the tail pointer
            if self.head and self.head.next is None:
                self.tail = self.head
        else:
            current = self.head

            # Traverse the list to find the node just before the one to be removed
            # This loop will run until we reach the node before the desired index
            for i in range(index - 1):
                current = current.next

            current.next = current.next.next

            # If the next node is None, we've reached the end of the list, so update the tail pointer
            if current.next is None:
                self.tail = current

            # Update the previous pointer of the node after the removed node, if it exists
            if current.next:
                current.next.prev = current

    # Remove a node with a specific value from the list
    def remove_node(self, value):
        # If the head node contains the value to remove
        if self.head.data == value:
            self.head = self.head.next

            # Update the previous pointer of the new head node, if it exists
            if self.head:
                self.head.prev = None

            # If there's only one element left in the list, update the tail pointer
            if self.head and self.head.next is None:
                self.tail = self.head
        else:
            current = self.head

            # Traverse the list, looking for the node
        # Traverse the list, looking for the node to remove
        while current.next:
            # If the next node's data matches the value to remove
            if current.next.data == value:
                # Update the next pointer of the current node to skip the next node
                current.next = current.next.next

                # Update the previous pointer of the node after the removed node, if it exists
                if current.next:
                    current.next.prev = current
            else:
                # If the next node's data does not match the value to remove, move to the next node
                current = current.next

        # Update the tail pointer to the last node in the list
        self.tail = current

    # Add a node to the end of the list
    def add_node(self, value):
        # If the list is empty, create a new head node
        if self.head is None:
            self.head = Node(value)
            self.tail = self.head
        else:
            current = self.head

            # Traverse the list to find the last node
            while current.next is not None:
                current = current.next

            # Create a new node and link it to the previous last node
            new_node = Node(value)
            current.next = new_node
            new_node.prev = current
            self.tail = new_node

    # Print the list from head to tail and then from tail to head
    def print_list(self):
        h = self.head
        # Print the list from head to tail
        while h.next is not None:
            print(h.data, end=" ")
            h = h.next

        # Print the last node's data
        print(h.data)
        print(" ")

        t = self.tail
        # Print the list from tail to head
        while t.prev is not None:
            print(t.data, end=" ")
            t = t.prev

        # Print the first node's data
        print(t.data)

        print(" ")

  
    # Remove the last node from the list
    def remove_last_node(self):
        # Update the tail pointer to the previous node
        self.tail = self.tail.prev
        # Set the next pointer of the new tail node to None
        self.tail.next = None


def main():
  # Create a new doubly linked list
  dll = DoublyLinkedList()
  # Add nodes to the list
  dll.add_node(3)  # Index 0
  dll.add_node(13)  # Index 1
  dll.add_node(32)  # Index 2
  dll.add_node(33)  # Index 3

  # Print the list
  dll.print_list()

  # Remove the last node from the list
  dll.remove_last_node()

  # Print the list after removing the last node
  dll.print_list()

main()