import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;
import SwordToOffer.resc.TreeNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        scan();
//        listNodefun();
        treeNodeFun();
    }
    public static void scan(){
        IsNumeric isNumeric = new IsNumeric();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String string = scanner.nextLine();
//            System.out.println(string.matches("[+-]?[0-9]*(.[0-9]+)?([eE][+-]?[0-9]+)?"));
            char[] chars = string.toCharArray();
            System.out.println(isNumeric.solution2(chars));
        }
    }
    public static  void listNodefun(){
        DeleteDuplication d = new DeleteDuplication();
        ListNode head = ListNode.creatList();
        ListNode.showList(head);
        ListNode result = d.solution3(head);
        ListNode.showList(result);
    }
    public static void treeNodeFun(){
        TreeNode phead = TreeNode.createExampleTree();
        String treeString = TreeSerialize.Serialize(phead);
        System.out.println(treeString);
        TreeNode treeNOde = TreeSerialize.Deserialize(treeString);

    }
}
