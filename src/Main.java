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
        GetUglyNumber uglyNumber = new GetUglyNumber();
        for(int i=3;i<10;i++){
        System.out.println(uglyNumber.solution(i));}
    }
}
