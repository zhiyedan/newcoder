package SwordToOffer.resc;

/**
 * Created by zhiyedan on 4/20/17.
 */
public class ListNode {
    public int val=0;
    public ListNode next = null;
    public ListNode(){}
    public ListNode(int val) {
        this.val = val;
    }
    public static ListNode creatList(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    public static ListNode creatList(int[] array){
        ListNode n1 = new ListNode(array[0]);
        ListNode n2 = new ListNode(array[1]);
        ListNode n3 = new ListNode(array[2]);
        ListNode n4 = new ListNode(array[3]);
        ListNode n5 = new ListNode(array[4]);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }
}
