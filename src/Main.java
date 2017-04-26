import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;
import SwordToOffer.resc.TreeNode;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(isPopOrder.solution(new int[]{1,2,3,4,5},new int[] {4,3,5,1,2}));
        TreeNode root = TreeNode.createExampleTree();
        PrintTreeFromTopToBottom p = new PrintTreeFromTopToBottom();
        System.out.println(p.solution(root).toString());
    }
}
