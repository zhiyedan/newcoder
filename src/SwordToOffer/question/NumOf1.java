package SwordToOffer.question;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 * Created by zhiyedan on 4/20/17.
 */
public class NumOf1 {
    public int solution(int n) {
        int count=0;
        while(n!=0){
            n &= n-1;
            count++;
        }
        return count;
    }
}
