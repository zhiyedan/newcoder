package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向
 * 思路：中序遍历的基础上做修改，注意头节点的处理。
 * Created by zhiyedan on 17-5-9.
 */
public class BSTConvertList {
    TreeNode treeHead = null;
    TreeNode preHead = null;

    public TreeNode solution(TreeNode pRootOfTree) {
        recursive(pRootOfTree);
        return treeHead;
    }

    public void recursive(TreeNode root) {
        if (root == null)
            return;
        recursive(root.left);
        //if(root.left==null&& root.right==null) wrong！！！只要是叶子都执行
        if(treeHead==null){
            treeHead = root;
            preHead = root;
        }else {
            preHead.right = root;
            root.left = preHead;
            preHead = root;
        }
        recursive(root.right);

    }

}
