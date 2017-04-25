import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int [][] matrix = {{1},{2},{3},{4}};
        PrintClockwiseMatrix p = new PrintClockwiseMatrix();
        System.out.println(p.solution(matrix).toString());
    }
}
