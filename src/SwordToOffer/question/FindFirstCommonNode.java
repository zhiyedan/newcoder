package SwordToOffer.question;

import SwordToOffer.resc.ListNode;

import java.util.Stack;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * 分析：Y字形，后面的相等，前面有差异。
 * 思路1：压栈，谈栈，找到最后一个相等的。
 * 思路2：hashmap：现将一条链表put进，然后遍历第二条链表。
 * 思路3：先计算两条链表的长度，然后长链表先走len2-len1,最后两条表一起走
 * Created by zhiyedan on 6/13/17.
 */
public class FindFirstCommonNode {
    public ListNode solution(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null || pHead2 == null)
            return null;
        ListNode result = null;
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (pHead1 != null){
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null){
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }
        //TODO: 判断的顺序不能有错，判断是否为空应该在前面！！！
        while ( !stack1.empty() && !stack2.empty()  && stack1.peek() == stack2.peek()){
            result = stack1.pop();
            stack2.pop();
        }
        return result;
    }
}
