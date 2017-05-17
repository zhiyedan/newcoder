package SwordToOffer.question;

/**
 * Created by zhiyedan on 5/17/17.
 */
public class NumberOf1Between1AndN {
    public int solution(int n) {
        int result = 0;
        for(int i=1;i<=n;i++){
            result += count1(i);
        }
        return result;
    }
    public int count1(int n){
        int count =0;
        while(n>0){
            if(n%10==1)
                count++;
            n = n/10;
        }
        return count;
    }

}
