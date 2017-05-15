package SwordToOffer.question;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入n个整数，找出其中最小的K个数
 * Created by zhiyedan on 5/15/17.
 */
public class GetLeastNumbers {

    public ArrayList<Integer> solution2(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input.length < 1 || k > input.length || k < 1)
            return result;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < input.length; i++) {
            if (i >= k) {
                if (input[i] >= stack1.peek())
                    continue;
                //弹出栈顶元素
                stack1.pop();
            }
            while (!stack1.empty() && stack1.peek() > input[i]) {
                stack2.push(stack1.pop());
            }
            stack1.push(input[i]);
            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        while (!stack2.empty()) {
            result.add(stack2.pop());
        }
        return result;
    }
}
