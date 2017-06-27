package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 返回结果不同，采用的方法不同，但整体思路相同，均为存队列，取队列。
 * Created by zhiyedan on 4/25/17.
 */
public class PrintTreeFromTopToBottom {
    ArrayList<ArrayList<Integer>> solution2(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> nodeList = new LinkedList<>();
        if(pRoot==null)
            return result;
        nodeList.add(pRoot);
        while (nodeList.size()!=0){
            ArrayList<Integer> tempList = new ArrayList<>();
            int size = nodeList.size();
            //TODO : tip,通过开始的size来控制循环次数！
            for(int i=0;i<size;i++){
                TreeNode node = nodeList.poll();
                tempList.add(node.val);
                if(node.left!=null)
                    nodeList.add(node.left);
                if(node.right!=null)
                    nodeList.add(node.right);
            }
            result.add(tempList);
        }
        return result;
    }
    public static ArrayList<Integer> solution(TreeNode root) {
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
