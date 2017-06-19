package SwordToOffer.question;

import java.util.HashMap;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次.
 * 将num1[0],num2[0]设置为返回结果
 * Created by zhiyedan on 17-6-14.
 */
public class FindNumsAppearOnce {
    public void solution(int[] array, int num1[], int num2[]) {
        boolean flag = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        for (int i : map.keySet()) {
            if(map.get(i)==1){
                if(flag){
                    num2[0] = i;
                }else {
                    num1[0] = i;
                    flag = true;
                }
            }
        }
    }
}
