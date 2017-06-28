package SwordToOffer.question;

import SwordToOffer.resc.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * Created by zhiyedan on 17-6-27.
 */
public class TreeSerialize {
    public static String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null)
            return "#,";
        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    public static TreeNode Deserialize(String str) {
        String[] strings = str.split(",");
        if (str == null || str.equals("")) {
            return null;
        }
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(strings));
        //test
        System.out.println(list);
        TreeNode root = recursive(list);
        return root;
    }

    public static TreeNode recursive(LinkedList<String> list) {
        if (list.size() == 0)
            return null;
        String str = list.poll();
        //TODO: == 会出错，而 equals() 就不会出错
        if (str.equals("#"))
            return null;
        int val = Integer.parseInt(str);
        //test
        System.out.println(val);
        TreeNode node = new TreeNode();
        node.val = val;
        node.left = recursive(list);
        node.right = recursive(list);
        return node;
    }
}
