package SwordToOffer.question;


import SwordToOffer.resc.TreeNode;

/**
 * 判断是否为平衡二叉树。空：true， 左右子树均为平衡二叉树。左右子树的深度差不能大于1.
 * 采用后序遍历。
 * Created by zhiyedan on 17-6-14.
 */
public class IsBalancedTree {
    public boolean solution(TreeNode root){
        if(root == null)
            return true;
        if(!solution(root.left) || !solution(root.right))
            return false;
        if(Math.abs(depth(root.left)-depth(root.right))>1)
            return false;
        return true;
    }
    public int depth(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
