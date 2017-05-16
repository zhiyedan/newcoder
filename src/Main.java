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
        FindGreatestSumOfSubArray find = new FindGreatestSumOfSubArray();
        int max = find.solution(new int[]{6,-3,-2,7,-15,1,2,2});
        System.out.println(max);
    }
}
