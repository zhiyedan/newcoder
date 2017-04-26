package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhiyedan on 4/25/17.
 */
public class PrintTreeFromTopToBottom {
    public ArrayList<Integer> solution(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
//        queue.offer()
        //TODO：如果queue里面没有值，queue!=null仍会执行，导致错误。正确的做法为queue.size()!=0
        while (queue.size() != 0) {
            //TODO:是 poll 而不是 peek！
            TreeNode node = queue.poll();
            result.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return result;
    }
}
