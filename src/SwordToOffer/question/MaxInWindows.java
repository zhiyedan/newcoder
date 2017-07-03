package SwordToOffer.question;

import java.util.ArrayList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * Created by zhiyedan on 6/28/17.
 */
public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if (num == null || num.length == 0 || size > num.length || size<=0)
            return result;
        int endIndex = num.length-size;
        for (int i=0;i<=endIndex;i++){
            int max = num[i];
            for(int j=i+1;j<i+size;j++){
                if(num[j]>max)
                    max = num[j];
            }
            result.add(max);
        }
        return result;
    }
}
