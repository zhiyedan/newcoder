package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 * Created by zhiyedan on 4/24/17.
 */
public class MirrorTree {
    public void solution(TreeNode root){
        if(root==null || (root.left==null && root.right==null))
            return;
        solution(root.left);
        solution(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

    }
}
