package SwordToOffer.question;
//根据先序和中序 重建二叉树

import SwordToOffer.resc.TreeNode;

import java.util.Arrays;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class BiTreeRebuild {
    public void solution(){
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        afterOutput(fun(pre,in));
    }

    public TreeNode fun(int[] pre, int[] in) {
        if (pre.length == 0)
            return null;
        TreeNode root = new TreeNode(pre[0]);
//        root.val = pre[0];
        if (pre.length != 1) {
            int index = findIndex(in, pre[0]);
            if (index == -1) {
                System.out.println("输入异常");
                return null;
            }
            //copy 数组字串
            int[] nextPre = Arrays.copyOfRange(pre,1,index+1);
            int[] nextLeftIn = Arrays.copyOfRange(in,0,index);
            root.left = fun(Arrays.copyOfRange(pre,1,index+1),Arrays.copyOfRange(in,0,index));
            root.right = fun(Arrays.copyOfRange(pre,index+1,in.length),Arrays.copyOfRange(in,index+1,in.length));
        }
        return root;
    }

    public int findIndex(int[] in, int goal) {
        int index = -1;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == goal) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void afterOutput(TreeNode root){
        if(root != null){
            afterOutput(root.left);
            afterOutput(root.right);
            System.out.print(root.val+"   ");
        }
    }
}




