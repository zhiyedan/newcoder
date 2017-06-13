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
        GetNumberOfK getNumberOfK = new GetNumberOfK();
        int count = getNumberOfK.solution(new int[]{1,2,3,3,3,3},3);
        System.out.println(count);
    }
}
