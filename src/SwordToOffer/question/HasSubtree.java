package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构
 * Created by zhiyedan on 4/24/17.
 */
public class HasSubtree {
    public boolean solution(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null)
            return false;
        //不能着急return,如果第一个不匹配，则直接return false。
        if (root1.val == root2.val)
            if (isSubTree(root1, root2))
                return true;
        return solution(root1.left, root2) || solution(root1.right, root2);
    }

    public boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
//        需要考虑root1为空的情况，空指针异常！！！在用到root.val之前一定要判断root是否为空！！！
//        所以这样是错误打：if (root1.val != root2.val)
        if (root1 == null || root1.val != root2.val)
            return false;
        return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    }
}
