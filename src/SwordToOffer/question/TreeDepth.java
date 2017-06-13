package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

/**
 * 求二叉树的深度
 * Created by zhiyedan on 6/13/17.
 */
public class TreeDepth {
    public int solution(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(solution(root.left),solution(root.right))+1;
    }
}
