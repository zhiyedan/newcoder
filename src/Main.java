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
        MatchPattern matchPattern = new MatchPattern();
        char[] str = "bcbbabab".toCharArray();
        char[] pattern = ".*a*a".toCharArray();
        System.out.println(matchPattern.solution(str,pattern));
    }
}
