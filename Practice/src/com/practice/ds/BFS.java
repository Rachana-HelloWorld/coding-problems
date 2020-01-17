package com.practice.ds;

import java.util.LinkedList;
import java.util.Queue;

// Prints the level order traversal(bfs) of a given binary tree
public class BFS {

	TreeNode root;

	void levelOrderTraversal() {

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			TreeNode tmp = queue.poll();
			System.out.print(tmp.getData() + " ");

			if (tmp.getLeft() != null)
				queue.add(tmp.getLeft());
			if (tmp.getRight() != null)
				queue.add(tmp.getRight());
		}
	}

	public static void main(String[] args) {

		BFS bfs = new BFS();
		bfs.root = new TreeNode(5);
		bfs.root.setLeft(new TreeNode(2));
		bfs.root.setRight(new TreeNode(3));
		bfs.root.getLeft().setLeft(new TreeNode(1));
		bfs.root.getLeft().setRight(new TreeNode(9));
		
		bfs.levelOrderTraversal();

	}

}
