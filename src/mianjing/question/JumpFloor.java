package mianjing.question;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级,n阶台阶，共有多少种跳法？
 * 此题类似于fibonacci数列，f(n) = f(n-1)+f(n-2);
 * Created by zhiyedan on 4/19/17.
 */
public class JumpFloor {
    public int solution(int n){
        if(n<=2)
            return n;
        int f1 = 1;
        int f2 = 2;
        int result = 0;
        for(int i=3;i<=n;i++){
            result = f1+f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }
}
