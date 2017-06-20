package SwordToOffer.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 输入：一个int数组，判断是否为顺子
 * 0:可以代表任何数字，1-13,
 * Created by zhiyedan on 6/20/17.
 */
public class IsContinuous {
    public boolean solution(int[] numbers) {
            boolean flag = false;
            if(numbers==null || numbers.length==0)
                return flag;
            Set<Integer> set = new HashSet<>();
            int max = 1;
            int min = 13;
            for (int i : numbers) {
                if (i != 0) {
                    //判断是否有非0重复
                    if (!set.add(i)) {
                        return false;
                    }
                    if (i < min) {
                        min = i;
                    }
                    if (i > max) {
                        max = i;
                    }
                }
            }
            if (max - min < numbers.length)
                return true;
            return flag;
    }

}
