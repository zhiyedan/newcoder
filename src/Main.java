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
        InversePairs inversePairs = new InversePairs();
        int count = inversePairs.solution(new int[]{4,3,2,6,1,0});
        System.out.println(count);
    }
}
