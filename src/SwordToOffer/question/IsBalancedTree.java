package SwordToOffer.question;

<<<<<<< HEAD
import SwordToOffer.resc.TreeNode;

/**
 * 判断是否为一颗平衡二叉树（可以为空，左右子树都是平衡二叉树，左右子树的深度不超过一）
 * 思路1：自下而上遍历，不够简洁。
 * 思路2：后续遍历
 * Created by zhiyedan on 6/13/17.
 */
public class IsBalancedTree {
    public boolean solution(TreeNode root) {
        if (root==null)
            return true;
        if(Math.abs(depthTree(root.right)-depthTree(root.left))>1)
            return false;
        return solution(root.left)&& solution(root.right);
    }
    public int depthTree(TreeNode root){
        if (root==null)
            return 0;
        return Math.max(depthTree(root.left),depthTree(root.right))+1;
=======

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
>>>>>>> origin/master
    }
}
