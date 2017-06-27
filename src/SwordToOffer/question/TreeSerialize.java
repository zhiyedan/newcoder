package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

/**
 *
 请实现两个函数，分别用来序列化和反序列化二叉树
 * Created by zhiyedan on 17-6-27.
 */
public class TreeSerialize {
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root==null)
            return "#,";
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str){
        String[] strings = str.split(",");
    }
}
