package SwordToOffer.question;

import java.util.ArrayList;

/**
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序(至少包括两个数)
 * 思路1：s=n(x+(n-1)/2),n为个数，x为起始值。 2<=n<sqrt(2s)
 * Created by zhiyedan on 6/20/17.
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> solution(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(sum<3)
            return result;
        int maxN = (int) Math.sqrt(2*sum);
        for(int i=maxN;i>=2;i--){
            int start = xIsInt(i,sum);
            if(start>0){
                result.add(listFun(start,i));
            }
        }
        return result;
    }
    public int xIsInt(int num,int sum){
        double x = (double) sum/num - (double) (num-1)/2;
        if(x % 1d == 0d)
            return (int)x;
        return -1;
    }

    public ArrayList<Integer> listFun(int start,int num){
        ArrayList<Integer> list = new ArrayList<>(num);
        for(int i=1;i<=num;i++){
            list.add(start++);
        }
        return list;
    }

}
