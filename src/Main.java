import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;
import SwordToOffer.resc.TreeNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String a = "32";
        String b = "3653";
        PrintMinNumber printMinNumber = new PrintMinNumber();
//        System.out.println(a.compareTo(b));
//        System.out.println(printMinNumber.stringComparator(a,b));
        System.out.println(printMinNumber.solution(new int[]{3,32,321}));
    }
}
