class Node {
	int val;
	Node left;
	Node right;
	Node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}
public class TreeFindPath {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Inorder -> L R R -> 1 7 2 8 3 6 4
		// Preorder -> R L R -
//		  Binary Tree
//
//
//          8
//
//  7              4
//
//1      2        3
//                  6
//
//                  	data in the node :   path  from the root  --->    6  --> 8, 4 , 3, 6 or 6,3,4,8
//
//                                   -->   7   -->  8, 7 or 7,8
		TreeFindPath ftp = new TreeFindPath();
		Node root = new Node(8);
		root.left = new Node(7);
		root.left.left = new Node(1);
		root.left.right = new Node(2);
		root.right = new Node(4);
		root.right.left = new Node(3);
		root.right.left.right = new Node(6);
		int find = 2;
		
		if(find == root.val) {
			System.out.print(find);
		} else {
			boolean leftFound = ftp.findNode(root.left, find);
			boolean rightFound = ftp.findNode(root.right, find);
			System.out.print(root.val);
			if(leftFound) {
				ftp.printPath(root.left, find);
			} else if(rightFound) {
				ftp.printPath(root.right, find);
			}
		}
	}
	public void printPath(Node root, int find) {
		
		if(root == null) {
			return;
		}
		System.out.print(root.val);
		if(root.val == find) {
			return;
		}
		printPath(root.left, find);
		printPath(root.right, find);
	}
	public boolean findNode(Node root, int find) {
		if(root == null) {
			return false;
		}
			
		if(find == root.val) {
			return true;
		}
		
		return findNode(root.left, find) || findNode(root.right, find);
	}

}
