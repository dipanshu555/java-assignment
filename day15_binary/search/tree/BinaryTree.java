package day15_binary.search.tree;

class Node {
	int data;
	Node left;
	Node right;

}

public class BinaryTree {
	public Node createNewNode(int k) {
		Node bst = new Node();
		bst.data = k;
		bst.left = null;
		bst.right = null;
		return bst;
	}

	public Node insert(Node root, int val) {
		if (root == null) {
			return createNewNode(val);
		}
		if (val < root.data) {
			root.left = insert(root.left, val);
		} else if (val > root.data) {
			root.right = insert(root.right, val);
		}
		return root;
	}

	public void print(Node root) {
		if (root == null) {
			return;
		}
		print(root.left);
		System.out.println(root.data);
		print(root.right);
	}

	public int size(Node node) {
		if (node == null)
			return 0;
		else
			return (size(node.left) + 1 + size(node.right));
	}

	public boolean search(Node root, int val) {
		if (root == null) {
			return false;
		}
		if (val < root.data) {
			return search(root.left, val);
		} else if (root.data == val) {
			return true;
		} else {
			return search(root.right, val);
		}
	}
}
