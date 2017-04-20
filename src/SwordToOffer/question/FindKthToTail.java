package SwordToOffer.question;

import SwordToOffer.resc.ListNode;

/**
 *
 输入一个链表，输出该链表中倒数第k个结点。
 * Created by zhiyedan on 4/20/17.
 */
public class FindKthToTail {
    public ListNode solution(ListNode head, int k) {
        ListNode firstPointer = head;
        ListNode secondPointer = head;
        if(k<1)
            return null;
        for(int i=0;i<k-1;i++){
            if(secondPointer == null || secondPointer.next==null){
                return null;
            }
            secondPointer = secondPointer.next;
        }
        while(secondPointer.next!=null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        return firstPointer;

    }
}
