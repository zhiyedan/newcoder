package SwordToOffer.question;

import SwordToOffer.resc.ListNode;

/**
 *
 * 一个链表中包含环，请找出该链表的环的入口结点。
 * 思路：（这是一道数学题）
 第一步，找环中相汇点。分别用p1，p2指向链表头部，p1每次走一步，p2每次走二步，直到p1==p2找到在环中的相汇点。
 第二步，找环的入口。接上步，当p1==p2时，p2所经过节点数为2x,p1所经过节点数为x,设环中有n个节点,p2比p1多走一圈有2x=n+x;
 n=x;可以看出p1实际走了一个环的步数，再让p2指向链表头部，p1位置不变，p1,p2每次走一步直到p1==p2;
 此时p1指向环的入口。

 尾巴长为m，环长为n，第一次相遇为m+k，则m+k=x=n, p1走n-k=m,p2从头走m，正好两者在环入口相遇。
 * Created by zhiyedan on 6/27/17.
 */
public class EntryNodeOfLoop {
    public ListNode solution(ListNode pHead){
        ListNode resultPhead = null;
        if(pHead==null)
            return resultPhead;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while (p1!=null && p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1==p2){
                p2 = pHead;
                while (p1!=p2){
                    p1= p1.next;
                    p2 = p2.next;
                }
                resultPhead = p1;
                return resultPhead;
            }
        }
        return resultPhead;
    }
}
