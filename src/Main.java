import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int [][] matrix = {{1,2,3,0},{4,5,6,0},{7,8,9,0},{10,11,12,13}};
        PrintClockwiseMatrix p = new PrintClockwiseMatrix();
        System.out.println(p.solution(matrix).toString());
    }
}
