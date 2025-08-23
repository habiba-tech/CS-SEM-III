class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
        
class BST:
    def __init__(self):
        self.root = None
        
    def insert(self, root , value):
        """
        Recursively insert a value inti the BST following these rules:
        - If the tree is empty, insert the new node as the root.
        - Tf value is less thsn current nodes data insert in the left subtree.
        -If value is greater or equal insert in the right subtree.
        """
        
        if root is None:
            return Node (value)
        if value < root.data:
            root.left = self.insert(root.left, value)
        else:
            root.right = self.insert(root.right, value)
        return root # Return the unchange root pointer
    
    def inorder (self,node):
        """
        Inoder Traversal (Left, Root, Right)
        Prints Values in ascending order for a BST
        """
        if node:
            self.inorder(node.left)        # Visit left Subtree
            print(node.data, end=" ")      #Visit current node
            self.inorder (node.right)      # visit right subtree
            
    def preorder (self,node):
        """
        preoder Traversal (Root, Left, Right)
        Useful for creating a copy of the tree
        """
        if node:
            print(node.data, end=" ")       # visit current node
            self.inorder(node.left)        # Visit left Subtree
            self.preorder (node.right)     # visit right subtree
            
    def postorder (self,node):
        """
        postoder Traversal (Root, Left, Right)
        Useful for deleting the tree (deallocating memory)
        """
        if node:
            self.postorder(node.left)        # Visit left Subtree
            self.postorder (node.right)     # visit right subtree
            print(node.data, end=" ")       # Visit current node
            
            
dataset = [50, 30, 70, 20, 40, 60, 80]  # Dataset to built the BST
bst = BST() # create an instance of BST

# Insert all values from dataset into the bst
for value in dataset:
    bst.root = bst.insert (bst.root, value)
    
# Traversals
print("Inorder Traversal (sorted order) : ")
bst.inorder(bst.root)

print("\nPostorder Traversal : ")
bst.preorder(bst.root)

print("\nPostorder Traversal : ")
bst.postorder(bst.root)
