

class Node:
    # Node constructor
    def __init__(self, value):
        self.data = value
        self.left = None
        self.right = None

class BST:
  def __init__(self):
    self.root = None

  def add(self, n, value):
      # If the current node is None, create a new node with the given value
      if n is None:
          return Node(value)

      # If the value is greater than the current node's data, add it to the right subtree
      elif value > n.data:
          n.right = self.add(n.right, value)

      # If the value is smaller than the current node's data, add it to the left subtree
      elif value < n.data:
          n.left = self.add(n.left, value)

      return n

  def addNode(self, v):
    self.root = self.add(self.root, v)

  def print_bst(self,node):
      if node is None:
          return
      # Print the right subtree first (in descending order)
      self.print_bst(node.right)
      # Print the current node's data
      print(node.data, end=" ")
      # Print the left subtree
      self.print_bst(node.left)

  def printBST(self):
    self.print_bst(self.root)


  def minValue(self, r):
    if r == None: 
      return -1000
    elif r.left == None: 
      return r.data
    else: 
      return self.minValue(r.left)

  def remove(self, node, value):
      if node is None:
          return

      # If the value is greater than the current node's data, search in the right subtree
      elif value > node.data:
          node.right = self.remove(node.right, value)

      # If the value is smaller than the current node's data, search in the left subtree
      elif value < node.data:
          node.left = self.remove(node.left, value)
      
      
      else:
          # If the current node has no children, remove the node
          if node.left is None and node.right is None:
              return None

          # If the current node has only a right child, remove the node and return the right child
          if node.left is None:
              return node.right

          # If the current node has only a left child, remove the node and return the left child
          if node.right is None:
              return node.left

          else:
            minV = self.minValue(node.right)
            node.data = minV
            node.right = self.remove(node.right, minV)

      return node


  def removeNode(self, v):
    self.root = self.remove(self.root, v)

def main():
    '''
    root = None
    root = add(root, 5)
    root = add(root, 3)
    root = add(root, 1)
    root = remove(root, 3)
    print_bst(root)
    '''
    b = BST()
    b.addNode(5)
    b.addNode(10)
    b.addNode(-5)
    b.addNode(15)
    b.printBST()
    b.removeNode(10)
    print("")
    b.printBST()

main()