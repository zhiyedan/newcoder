package SwordToOffer.question;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 * Created by zhiyedan on 4/20/17.
 *
 *  2^11 = 2^1 * 2^2 * 2^8
    2^1011 = 2^0001 * 2^0010 * 2^1000
 */
public class Power {
    public double solution(double base,int exponent) throws Exception {
        int n = Math.abs(exponent);
        if(base == 0) {
            throw new Exception("fraction can't be 0");
        }
        double result = 1;
        //TODO 奇数和偶数的区别
        while(n!=0){
            if((n&1)== 1){
                result *= base;
            }
            base *= base;
            System.out.println("n="+n+" base="+base);
            n >>= 1;
        }
        return exponent<0?(1/result):result;
    }
}
