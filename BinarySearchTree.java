public class BinarySearchTree {

	// node structure
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data) { 
			this.data = data; 
		}
		
		@Override
		public String toString() {
			return "Node [data=" + data + ", leftChild=" + left + ", rightChild=" + right + "]";
		}
	} 
	
	// binary tree root
	static Node root;
	
	// add node to the binary tree
	static void addNode(int data) {	
		// create new node
		Node newNode = new Node(data);
		// checking parent node
		if (root == null) {
			root = newNode;
		}else {		
			insertNode(root, newNode);
		}
	}	
	
	// insert new node to the parent node
	static void insertNode(Node parent, Node child) {
		// comparing new node with root node
		if (child.data <= parent.data) {
			if (parent.left == null) parent.left = child; 
			else insertNode(parent.left, child);				
		} else {
			if (parent.right == null) parent.right = child;
			else insertNode(parent.right, child);				
		}
	}
	
	// search successor node in binary search tree
	public static Node getSuccessorNode(Node node) {
		// checking node
		if (node.left == null) {
			return node;
		} else { 
			return getSuccessorNode(node.left);
		}
	}

	
	// search node in binary search tree
	public static Node searchNode(Node node, int data) {
		// checking node
		if ((node == null) || (node.data == data)) {
			return node;
		} else if (data < node.data) {
			return searchNode(node.left, data);
		} else {
			return searchNode(node.right, data);
		} 
	}
	
	// delete node
	static Node deleteNode(Node node, int data) {
		// checking node
		if (node == null) return null;
		// comparing root node data with delete data
		
		if (data < node.data) {
			node.left = deleteNode(node.left, data);
			
		} else if (data > node.data) {
			node.right = deleteNode(node.right, data); 
			
		} else {
			// if nodeToBeDeleted have both children
			if (node.left != null && node.right != null) {
				// Finding minimum element from right
				Node successorNode = getSuccessorNode(node.right);
				// Replacing current node with minimum node from right subtree
				node.data = successorNode.data;
				// Deleting successor node from right now
				node.right = deleteNode(node.right, successorNode.data); 
				
			} else if (node.left != null) { // if nodeToBeDeleted has only left child		
				node = node.left;
				if(root.data == data)root = node;
				
			} else if (node.right != null) { // if nodeToBeDeleted has only right child
				node = node.right;
				if(root.data == data)root = node;
				
			} else { // if nodeToBeDeleted do not have child (Leaf node)
				node = null;				
			}
		}
		return node;
	}

	// pre order traversal
	static void preOrderTraverse(Node node) {
		if(node != null) {
			// print node
			System.out.println(node.data);
			// traverse left
			preOrderTraverse(node.left);
			// traverse right
			preOrderTraverse(node.right);
		}
	}	
	
	// post order traversal
	static void postOrderTraverse(Node node) {
		if(node != null) {
			// traverse left
			postOrderTraverse(node.left);
			// traverse right
			postOrderTraverse(node.right);
			// print node
			System.out.println(node.data);
		}
	}	
	
	// in order traversal
	static void inOrderTraverse(Node node) {
		if(node != null) {
			// traverse left
			inOrderTraverse(node.left);
			// print node
			System.out.println(node.data);
			// traverse right
			inOrderTraverse(node.right);
		}
	}
	
}
