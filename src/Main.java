import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;
import SwordToOffer.resc.TreeNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        TreeNode root = TreeNode.createExampleTree();
        BSTConvertList bst = new BSTConvertList();
        TreeNode result = bst.solution(root);
        while (result!=null){
            System.out.println(result.val);
            result = result.right;
        }
    }
}
