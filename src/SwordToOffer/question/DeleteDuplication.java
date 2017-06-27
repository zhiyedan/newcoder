package SwordToOffer.question;

import SwordToOffer.resc.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * <p>
 * Created by zhiyedan on 6/27/17.
 */
public class DeleteDuplication {
    //递归版本!!!
    public ListNode solution3(ListNode pHead) {
        if(pHead==null || pHead.next==null){
            return pHead;
        }
        ListNode curHead = null;
        if(pHead.val == pHead.next.val){
            curHead = pHead.next.next;
            while (curHead!=null && curHead.val == pHead.val){
                curHead = curHead.next;
            }
            return solution3(curHead);
        }else {
            pHead.next = solution3(pHead.next);
            return pHead;
        }
    }

    //简洁版本！！！
    public ListNode solution2(ListNode pHead) {
        ListNode result = new ListNode(-1);
        result.next = pHead;
        ListNode curhead = pHead;
        ListNode prehead = result;
        while (curhead!=null && curhead.next!=null){
            if(curhead.val==curhead.next.val){
                int val = curhead.val;
                while (curhead!=null && curhead.val==val){
                    curhead = curhead.next;
                }
                prehead.next = curhead;
            }else {
                prehead = curhead;
                curhead = curhead.next;
            }
        }
        return result.next;
    }
    //自己写的太复杂，根据bug调整程序，效率太低！
    public ListNode solution(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;
        ListNode result = null;
        ListNode prehead = null;
        ListNode curhead = pHead;
        ListNode tempHead = null;
        while (curhead!=null && curhead.next != null) {
            if (curhead.val == curhead.next.val) {
                tempHead = curhead.next;
                while (tempHead != null && tempHead.val == curhead.val) {
                    tempHead = tempHead.next;
                }
                if (prehead == null) {
                    result = tempHead;
                } else {
                    prehead.next = tempHead;
                }
                curhead = tempHead;
            } else {
                if(prehead==null)
                    result = curhead;
                prehead = curhead;
                curhead = curhead.next;
            }
        }
        return result;
    }
}
