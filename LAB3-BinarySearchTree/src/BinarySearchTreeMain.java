import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTreeMain {

	ArrayList<Integer> nodelist = new ArrayList<>();

	private static Node Newnode(int n) {
		Node temp = new Node();
		temp.left = null;
		temp.key = n;
		temp.right = null;

		return temp;
	}

	private void insert(Node root, Node newnode) {

		if (newnode.key < root.key) {
			if (root.left == null) {
				root.left = newnode;
			} else {
				insert(root.left, newnode);
			}
		} else {
			if (root.right == null) {
				root.right = newnode;
			} else {
				insert(root.right, newnode);
			}
		}
	}

	private void Inorder(Node root) {
		if (root != null) {
			Inorder(root.left);
			nodelist.add(root.key);
			Inorder(root.right);
		}
	}

	public static void main(String[] args) {

		BinarySearchTreeMain bst = new BinarySearchTreeMain();
		Node root = null;
		Node newnode = null;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of Node's you want to have");
		int num = in.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the Data for the Node");
			int n = in.nextInt();
			newnode = Newnode(n);

			if (root == null) {
				root = newnode;
			} else {
				bst.insert(root, newnode);

			}
		}
		bst.Inorder(root);

		System.out.println(bst.nodelist);

		System.out.println("Enter the Sum");
		int Sum = in.nextInt();
		int flag = 0;

		for (int j = 0; j < bst.nodelist.size(); j++) {
			int n1 = bst.nodelist.get(j);
			int n2 = Sum - n1;

			if (bst.nodelist.contains(n2)) {
				System.out.println("The combination have been found");
				System.out.println("The pair is" + " " + "[" + n1 + "," + n2 + "]");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Failed to find the pair");
		}
		in.close();
	}
}
