package mianjing.question;
//现在要求输入一个整数n，请你输出斐波那契数列的第n项
/**
 * Created by zhiyedan on 4/18/17.
 */
//如果为递归，重复计算量太大，吃内存，耗时间，使用递推或者循环，动态规划可以很好解决。
public class Fibonacci {
    public int solution(int n){
//        if(n==1 | n==2)
//            return 1;
//        return solution(n-1)+solution(n-2);
        int f1 = 0;
        int f2 = 1;
        if(n<1)
            return n;
        int result = 0;
        for(int i=2;i<=n;i++){
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }
}
