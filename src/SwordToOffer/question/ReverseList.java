package SwordToOffer.question;

import SwordToOffer.resc.ListNode;

import java.util.List;

/**
 * Created by zhiyedan on 4/24/17.
 *
 * 输入一个链表，反转链表后，输出链表的所有元素
 */
public class ReverseList {
    public ListNode solution(ListNode head){
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode preNode = null;
        ListNode nextNode = head.next;
        //最后一个元素不能链接前面的链表。。。。。。。 输入为 1 2 3 4 5 输出为5
        while(nextNode != null){
            head.next = preNode;
            preNode = head;
            head = nextNode;
            nextNode = nextNode.next;
        }
        return head;
    }

}
