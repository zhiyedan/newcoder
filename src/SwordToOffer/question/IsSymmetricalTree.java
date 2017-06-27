package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

/**
 * 判断一颗二叉树是不是对称的
 * 思路：左孩子的右子树==右孩子的左子树
 * Created by zhiyedan on 6/27/17.
 */
public class IsSymmetricalTree {
    public boolean solution(TreeNode pRoot){
        if(pRoot==null)
            return true;
        return compare(pRoot.left,pRoot.right);
    }
    public boolean compare(TreeNode leftRoot,TreeNode rightRoot){
        if(leftRoot==null && rightRoot==null)
            return true;
        if(leftRoot==null || rightRoot==null || leftRoot.val!=rightRoot.val)
            return false;
        return compare(leftRoot.left,rightRoot.right) && compare(leftRoot.right,rightRoot.left);
    }
}
