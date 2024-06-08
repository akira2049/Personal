class Node:
    # Node constructor
    def __init__(self, value):
        self.data = value
        self.left = None
        self.right = None


def add(node, value):
    # If the current node is None, create a new node with the given value
    if node is None:
        return Node(value)

    # If the value is greater than the current node's data, add it to the right subtree
    elif value > node.data:
        node.right = add(node.right, value)

    # If the value is smaller than the current node's data, add it to the left subtree
    elif value < node.data:
        node.left = add(node.left, value)

    return node


def print_bst(node):
    if node is None:
        return
    # Print the right subtree first (in descending order)
    print_bst(node.right)
    # Print the current node's data
    print(node.data, end=" ")
    # Print the left subtree
    print_bst(node.left)


def find_value(node, key):
    # If the current node is None, the key is not in the tree
    if node is None:
        return False

    # If the current node's data is equal to the key, the key is found
    elif node.data == key:
        return True

    # If the key is greater than the current node's data, search in the right subtree
    elif key > node.data:
        return find_value(node.right, key)

    # If the key is smaller than the current node's data, search in the left subtree
    elif key < node.data:
        return find_value(node.left, key)


def minValue(r):
    if r == None: 
      return -1000
    elif r.left == None: 
      return r.data
    else: 
      return minValue(r.left)

def remove(node, value):
    if node is None:
        return

    # If the value is greater than the current node's data, search in the right subtree
    elif value > node.data:
        node.right = remove(node.right, value)
    # If the value is smaller than the current node's data, search in the left subtree
    elif value < node.data:
        node.left = remove(node.left, value)
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
            minV = minValue(node.right)
            node.data = minV
            node.right = remove(node.right, minV)

    return node


def main():
    root = None
    root = add(root, 5)
    root = add(root, 3)
    root = add(root, 1)
    root = remove(root, 3)
    print_bst(root)



main()