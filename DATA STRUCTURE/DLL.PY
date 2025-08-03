# Define the Node class to represent each element in the linked list
class node:
    def _init_(self, data):
        self.data = data      # Store the data value
        self.next = None      # Pointer to the next node (initially None)

# Define the Linked List class
class Linkedlist:
    def _init_(self, data):
        self.head = None      # Head pointer to the first node of the list
        self.data = None      # Unused placeholder; can be removed

    # Method to insert a node at the end of the list
    def insert(self, newnode):
        if self.head is None:             # If list is  empty
            self.head = newnode           # Set new node as the head
        else:
            lastnode = self.head          # Start from head
            while lastnode.next is not None:  # Traverse till the last node
                lastnode = lastnode.next
            lastnode.next = newnode       # Link the last node to the new node

    # Method to delete a node by value
    def delete(self, value):
        current = self.head       # Start from head
        previous = None           # To keep track of previous node

        # Case 1: Node to delete is the head node
        if current is not None and current.data == value:
            self.head = current.next   # Move head to next node
            current = None            # Delete current node
            return                    # Exit after deletion

        # Case 2: Search for the value to delete
        while current is not None and current.data != value:
            previous = current            # Move previous to current
            current = current.next        # Move current to next

        # If value is not found in list
        if current is None:
            print("Value not found in the list")
            return

        # Case 3: Unlink the node to delete it
        previous.next = current.next  # Skip the current node
        current = None                # Delete node

    # Method to print (traverse) the linked list
    def printlist(self):
        currentnode = self.head           # Start from head
        while currentnode is not None:    # Loop till end of list
            print(currentnode.data)       # Print the data of current node
            currentnode = currentnode.next  # Move to the next node

# Create individual node objects with values
fnode = node(1)        # First node with data 1
snode = node(2)        # Second node with data 2
tnode = node(3)        # Third node with data 3

# Create LinkedList object and insert nodes into it
Linkedlist = Linkedlist(None)  # Create LinkedList object (initially empty)

Linkedlist.insert(fnode)       # Insert first node
Linkedlist.insert(snode)       # Insert second node
Linkedlist.insert(tnode)       # Insert third node

# Display the list before deletion
print("List before deletion:")
Linkedlist.printlist()

# Delete node with value 2
Linkedlist.delete(2)

# Display the list after deletion
print("List after deleting value 2:")
Linkedlist.printlist()

