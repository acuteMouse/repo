package jianzhiOffer;

import java.util.Stack;
/**
 * 用两个栈模拟一个队列的操作
 * @author 陈桂林
 *
 */
public class TwoStackOneList {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}
	//每次出栈的时候先检测栈2是否为空，不为空就先清空栈
	public int pop() {
		if(!stack2.isEmpty()){
            return stack2.pop();
		}
        else{
            while(!stack1.isEmpty()){
                int temp=stack1.pop();
                stack2.push(temp);
            }
            return stack2.pop();   
        }
	}

	public static void main(String[] args) {
		TwoStackOneList t = new TwoStackOneList();
		t.push(1);
		t.push(2);
		t.push(3);
		System.out.println(t.pop());
		t.push(4);
		System.out.println(t.pop());
		System.out.println(t.pop());
		t.push(5);
		t.push(6);
		System.out.println(t.pop());
		System.out.println(t.pop());
		System.out.println(t.pop());
	}
}
