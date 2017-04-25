package SwordToOffer.question;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数
 * 思路：创建一个minStack,存放当前堆栈最小元素
 * <p>
 * Created by zhiyedan on 4/25/17.
 */
public class MinOfStack {
    Stack<Integer> dataStack = new Stack();
    Stack<Integer> minStack = new Stack();

    public void push(int node) {
        dataStack.push(node);
        if(minStack.empty()){
            minStack.push(node);
        }else {
            int val = minStack.peek()>node?node:minStack.peek();
            minStack.push(val);
        }
    }

    public void pop() {
        if (dataStack == null) {
            System.out.println("the stack is empty");
        }
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
