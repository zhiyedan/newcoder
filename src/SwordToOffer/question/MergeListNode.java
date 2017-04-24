package SwordToOffer.question;

import SwordToOffer.resc.ListNode;

import java.util.List;

/**
 * 合并两个有序递增的链表
 * Created by zhiyedan on 4/24/17.
 */
public class MergeListNode {
    public ListNode solution1(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode result = head;
        while (list1 != null || list2 != null) {
//           if(list2 == null || list1.val<=list2.val){ 会导致的异常是 list1为空时出现空指针。
            if (list2 == null || (list1 != null && list1.val <= list2.val)) {
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            } else {
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }
        }
        return result.next;
    }
    //递归版本
    public ListNode solution(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode result = null;
        if(list1.val<list2.val){
            result = list1;
            result.next = solution(list1.next,list2);
        }else{
            result = list2;
            result.next = solution(list1,list2.next);
        }
        return result;
    }
}
