import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;
import SwordToOffer.resc.TreeNode;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(isPopOrder.solution(new int[]{1,2,3,4,5},new int[] {4,3,5,1,2}));
        VerifySquenceOfBST verifySquenceOfBST = new VerifySquenceOfBST();
        System.out.println(verifySquenceOfBST.solution(new int[] {4,8,6,12,16,14,10}));
    }
}
