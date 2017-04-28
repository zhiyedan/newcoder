package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径
 * <p>
 * 需要解决的问题是如何弹出arrayList里面的数据
 * 注意：在递归函数中，子树处理所需要到的数据只与父树有关，所以只能通过递归输入参数来传入，而非通过全局变量
 * Created by zhiyedan on 4/26/17.
 */
public class FindTreePath {
    public ArrayList<ArrayList<Integer>> solution(TreeNode root, int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        findPath(root,target,list,result);
        return result;
    }
    public void findPath(TreeNode root,int target,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result){
        if(root==null)
            return;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left==null && root.right==null){
            //TODO 易错： result.add(list);
            result.add(new ArrayList<Integer>(list));
        }
        findPath(root.left,target,list,result);
        findPath(root.right,target,list,result);
        list.remove(list.size()-1);
    }
    public ArrayList<ArrayList<Integer>> solution1(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        recursive(root, 0, arrayList, target, result);
        return result;
    }

    public void recursive(TreeNode root, int sum, ArrayList<TreeNode> arrayList, int target, ArrayList<ArrayList<Integer>> result) {
        if (root == null || root.val + sum > target || root.val + sum == target && (root.left != null || root.right != null)) {
            return;
        } else {
            ArrayList<TreeNode> newArrayList = new ArrayList<>(arrayList);
            newArrayList.add(root);
            sum += root.val;
            if (sum == target && root.left == null && root.right == null) {
                result.add(copyToResult(newArrayList));
                return;
            }
            recursive(root.left, sum, newArrayList, target, result);
            recursive(root.right, sum, newArrayList, target, result);
        }
    }

    public ArrayList<Integer> copyToResult(ArrayList<TreeNode> arrayList) {
        ArrayList<Integer> result = new ArrayList<>();
        for (TreeNode root : arrayList)
            result.add(root.val);
        return result;
    }

}
