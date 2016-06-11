package jianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;
/**
 * 
 * 利用栈，反向输出链表
 * @author 陈桂林
 *
 */
class ListNode {
	int val;
	ListNode next = null;

	public ListNode(int val, ListNode next) {
		super();
		this.val = val;
		this.next = next;
	}

}

public class FanXiangPrintList {

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> nodeList = new ArrayList<Integer>();
		Stack<ListNode> stack = new Stack<ListNode>();
		if (listNode == null) {
			return nodeList;
		}
		stack.push(listNode);
		while (listNode.next != null) {
			stack.push(listNode.next);
			listNode = listNode.next;
		}
		while (!stack.isEmpty()) {
			ListNode node = stack.pop();
			nodeList.add(node.val);
		}
		return nodeList;
	}
	

}
