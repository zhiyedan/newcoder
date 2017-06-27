package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，其他行以此类推。
 * <p>
 * Created by zhiyedan on 6/27/17.
 */
public class PrintTreeZhi {
    public ArrayList<ArrayList<Integer>> solution(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> nodeList1 = new LinkedList<>();
        LinkedList<TreeNode> nodeList2 = new LinkedList<>();
        // true: -> left to right
        boolean direction = true;
        nodeList1.add(pRoot);
        while (nodeList1.size() != 0 || nodeList2.size() != 0) {
            ArrayList<Integer> tempList = new ArrayList<>();
            if (direction) {
                while (nodeList1.size() != 0) {
                    TreeNode tempNode = nodeList1.poll();
                    tempList.add(tempNode.val);
                    if (tempNode.left != null)
                        nodeList2.add(tempNode.left);
                    if(tempNode.right != null)
                        nodeList2.add(tempNode.right);
                }
                direction = false;
            } else {
                while (nodeList2.size() != 0) {
                    TreeNode tempNode = nodeList2.poll();
                    tempList.add(tempNode.val);
                    if (tempNode.left != null)
                        nodeList1.add(tempNode.left);
                    if(tempNode.right != null)
                        nodeList1.add(tempNode.right);
                }
                Collections.reverse(tempList);
                direction = true;
            }
            result.add(tempList);
        }
        return result;
    }
}
