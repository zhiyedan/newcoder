import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        IsPopOrder isPopOrder = new IsPopOrder();
        System.out.println(isPopOrder.solution(new int[]{1,2,3,4,5},new int[] {4,3,5,2,1}));
    }
}
