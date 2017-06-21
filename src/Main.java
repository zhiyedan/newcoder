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

        StrToInt strToInt = new StrToInt();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(strToInt.solution(scanner.nextLine()));
        }
    }
}
