package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 节点生成二叉树以及三中遍历方式：先序，中序，后序
 * @author 陈桂林
 * 
 */
// 定义节点
public class Node {
	private int data;
	private Node leftNode = null;
	private Node rightNode = null;

	public Node(int data) {
		super();
		this.data = data;
	}

	/*
	 * 生成树
	 */
	public static List<Node> creatTree(List<Node> nodes) {
		List<Node> tree = new LinkedList<Node>();
		for (int i = 0; i < nodes.size(); i++) {
			nodes.get(i).leftNode = nodes.get(2 * i + 1);
			if (2 * i + 2 > nodes.size() - 1) {
				nodes.get(i).rightNode = null;
				break;
			} else {
				nodes.get(i).rightNode = nodes.get(2 * i + 2);
			}
			tree.add(nodes.get(i));
		}
		return tree;
	}

	// 先序遍历
	public static void FirstRoot(Node node) {
		if (node == null)
			return;
		System.out.print(node.data+" ");
		FirstRoot(node.leftNode);
		FirstRoot(node.rightNode);
	}

	// 中序遍历
	public static void midleRoot(Node node) {
		if (node == null)
			return;
		midleRoot(node.leftNode);
		System.out.print(node.data+" ");
		midleRoot(node.rightNode);
	}

	// 后序遍历
	public static void lastRoot(Node node) {
		if (node == null)
			return;
		lastRoot(node.leftNode);
		lastRoot(node.rightNode);
		System.out.print(node.data+" ");
	}

	// 测试
	public static void main(String[] args) {
		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < 10; i++) {
			nodes.add(new Node(i + 1));
		}
		List<Node> tree = creatTree(nodes);
		// for (Node node : nodes) {
		// System.out.println(node.data);
		// }
		Node root = tree.get(0);
		System.out.println("先序遍历");
		FirstRoot(root);
		System.out.println();
		System.out.println("中序遍历");
		midleRoot(root);
		System.out.println();
		System.out.println("后序遍历");
		lastRoot(root);
	}

}
