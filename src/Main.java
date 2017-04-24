import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ListNode head1 = ListNode.creatList();
        ListNode head2 = ListNode.creatList(new int[]{0,2,5,9,10});
        MergeListNode mergeListNode = new MergeListNode();
        mergeListNode.solution(head1,head2);
        while(head1!=null){
            System.out.println(head1.val);
            head1 = head1.next;
        }
    }
}
