package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

import java.util.Stack;

/**
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。
 * 例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 * Created by zhiyedan on 7/3/17.
 * <p>
 * 思路：中序遍历，计数器加加
 * 思路2：非递归，stack存储。
 */
public class KthNode {
    private int count = 0;

    TreeNode solution(TreeNode pRoot, int k) {
        if (k <= 0 || pRoot == null)
            return null;
        TreeNode result = recursive(pRoot, k);
        return result;
    }

    private TreeNode recursive(TreeNode pRoot, int k) {
        TreeNode node = null;
        if (pRoot != null){
            //TODO ：处理递归之后返回的结果，如果非空，则直接返回。
            node = recursive(pRoot.left, k);
            if (node != null)
                return node;
            if (++count == k)
                return pRoot;
            node = recursive(pRoot.right, k);
            if (node != null)
                return node;
        }
        return null;
    }
    // 非递归
    TreeNode solution2(TreeNode pRoot,int k){
        if (k <= 0 || pRoot == null)
            return null;
        TreeNode result = null;
        int count = 0;
        TreeNode tempNode = pRoot;
        Stack<TreeNode> stack = new Stack<>();
        //TODO 执行条件很重要！！！
        while (tempNode!=null || !stack.empty()){
            while (tempNode!=null){
                stack.push(tempNode);
                tempNode = tempNode.left;
            }
            tempNode = stack.pop();
            if(++count == k)
                return tempNode;
            tempNode = tempNode.right;

        }

        return result;
    }
}
