import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ListNode head = ListNode.creatList();
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
