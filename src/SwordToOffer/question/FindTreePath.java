package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径
 * <p>
 * Created by zhiyedan on 4/26/17.
 */
public class FindTreePath {
    public int sum = 0;
    public Stack<TreeNode> stack = new Stack<>();

    public ArrayList<ArrayList<Integer>> solution(TreeNode root, int target) {
        if (root == null)
            return null;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        stack.add(root);
        recursive(root, target, result);
        return result;
    }

    public void recursive(TreeNode root, int target, ArrayList<ArrayList<Integer>> result) {
        stack.add(root);
        sum += root.val;
        if (root.left == null && root.right == null)

            if (sum == target)

    }
}
