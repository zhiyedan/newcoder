package SwordToOffer.question;

import SwordToOffer.resc.RandomListNode;

/**
 * 输入一个复杂链表
 * （每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点）
 * 返回结果为复制后复杂链表的head
 * Created by zhiyedan on 4/28/17.
 */
public class RandomListNodeClone {
    public RandomListNode Clone(RandomListNode pHead) {
        RandomListNode result = new RandomListNode(-1);
        RandomListNode resulttemp = result;
        RandomListNode pHeadtemp = pHead;
        while (pHead != null) {
            RandomListNode node = new RandomListNode(pHead.label);
            result.next = node;
            result = result.next;
            pHead = pHead.next;
        }
        pHead = pHeadtemp;
        result = resulttemp.next;
        while(pHead != null){
            RandomListNode goalNode = pHead.random;
            int index = findRandomindex(pHeadtemp,goalNode);
            result.random = findGoalNode(resulttemp.next,index);
            pHead = pHead.next;
            result = result.next;
        }
        return pHead == null ? null : resulttemp.next;
    }
    public int findRandomindex(RandomListNode pHead,RandomListNode goalNode){
        int i=0;
        while(pHead!=null){
            if(goalNode == pHead)
                break;
            i++;
            pHead = pHead.next;
        }
        return i;
    }
    public RandomListNode findGoalNode(RandomListNode resultHead,int index){
        for(int i=0;i<index;i++){
            resultHead = resultHead.next;
        }
        return resultHead;
    }
}
