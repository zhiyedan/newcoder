package SwordToOffer.resc;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode createExampleTree() {
        TreeNode root = new TreeNode(10);
        TreeNode left1 = new TreeNode(5);
        TreeNode right1 = new TreeNode(12);
        TreeNode left11 = new TreeNode(4);
        TreeNode left12 = new TreeNode(7);
        TreeNode right11 = new TreeNode(6);
        root.left = left1;
        root.right = right1;
        left1.left = left11;
        left1.right = left12;
        right1.left = right11;
        return root;
    }
}
