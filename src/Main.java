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
        FindNumsAppearOnce findNumsAppearOnce = new FindNumsAppearOnce();
        int [] a = new int[1];
        int [] b = new int[1];
        findNumsAppearOnce.solution(new int []{2,4,3,6,3,2,5,5},a,b);
        System.out.println(a[0]);
        System.out.println(b[0]);
    }
}
