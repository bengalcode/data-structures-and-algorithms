public class Tree {

	// node structure
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	// create node
	static Node create_node(int data) {
		return new Node(data);
	}

	// add parent left child
	static void add_left_child(Node parent, Node child) {
		parent.left = child;
	}

	// add parent right child
	static void add_right_child(Node parent, Node child) {
		parent.right = child;
	}

	// create tree
	static Node create_tree() {
		// create root node
		Node two = create_node(2);

		// create add left child with parent two
		Node seven = create_node(7);
		add_left_child(two, seven);
		// create and right child with parent two
		Node nine = create_node(9);
		add_right_child(two, nine);

		// create and left child with parent seven
		Node one = create_node(1);
		add_left_child(seven, one);
		// create and right child with parent seven
		Node six = create_node(6);
		add_right_child(seven, six);

		// create and right child with parent nine
		Node eight = create_node(8);
		add_right_child(nine, eight);

		// create and left child with parent six
		Node five = create_node(5);
		add_left_child(six, five);
		// create and right child with parent six
		Node ten = create_node(10);
		add_right_child(six, ten);

		// create and left child with parent eight
		Node three = create_node(3);
		add_left_child(eight, three);
		// create and right child with parent eight
		Node four = create_node(4);
		add_right_child(eight, four);

		// return root node
		return two;
	}

	// pre order traversal (root, left, right)
	static void pre_order_traversal(Node root) {
		// print root node
		System.out.println(root.data);
		// check left child
		if (root.left != null) {
			pre_order_traversal(root.left);
		}
		// check right child
		if (root.right != null) {
			pre_order_traversal(root.right);
		}
	}

	// post order traversal
	static void post_order_traversal(Node root) {
		// check left child
		if (root.left != null) {
			post_order_traversal(root.left);
		}
		// check right child
		if (root.right != null) {
			post_order_traversal(root.right);
		}
		// print root node
		System.out.println(root.data);
	}

	// post order traversal
	static void in_order_traversal(Node root) {
		// check left child
		if (root.left != null) {
			in_order_traversal(root.left);
		}
		// print root node
		System.out.println(root.data);
		// check right child
		if (root.right != null) {
			in_order_traversal(root.right);
		}
	}

}
