package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径
 * <p>
 * 需要解决的问题是如何弹出stack里面的数据
 * 注意：在递归函数中，子树处理所需要到的数据只与父树有关，所以只能通过递归输入参数来传入，而非通过全局变量
 * Created by zhiyedan on 4/26/17.
 */
public class FindTreePath {
//    public int sum = 0;
//    public Stack<TreeNode> stack = new Stack<>();

    public ArrayList<ArrayList<Integer>> solution(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        int sum=0;
        ArrayList<TreeNode> stack = new ArrayList<>();
        recursive(root,sum,stack,target, result);
        return result;
    }

    public void recursive(TreeNode root, int sum,ArrayList<TreeNode> stack,int target, ArrayList<ArrayList<Integer>> result) {
        if (root == null)
            return;
        if (root.val + sum > target) {
            return;
        } else if (root.val + sum == target) {
            //判断是否为叶子节点
            if (root.left == null && root.right == null){
                //TODO 每次添加TreeNode时都需要新建一个ArrayList
                ArrayList<TreeNode> newArrayList = new ArrayList<>(stack);
                newArrayList.add(root);
                result.add(copyToResult(newArrayList));
            }
            else
                return;
        } else {
            ArrayList<TreeNode> newArrayList = new ArrayList<>(stack);
            newArrayList.add(root);
            int newSum = sum+root.val;
            if(root.left!=null)
                recursive(root.left,newSum,newArrayList,target,result);
            if(root.right!=null)
                recursive(root.right,newSum,newArrayList,target,result);
        }
    }

    public ArrayList<Integer> copyToResult(ArrayList<TreeNode> stack) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(TreeNode root : stack){
            arrayList.add(root.val);
        }
        return arrayList;
    }
}
