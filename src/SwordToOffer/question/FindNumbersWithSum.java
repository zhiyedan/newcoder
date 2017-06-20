package SwordToOffer.question;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 输出：输出两个数，小的先输出。
 *
 * 思路：两个指针，夹击。
 * point: 两个数组差距越大，成绩越小，所以找到第一个即为乘积最小的。
 * Created by zhiyedan on 6/20/17.
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> solution(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>(2);
        if (array == null || array.length < 2)
            return result;
        int begin = 0;
        int end = array.length - 1;
        while (begin < end) {
            int tempSum = array[begin] + array[end];
            if (tempSum > sum) {
                end--;
            } else if (tempSum < sum) {
                begin++;
            } else {
                result.add(array[begin]);
                result.add(array[end]);
                break;
            }
        }
        return result;
    }
}
