package SwordToOffer.question;

import SwordToOffer.resc.ListNode;

import java.util.List;

/**
 * Created by zhiyedan on 4/24/17.
 * <p>
 * 输入一个链表，反转链表后，输出链表的所有元素
 */
public class ReverseList {
    public ListNode solution(ListNode head) {
        ListNode preNode = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }
        return preNode;
    }

}
